package com.example.anush.smartbuy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class DriverVerificationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_verification);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Intent in = new Intent(this, DriverLogin.class);
        startActivity(in);
    }

}
