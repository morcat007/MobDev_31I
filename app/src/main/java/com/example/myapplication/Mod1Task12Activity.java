package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Mod1Task12Activity extends AppCompatActivity {
    private ToggleButton toggleButton1, toggleButton2;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mod3_s12);

        toggleButton1 = findViewById(R.id.toggleButton1);
        toggleButton2 = findViewById(R.id.toggleButton2);
        submitButton = findViewById(R.id.submitButton);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder result = new StringBuilder();
                result.append("ToggleButton1: ").append(toggleButton1.getText()).append("\n");
                result.append("ToggleButton2: ").append(toggleButton2.getText());
                Toast.makeText(Mod1Task12Activity.this, result.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
