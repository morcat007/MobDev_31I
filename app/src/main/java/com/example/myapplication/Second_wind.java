package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Second_wind extends AppCompatActivity {
/*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_wind);

        setupButton(R.id.button, Mod1Task1Activity.class);
        setupButton(R.id.button2, Mod1Task2Activity.class);
        setupButton(R.id.button3, Mod1Task3Activity.class);
        setupButton(R.id.button4, Mod1Task4Activity.class);
        setupButton(R.id.button5, Mod1Task5Activity.class);
        setupButton(R.id.button6, Mod1Task6Activity.class);
        setupButton(R.id.button7, Mod1Task7Activity.class);
        setupButton(R.id.button8, Mod1Task8Activity.class);
        setupButton(R.id.button9, Mod1Task9Activity.class);
        setupButton(R.id.button10, Mod1Task10Activity.class);
        setupButton(R.id.buttonMod3S11, Mod1Task11Activity.class);
        setupButton(R.id.buttonMod3S12, Mod1Task12Activity.class);
        setupButton(R.id.buttonMod3S13, Mod1Task13Activity.class);
        setupButton(R.id.buttonMod3S14, Mod1Task14Activity.class);
        setupButton(R.id.buttonMod3S15, Mod1Task15Activity.class);
        setupButton(R.id.buttonMod3S16, Mod1Task16Activity.class);
        setupButton(R.id.buttonMod3S17, Mod1Task17Activity.class);
        setupButton(R.id.buttonMod3S18, Mod1Task18Activity.class);
    }*/

    private void setupButton(int buttonId, Class<?> activityClass) {
        Button button = findViewById(buttonId);
        button.setOnClickListener(v -> startActivity(new Intent(Second_wind.this, activityClass)));
    }
}
