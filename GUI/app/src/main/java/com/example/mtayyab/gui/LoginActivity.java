package com.example.mtayyab.gui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText email=(EditText) findViewById(R.id.etxt1);
        final EditText password=(EditText) findViewById(R.id.etxt2);
        Button button1=(Button) findViewById(R.id.btn1);
        Button button2=(Button) findViewById(R.id.btn2);

        button1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (email.getText().toString().equals(""))
                    email.setError("Invalid Email");
                if ((password.getText().toString().equals(""))&&(password.getText().toString().length()<=5))
                    password.setError("Invalid Password");
                else
                {
                    Intent intent1 = new Intent(LoginActivity.this, HomeActivity.class);
                    startActivity(intent1);
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent2=new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(intent2);
            }
        });
    }
}
