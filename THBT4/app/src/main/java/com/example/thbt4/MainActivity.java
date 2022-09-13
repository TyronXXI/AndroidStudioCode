package com.example.thbt4;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnOpen=(Button)
                findViewById(R.id.btnOpenProfileActivity);
        btnOpen.setOnClickListener(new
                                           View.OnClickListener() {
                                               public void onClick(View arg0) {
                                                   doOpenProfileActivity();
                                               }
                                           });
    }
    public void doOpenProfileActivity()
    {
        Intent myIntent=new Intent(MainActivity.this, ProfileActivity.class);
        startActivity(myIntent);
    }

}