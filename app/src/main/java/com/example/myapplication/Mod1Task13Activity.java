package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class Mod1Task13Activity extends AppCompatActivity {
    private Switch switchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mod3_s13);

        switchButton = findViewById(R.id.switchButton);

        switchButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(Mod1Task13Activity.this, "Switch is ON", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Mod1Task13Activity.this, "Switch is OFF", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
