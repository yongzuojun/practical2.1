package com.example.user.practical2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
     EditText editTxt;
    EditText editText2;
     Button sendBut;
     String name;
    String id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTxt = (EditText) findViewById(R.id.nametxt);
        editText2 = (EditText) findViewById(R.id.idtxt);
        sendBut = (Button) findViewById(R.id.sendButton);


    }
    public void sendMessage(View view){
        //Log.d("Main Activity","Button clicked");
        name = editTxt.getText().toString();
        id = editText2.getText().toString();
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("NAME", name);
        intent.putExtra("ID", id);
        startActivity(intent);
    }
}
