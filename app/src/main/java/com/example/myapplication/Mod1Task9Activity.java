package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Mod1Task9Activity extends AppCompatActivity {

    CheckBox chkJocul, chkbucataria, chkmuzica, chkdesenul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mod3_s9);

        chkJocul = findViewById(R.id.chkJocul);
        chkbucataria = findViewById(R.id.chkbucataria);
        chkmuzica = findViewById(R.id.chkmuzica);
        chkdesenul = findViewById(R.id.chkdesenul);
        Button getBtn = findViewById(R.id.getBtn);

        getBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result = "Selectat";
                if (chkJocul.isChecked()) result += "\nJocul";
                if (chkbucataria.isChecked()) result += "\nBucătăria";
                if (chkmuzica.isChecked()) result += "\nMuzica";
                if (chkdesenul.isChecked()) result += "\nDesenul";

                Toast.makeText(getApplicationContext(), result, Toast.LENGTH_LONG).show();
            }
        });
    }
}
