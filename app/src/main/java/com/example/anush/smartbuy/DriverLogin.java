package com.example.anush.smartbuy;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class DriverLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_login);
    }


    public void verification(View v) {
        Intent intent = new Intent(this, DriverVerificationActivity.class);
        startActivity(intent);
    }

    public void login(View v) {
        Intent intent = new Intent(this, DriverAccountActivity.class);
        startActivity(intent);
    }

}
