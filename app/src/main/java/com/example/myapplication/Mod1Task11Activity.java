package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Mod1Task11Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mod3_s11);

        ImageButton imageButtonApple = findViewById(R.id.imageButtonApple);
        ImageButton imageButtonWifi = findViewById(R.id.imageButtonWifi);

        imageButtonApple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Butonul Apple", Toast.LENGTH_LONG).show();
            }
        });

        imageButtonWifi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Butonul WiFi", Toast.LENGTH_LONG).show();
            }
        });
    }
}
