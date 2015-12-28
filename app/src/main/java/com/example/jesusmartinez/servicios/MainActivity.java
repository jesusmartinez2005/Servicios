package com.example.jesusmartinez.servicios;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(MainActivity.this, BackgroundService.class);
        startService(intent);


        Intent intent2=new Intent(MainActivity.this,BackgroundBinded.class);
        bindService(intent2,mconnection,BIND_AUTO_CREATE);
    }

    //conexion con el servicio

    private BackgroundBinded serviceRef;

    private ServiceConnection mconnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            serviceRef = ((BackgroundBinded.Mybinder)service).getService();


        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            serviceRef=null;
        }
    };


}
