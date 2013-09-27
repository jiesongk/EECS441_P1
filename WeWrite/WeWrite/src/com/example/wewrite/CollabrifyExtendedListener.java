package com.example.wewrite;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.util.Log;
import edu.umich.imlc.android.common.Utils;
import edu.umich.imlc.collabrify.client.CollabrifyAdapter;
import edu.umich.imlc.collabrify.client.CollabrifyClient;
import edu.umich.imlc.collabrify.client.CollabrifySession;
import edu.umich.imlc.collabrify.client.exceptions.CollabrifyException;

public class CollabrifyExtendedListener extends CollabrifyAdapter{
  final SessionActivity activity;
  
  CollabrifyExtendedListener(SessionActivity activity){
    this.activity = activity;
  }
      @Override
      public void onDisconnect()
      {
        Log.i(activity.TAG, "disconnected");
        activity.runOnUiThread(new Runnable()
        {

          @Override
          public void run()
          {
            activity.newSessionButton.setText("Create");
            activity.joinSessionButton.setText("Join");
            activity.ownerOfSession = false;
          }
        });
      }

      @Override
      public void onReceiveEvent(final long orderId, int subId,
          String eventType, final byte[] data)
      {
        Utils.printMethodName(activity.TAG);
        Log.d(activity.TAG, "RECEIVED SUB ID:" + subId);
        activity.runOnUiThread(new Runnable()
        {
          @Override
          public void run()
          {
            Utils.printMethodName(activity.TAG);
            String message = new String(data);
          //  broadcastedText.setText(message);
          }
        });
      }

      @Override //OK
      public void onReceiveSessionList(final List<CollabrifySession> sessionList)
      {
        if( sessionList.isEmpty() )
        {
          Log.i(activity.TAG, "No session available");
          return;
        }
        List<String> sessionNames = new ArrayList<String>();
        for( CollabrifySession s : sessionList )
        {
          sessionNames.add(s.name());
        }
        final AlertDialog.Builder builder = new AlertDialog.Builder(
            activity);
        builder.setTitle("Choose Session").setItems(
            sessionNames.toArray(new String[sessionList.size()]),
            new DialogInterface.OnClickListener()
            {
              @Override
              public void onClick(DialogInterface dialog, int which)
              {
                try
                {
                  activity.sessionId = sessionList.get(which).id();
                  activity.sessionName = sessionList.get(which).name();
                  activity.myClient.joinSession(activity.sessionId, null);
                }
                catch( CollabrifyException e )
                {
                  Log.e(activity.TAG, "error", e);
                }
              }
            });

        activity.runOnUiThread(new Runnable()
        {

          @Override
          public void run()
          {
            builder.show();
          }
        });
      }

      @Override //OK
      public void onSessionCreated(long id)
      {
        Log.i(activity.TAG, "Session created, id: " + id);
        activity.sessionId = id;
        activity.runOnUiThread(new Runnable()
        {

          @Override
          public void run()
          {
            activity.newSessionButton.setText(activity.sessionName);
            activity.ownerOfSession = true;
          }
        });
      }

      @Override
      public void onError(CollabrifyException e)
      {
        Log.e(activity.TAG, "error", e);
      }

      @Override //OK
      public void onSessionJoined(long maxOrderId, long baseFileSize)
      {
        Log.i(activity.TAG, "Session Joined");
        if( baseFileSize > 0 )
        {
          //initialize buffer to receive base file
          activity.baseFileReceiveBuffer = new ByteArrayOutputStream((int) baseFileSize);
        }
        activity.runOnUiThread(new Runnable()
        {

          @Override
          public void run()
          {
            activity.joinSessionButton.setText(activity.sessionName);
            activity.ownerOfSession = false;
          }
        });
      }

      /*
       * (non-Javadoc)
       * 
       * @see
       * edu.umich.imlc.collabrify.client.CollabrifyAdapter#onBaseFileChunkRequested
       * (long)
       */
      @Override
      public byte[] onBaseFileChunkRequested(long currentBaseFileSize)
      {
        // read up to max chunk size at a time
        byte[] temp = new byte[CollabrifyClient.MAX_BASE_FILE_CHUNK_SIZE];
        int read = 0;
        try
        {
          read = activity.baseFileBuffer.read(temp);
        }
        catch( IOException e )
        {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
        if( read == -1 )
        {
          return null;
        }
        if( read < CollabrifyClient.MAX_BASE_FILE_CHUNK_SIZE )
        {
          // Trim garbage data
          ByteArrayOutputStream bos = new ByteArrayOutputStream();
          bos.write(temp, 0, read);
          temp = bos.toByteArray();
        }
        return temp;
      }

      /*
       * (non-Javadoc)
       * 
       * @see
       * edu.umich.imlc.collabrify.client.CollabrifyAdapter#onBaseFileChunkReceived
       * (byte[])
       */
      @Override
      public void onBaseFileChunkReceived(byte[] baseFileChunk)
      {
        try
        {
          if( baseFileChunk != null )
          {
            activity.baseFileReceiveBuffer.write(baseFileChunk);
          }
          else
          {
            activity.runOnUiThread(new Runnable()
            {
              @Override
              public void run()
              {
                activity.broadcastedText.setText(activity.baseFileReceiveBuffer.toString());
              }
            });
            activity.baseFileReceiveBuffer.close();
          }
        }
        catch( IOException e )
        {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
      }
     
      /*
       * (non-Javadoc)
       * 
       * @see
       * edu.umich.imlc.collabrify.client.CollabrifyAdapter#onBaseFileUploadComplete
       * (long)
       */
      @Override
      public void onBaseFileUploadComplete(long baseFileSize)
      {
        activity.runOnUiThread(new Runnable()
        {

          @Override
          public void run()
          {
            activity. broadcastedText.setText(activity.sessionName);
          }
        });
        try
        {
          activity.baseFileBuffer.close();
        }
        catch( IOException e )
        {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
      }
      }