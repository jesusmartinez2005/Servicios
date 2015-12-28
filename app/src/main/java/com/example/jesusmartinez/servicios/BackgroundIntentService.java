package com.example.jesusmartinez.servicios;

import android.app.IntentService;
import android.content.Intent;

/**
 * Created by jesusmartinez on 28/12/15.
 */
public class BackgroundIntentService extends IntentService {

    public BackgroundIntentService(String name) {
        super(name);
    }

    @Override
    protected void onHandleIntent(Intent intent) {

    }
}
