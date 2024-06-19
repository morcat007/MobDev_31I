package com.example.myapplication;

public class Task {
    private String title;
    private Class<?> activityClass;

    public Task(String title, Class<?> activityClass) {
        this.title = title;
        this.activityClass = activityClass;
    }

    public String getTitle() {
        return title;
    }

    public Class<?> getActivityClass() {
        return activityClass;
    }
}
