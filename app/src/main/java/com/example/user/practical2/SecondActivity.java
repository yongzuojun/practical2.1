package com.example.user.practical2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private Button outputBut;
    private TextView outputtxt;
    private TextView outputname;
    private TextView outputid;
    String name;
    String ID;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        outputname = (TextView) findViewById(R.id.outputName);
        outputid = (TextView) findViewById(R.id.outputID);
        outputBut = (Button) findViewById(R.id.outputButton);
        Intent intent = getIntent();
        Bundle extras = getIntent().getExtras();
        if (!extras.isEmpty()) {
            name = (String) extras.getString("NAME");
            ID = (String) extras.getString("ID");
            outputname.setText(name);
            outputid.setText(ID);
        }
    }
    public void closeActivity(View view){
        finish();

    }
}
