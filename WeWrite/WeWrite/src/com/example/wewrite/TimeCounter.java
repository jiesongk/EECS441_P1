package com.example.wewrite;

public class TimeCounter implements Runnable
{
  private long lastSendTime;

  @Override
  public void run()
  {
    lastSendTime = System.currentTimeMillis();
    while(true){
     // if (System.currentTimeMillis() - lastSendTime > 1000)
        //sendEvents();
    }
  }

}
