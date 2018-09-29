package com.example.mtayyab.bs_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    TextView textView1;
    EditText editText1;
    Button button1,button2,button3;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1=(TextView) findViewById(R.id.txtv1);
        editText1=(EditText) findViewById(R.id.etxt1);
        button1=(Button) findViewById(R.id.btn1);
        button1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                textView1.setText("");
            }
        });
        button2=(Button) findViewById(R.id.btn2);
        button2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String temp;
                temp=editText1.getText().toString();
                textView1.setText(temp);
            }
        });
        button3=(Button) findViewById(R.id.btn3);
        button3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(i);
            }
        });
    }
}
