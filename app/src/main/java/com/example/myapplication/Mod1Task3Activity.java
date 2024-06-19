package com.example.myapplication;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Mod1Task3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);

        final EditText e1 = findViewById(R.id.et1);
        final EditText e2 = findViewById(R.id.et2);
        final TextView tv5 = findViewById(R.id.tv5);
        Button ib1 = findViewById(R.id.ib1);

        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1 = e1.getText().toString();
                String str2 = e2.getText().toString();

                if (TextUtils.isEmpty(str1)) {
                    e1.setError("Introdu greutatea");
                    e1.requestFocus();
                    return;
                }

                if (TextUtils.isEmpty(str2)) {
                    e2.setError("Introdu înălțimea");
                    e2.requestFocus();
                    return;
                }

                float weight = Float.parseFloat(str1);
                float height = Float.parseFloat(str2) / 100;

                float bmiValue = calculateBMI(weight, height);
                String bmiInterpretation = interpretBMI(bmiValue);

                tv5.setText(String.valueOf(bmiValue) + " - " + bmiInterpretation);
            }
        });
    }

    private float calculateBMI(float weight, float height) {
        return (float) (weight / (height * height));
    }

    private String interpretBMI(float bmiValue) {
        if (bmiValue < 16) {
            return "Greutate scăzută severă";
        } else if (bmiValue < 18.5) {
            return "Greutate scăzută";
        } else if (bmiValue < 25) {
            return "Greutate normală";
        } else if (bmiValue < 30) {
            return "Greutate ridicată";
        } else {
            return "Obezitate";
        }
    }
}
