package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class Mod1Task14Activity extends AppCompatActivity {
    private TimePicker timePicker;
    private TextView timeTextView;
    private Button setTimeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mod3_s14);

        timePicker = findViewById(R.id.timePicker);
        timeTextView = findViewById(R.id.timeTextView);
        setTimeButton = findViewById(R.id.setTimeButton);

        timePicker.setIs24HourView(true);

        setTimeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int hour = timePicker.getCurrentHour();
                int minute = timePicker.getCurrentMinute();
                timeTextView.setText(String.format("Este ora: %02d:%02d", hour, minute));
            }
        });
    }
}
