package com.ssl.musicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void oStart(View view)
    {
        Toast.makeText(this, "started music", Toast.LENGTH_SHORT).show();
        startService(new Intent(this,MyService.class));
    }

    public void oStop(View view)
    {
        Toast.makeText(this, "stoped music", Toast.LENGTH_SHORT).show();
        stopService(new Intent(this,MyService.class));
    }
}