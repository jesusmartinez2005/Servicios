package com.example.jesusmartinez.servicios;

import android.os.AsyncTask;

/**
 * Created by jesusmartinez on 28/12/15.
 */
public class MyAsyncTask extends AsyncTask <String,Integer,String>{

    int progreso;
    @Override
    protected String doInBackground(String... params) {
        publishProgress(progreso);
        return null;
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
    }

    @Override
    protected void onProgressUpdate(Integer... values) {

        super.onProgressUpdate(values);
    }
}
