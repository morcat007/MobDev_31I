package com.example.myapplication;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

public class Mod1Task1Activity extends AppCompatActivity {

    private RelativeLayout bgElement;
    private boolean isColorChanged = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mod3_s1);

        bgElement = findViewById(R.id.activity_mod3_s1);
        Button colorChangeBtn = findViewById(R.id.color_change_button);

        colorChangeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeBackgroundColor();
            }
        });
    }

    private void changeBackgroundColor() {
        int color = ((ColorDrawable) bgElement.getBackground()).getColor();
        if (color == Color.YELLOW) {
            bgElement.setBackgroundColor(Color.GREEN);
        } else {
            bgElement.setBackgroundColor(Color.YELLOW);
        }
    }
}
