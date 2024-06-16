package com.example.igu_dinamic;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayoutCompat.LayoutParams params =
                new LinearLayoutCompat.LayoutParams(
                        LinearLayoutCompat.LayoutParams.WRAP_CONTENT,
                        LinearLayoutCompat.LayoutParams.WRAP_CONTENT);
//---creați un layout---
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
//---creați o casetă de text---
        TextView tv = new TextView(this);
        tv.setText("Aceasta este o casetă de text");
        tv.setLayoutParams(params);
//---creați un buton---
        Button btn = new Button(this);
        btn.setText("Acesta este un buton");
        btn.setLayoutParams(params);
//---adăugați caseta de text---
        layout.addView(tv);
//---adăugați un buton---
        layout.addView(btn);
//---creați un parametru de aspect pentru layout---
        LinearLayoutCompat.LayoutParams layoutParam =
                new LinearLayoutCompat.LayoutParams(
                        LinearLayoutCompat.LayoutParams.WRAP_CONTENT,
                        LinearLayoutCompat.LayoutParams.WRAP_CONTENT );
        this.addContentView(layout, layoutParam);
        };
    }
