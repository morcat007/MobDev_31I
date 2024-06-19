package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

public class Module1Activity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ModuleAdapter moduleAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module1);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<String> taskNames = Arrays.asList(
                "Sarcina 1", "Sarcina 2", "Sarcina 3", "Sarcina 4", "Sarcina 5",
                "Sarcina 6", "Sarcina 7", "Sarcina 8", "Sarcina 9", "Sarcina 10",
                "Sarcina 11", "Sarcina 12", "Sarcina 13", "Sarcina 14",
                "Sarcina 15", "Sarcina 16", "Sarcina 17", "Sarcina 18"
        );

        List<Class<?>> taskActivities = Arrays.asList(
                Mod1Task1Activity.class, Mod1Task2Activity.class, Mod1Task3Activity.class,
                Mod1Task4Activity.class, Mod1Task5Activity.class, Mod1Task6Activity.class,
                Mod1Task7Activity.class, Mod1Task8Activity.class, Mod1Task9Activity.class,
                Mod1Task10Activity.class, Mod1Task11Activity.class, Mod1Task12Activity.class,
                Mod1Task13Activity.class, Mod1Task14Activity.class, Mod1Task15Activity.class,
                Mod1Task16Activity.class, Mod1Task17Activity.class, Mod1Task18Activity.class
        );

        moduleAdapter = new ModuleAdapter(taskNames, taskActivities, this);
        recyclerView.setAdapter(moduleAdapter);
    }
}
