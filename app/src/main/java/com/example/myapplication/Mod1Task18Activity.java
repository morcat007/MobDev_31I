package com.example.myapplication;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Mod1Task18Activity extends AppCompatActivity {

    private ProgressBar progressBarHorizontal, progressBarCircular;
    private TextView textViewProgress;
    private Button buttonStart;
    private int progressStatus = 0;
    private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mod3_s18);

        progressBarHorizontal = findViewById(R.id.progressBarHorizontal);
        progressBarCircular = findViewById(R.id.progressBarCircular);
        textViewProgress = findViewById(R.id.textViewProgress);
        buttonStart = findViewById(R.id.buttonStart);

        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressStatus = 0;
                progressBarHorizontal.setProgress(0);
                progressBarCircular.setProgress(0);

                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        while (progressStatus < 100) {
                            progressStatus += 1;

                            handler.post(new Runnable() {
                                @Override
                                public void run() {
                                    progressBarHorizontal.setProgress(progressStatus);
                                    progressBarCircular.setProgress(progressStatus);
                                    textViewProgress.setText(progressStatus + "%");
                                }
                            });
                            try {
                                Thread.sleep(100);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }).start();
            }
        });
    }
}
