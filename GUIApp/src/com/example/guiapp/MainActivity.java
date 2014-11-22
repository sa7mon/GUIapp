package com.example.guiapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends Activity {
	public final static String EXTRA_MESSAGE = "com.example.GUIapp.MESSAGE";
	
	public void sendMessage (View view) {
		// Use an Intent to start another activity
		Intent intent = new Intent(this, DisplayMessageActivity.class);
		// Get the edit_message of the EditText to send to the next function
		EditText editText = (EditText) findViewById(R.id.edit_message);
		String message = editText.getText().toString();
		// Send the extra data over to the other activity.
		intent.putExtra(EXTRA_MESSAGE, message);
		// Start the second activity and send the intent with it
		startActivity(intent);
	}
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
