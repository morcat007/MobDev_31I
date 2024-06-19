package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<String> moduleNames = Arrays.asList(
                "Modul 1", "Modul 2", "Modul 3", "Modul 4"
        );

        List<Class<?>> moduleActivities = Arrays.asList(
                Module1Activity.class, Module2Activity.class, Module3Activity.class, Module4Activity.class
        );

        ModuleAdapter adapter = new ModuleAdapter(moduleNames, moduleActivities, this);
        recyclerView.setAdapter(adapter);

        Button githubButton = findViewById(R.id.button_github);
        githubButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://github.com/morcat007");
            }

            private void goLink(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

        TextView helloTextView = findViewById(R.id.textView);
        helloTextView.setText("Salut! Bine ai venit la aplicația mea.");
    }
}
