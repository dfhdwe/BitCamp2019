package com.example.sichael.flash;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class LogInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    // Log In Button pressed
    public void toHome(View view) {
        Intent intent = new Intent(this, ServiceProviderHomeActivity.class);
        startActivity(intent);
    }

}
