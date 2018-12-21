package com.example.machenike.mydemo.app;

import android.app.Application;

public class MyApp extends Application {
    public static MyApp sMyApp;
    @Override
    public void onCreate() {
        super.onCreate();
        sMyApp=this;
    }
    public static MyApp getMyApp(){
        return sMyApp;
    }
}
