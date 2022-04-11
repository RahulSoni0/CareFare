package com.example.razor_api;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.sawolabs.androidsdk.Sawo;

public class Auth_sawo extends AppCompatActivity {
   private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth_sawo);
       btn = findViewById(R.id.btn_login);

       btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               new Sawo(
                       Auth_sawo.this,
                       "2a9e2c8e-c213-45dc-854c-165b41532a88", // your api key
                       "62541300e966b4b7e4caac34MNjGSL94wZrbDP0LLHhsIt2U"  // your api key secret
               ).login(
                       "email", // can be one of 'email' or 'phone_number_sms' or 'both_email_phone'
                       CallbackActivity.class.getName()  // Callback class name
               );
           }
       });






    }
}