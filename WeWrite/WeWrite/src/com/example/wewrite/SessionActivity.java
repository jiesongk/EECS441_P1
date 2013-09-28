package com.example.wewrite;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;

import edu.umich.imlc.collabrify.client.CollabrifyClient;
import edu.umich.imlc.collabrify.client.exceptions.CollabrifyException;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class SessionActivity extends Activity
{
  private static final Level LOGGING_LEVEL = Level.ALL;

  static String TAG = "dummy";
  
  private ArrayList<String> tags = new ArrayList<String>();
  
  private CheckBox withBaseFile;
  private Button undoButton;
  private Button redoButton;
  private Button exitButton;
  EditText editText;
  Button newSessionButton;
  private Button leaveSessionButton;
  Button joinSessionButton;
  
  private String userEmail;
  private String userDisplayName;
  eventHandler handler;
  long sessionId;
  String sessionName;
  Boolean ownerOfSession;
  ByteArrayInputStream baseFileBuffer;
  ByteArrayOutputStream baseFileReceiveBuffer;
  
  
  ProgressDialog dialog;
  
  CollabrifyClient myClient;
  
  private CollabrifyExtendedListener collabrifyListener;
  TextWatcher textWatcher;

  protected TextView broadcastedText;

  
  @Override
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_session);
    
    withBaseFile = (CheckBox) findViewById(R.id.withBaseFileCheckBox);
    
    undoButton = (Button) findViewById(R.id.UndoBT);
    redoButton = (Button) findViewById(R.id.RedoBT);
    exitButton = (Button) findViewById(R.id.ExitBT);
    editText = (EditText) findViewById(R.id.editText);
    newSessionButton = (Button) findViewById(R.id.NewSessionBT);
    leaveSessionButton = (Button) findViewById(R.id.LeaveSessionBT);
    joinSessionButton = (Button) findViewById(R.id.JoinSessionBT);
    
    userEmail = getIntent().getStringExtra("userEmail");
    userDisplayName = getIntent().getStringExtra("userDisplayName");
    ownerOfSession = false;
    
    dialog = new ProgressDialog(this);
    collabrifyListener = new CollabrifyExtendedListener(this);
    handler = new eventHandler(userDisplayName);
    
    boolean getLatestEvent = false;
    
    //setTextWatcher for editText
    textWatcher = new TextWatcher() {
      private String prevS;
      @Override
      public void afterTextChanged(Editable s){}

      @Override
      public void beforeTextChanged(CharSequence s, int start, int count,
          int after)
      {
        prevS = s.toString();
      }

      @Override
      public void onTextChanged(CharSequence s, int start, int before, int count)
      {
        System.out.println(prevS);
        System.out.println(s);
        System.out.println(start);
        System.out.println(before);
        System.out.println(count);

        ProtocalBuffer.Events.Builder builder = ProtocalBuffer.Events.newBuilder();
        builder.setUsername(userDisplayName);
        builder.setInsertCharacters(s.subSequence(start, start+count).toString());
        builder.setInsertLength(count);
        builder.setRemoveCharacters(prevS.subSequence(start, start+before).toString());
        builder.setRemoveLength(before);
        builder.setGlobalStart(start);
        builder.setAfterGlobalOrderId(handler.getGlobalOrderId());
        ProtocalBuffer.Events eventObj = builder.build();
        
        if (myClient != null && myClient.inSession()){
          try
          {
            myClient.broadcast(eventObj.toString().getBytes(), "");
          }
          catch( CollabrifyException e )
          {
            e.printStackTrace();
          }
        }
        
        events event = new events();
        event.setCharacters(builder.getInsertCharacters());
        event.setGlobalCursor(builder.getGlobalStart());
        event.setGlobalIndex(-1);
        event.setInsertLength(count);
        event.setRemovedCharacters(builder.getRemoveCharacters());
        event.setRemoveLength(builder.getRemoveLength());
        event.setUsername(builder.getUsername());
        
        handler.receiveLocal(event);
      }
      
    };
    
    editText.addTextChangedListener(textWatcher);

    // Instantiate client object
    try
    {
      myClient = new CollabrifyClient(this, userEmail, userDisplayName,
          "441fall2013@umich.edu", "XY3721425NoScOpE", getLatestEvent,
          collabrifyListener);
    }
    catch( CollabrifyException e )
    {
      e.printStackTrace();
    }

    tags.add("sample");
    
    //new session OK
    newSessionButton.setOnClickListener(new OnClickListener()
    {

      @Override
      public void onClick(View v)
      {
        try
        {
          Random rand = new Random();
          sessionId = rand.nextInt(Integer.MAX_VALUE);
          sessionName = String.valueOf(sessionId);
          ownerOfSession = true;

          if( withBaseFile.isChecked() )
          {
            // initialize basefile data for this example we will use the session
            // name as the data
            dialog = ProgressDialog.show(SessionActivity.this, "Uploading base file...", "Please wait...", true);

            baseFileBuffer = new ByteArrayInputStream(editText.getText().toString().getBytes());

            myClient.createSessionWithBase(sessionName, tags, null, 5000);
          }
          else
          {
            editText.removeTextChangedListener(textWatcher);
            editText.setText("");
            editText.addTextChangedListener(textWatcher);
            myClient.createSession(sessionName, tags, null, 5000);
          }
          Log.i(TAG, "Session name is " + sessionId);
        }
        catch( CollabrifyException e )
        {
          Log.e(TAG, "error", e);
        }
      }
    });
    
  //join session OK
    joinSessionButton.setOnClickListener(new OnClickListener()
    {

      @Override
      public void onClick(View v)
      {
        try
        {
          myClient.requestSessionList(tags);
        }
        catch( Exception e )
        {
          Log.e(TAG, "error", e);
        }
      }
    });
    
    //leave Session
    leaveSessionButton.setOnClickListener(new OnClickListener()
    {

      @Override
      public void onClick(View v)
      {
        try
        {
          if( myClient.inSession() ){
            myClient.leaveSession(ownerOfSession);
            ownerOfSession = false;
          }
        }
        catch( CollabrifyException e )
        {
          Log.e(TAG, "error", e);
        }
      }
    });
    
    exitButton.setOnClickListener(new OnClickListener()
    {
      
      @Override
      public void onClick(View v)
      {
        finish();
      }
    });
  }


  @Override
  public boolean onCreateOptionsMenu(Menu menu)
  {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.main, menu);
    return true;
  }
}
