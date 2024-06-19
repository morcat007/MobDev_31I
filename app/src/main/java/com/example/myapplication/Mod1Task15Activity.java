package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class Mod1Task15Activity extends AppCompatActivity {
    private DatePicker datePicker;
    private TextView dateTextView;
    private Button showDateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mod3_s15);

        datePicker = findViewById(R.id.datePicker);
        dateTextView = findViewById(R.id.dateTextView);
        showDateButton = findViewById(R.id.showDateButton);

        showDateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int day = datePicker.getDayOfMonth();
                int month = datePicker.getMonth() + 1;
                int year = datePicker.getYear();
                dateTextView.setText(String.format("Data selectată: %02d/%02d/%d", day, month, year));
            }
        });
    }
}
