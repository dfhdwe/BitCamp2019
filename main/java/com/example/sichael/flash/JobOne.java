package com.example.sichael.flash;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class JobOne extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_one);

    }

    // Show On Map Button pressed
    public void showOnMap(View view) {
        Intent intent = new Intent(this, JobOneMapActivity.class);
        startActivity(intent);
    }

}
