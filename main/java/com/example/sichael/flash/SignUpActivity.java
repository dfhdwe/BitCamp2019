package com.example.sichael.flash;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SignUpActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

    }

    // Sign Up Button pressed
    public void signUp(View view) {
        Intent intent = new Intent(this, UserHomeActivity.class);
        startActivity(intent);
    }
}
