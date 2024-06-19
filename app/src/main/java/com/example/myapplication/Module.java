package com.example.myapplication;

public class Module {

    private String name;
    private Class<?> activityClass;

    public Module(String name, Class<?> activityClass) {
        this.name = name;
        this.activityClass = activityClass;
    }

    public String getName() {
        return name;
    }

    public Class<?> getActivityClass() {
        return activityClass;
    }
}
