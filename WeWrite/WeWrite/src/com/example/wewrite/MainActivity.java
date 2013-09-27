package com.example.wewrite;

import edu.umich.imlc.collabrify.client.CollabrifyClient;
import edu.umich.imlc.collabrify.client.CollabrifyListener;
import edu.umich.imlc.collabrify.client.exceptions.CollabrifyException;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity
{ 
  @Override
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    
    Button logInButton= (Button) findViewById(R.id.LoginBT);
    logInButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          EditText userEmailET   = (EditText)findViewById(R.id.UserEmailET);
          String userEmail = userEmailET.getText().toString();
          EditText userDisplayNameET = (EditText)findViewById(R.id.UserDisplayNameET);
          String userDisplayName = userDisplayNameET.getText().toString();
          
          Intent intent = new Intent(getApplicationContext(), SessionActivity.class);
          intent.putExtra("userEmail", userEmail);
          intent.putExtra("userDisplayName", userDisplayName);
          startActivity(intent);
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
