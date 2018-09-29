package com.example.mtayyab.gui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LauncherActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);

        Thread td = new Thread()
        {
            public void run()
            {
                try
                {
                    sleep(5000);
                }
                catch (Exception e)
                {

                }
                finally
                {

                    Intent i=new Intent(LauncherActivity.this,LoginActivity.class);
                    startActivity(i);
                }
            }
        };
        td.start();
    }
}
