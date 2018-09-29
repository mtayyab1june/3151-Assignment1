package com.example.mtayyab.gui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity
{
    EditText editText1,editText2,editText3,editText4,editText5;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        editText1=(EditText) findViewById(R.id.etxt1);
        editText2=(EditText) findViewById(R.id.etxt2);
        editText3=(EditText) findViewById(R.id.etxt3);
        editText4=(EditText) findViewById(R.id.etxt4);
        editText5=(EditText) findViewById(R.id.etxt5);
        Button button1=(Button) findViewById(R.id.btn1);
        button1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (editText1.getText().toString().equals(""))
                    editText1.setError("Invalid First Name");
                else if (editText2.getText().toString().equals(""))
                    editText2.setError("Invalid Last Name");
                else if (editText3.getText().toString().equals(""))
                    editText3.setError("Invalid Email");
                else if (editText4.getText().toString().equals(""))
                    editText4.setError("Invalid Password");
                else if (editText5.getText().toString().equals(""))
                    editText5.setError("Invalid Password");
                else
                    {
                        Intent i = new Intent(RegisterActivity.this, HomeActivity.class);
                        startActivity(i);
                    }
            }
        });
    }
}
