package com.nrfox.mrfox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class LoginActivity extends AppCompatActivity {

    Button log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        log = (Button) findViewById(R.id.log);

    }


    public void goScrolling(View view){


        Intent intent = new Intent(LoginActivity.this, ScrollingActivity.class);
        startActivity(intent);
    }
}
