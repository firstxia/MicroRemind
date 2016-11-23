package com.xialm.microremind.view;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

public class App extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context=this;
    }

    public static Context getContext() {
        return context;
    }
}
