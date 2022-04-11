package com.example.razor_api;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.sawolabs.androidsdk.ConstantsKt;

public class CallbackActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_callback);


        Toast.makeText(this,"Logged in successfully",Toast.LENGTH_SHORT).show();
        Intent intent = getIntent();
        String message = intent.getStringExtra(ConstantsKt.LOGIN_SUCCESS_MESSAGE);
        Log.i("payload:",message);
        Intent i = new Intent(CallbackActivity.this , MainActivity.class);
        startActivity(i);

    }
}