package com.example.ktgk;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Button btnOpen=(Button)
                findViewById(R.id.btnBaiHat);
        btnOpen.setOnClickListener(new
                                           View.OnClickListener() {
                                               public void onClick(View arg0) {
                                                   doOpenChildActivity();
                                               }
                                           });
    }
    public void doOpenChildActivity()
    {
        Intent myIntent=new Intent(ProfileActivity.this, BaiHatActivity.class);
        startActivity(myIntent);
    }

}
