package com.example.jesusmartinez.servicios;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by jesusmartinez on 28/12/15.
 */
public class BackgroundBinded extends Service {

    private Mybinder mbinder = new Mybinder();

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return mbinder;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }


    public class Mybinder extends Binder {
        BackgroundBinded getService() {
            return BackgroundBinded.this;
        }
    }



}
