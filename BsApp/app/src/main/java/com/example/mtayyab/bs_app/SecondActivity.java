package com.example.mtayyab.bs_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity
{
    TextView textView1;
    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12,button13,button14,button15,button16;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textView1=(TextView) findViewById(R.id.txtv1);
        button1=(Button) findViewById(R.id.btn1);
        button2=(Button) findViewById(R.id.btn2);
        button3=(Button) findViewById(R.id.btn3);
        button4=(Button) findViewById(R.id.btn4);
        button5=(Button) findViewById(R.id.btn5);
        button6=(Button) findViewById(R.id.btn6);
        button7 =(Button) findViewById(R.id.btn7);
        button8=(Button) findViewById(R.id.btn8);
        button9=(Button) findViewById(R.id.btn9);
        button10=(Button) findViewById(R.id.btn10);
        button11=(Button) findViewById(R.id.btn11);
        button12=(Button) findViewById(R.id.btn12);
        button13=(Button) findViewById(R.id.btn13);
        button14=(Button) findViewById(R.id.btn14);
        button15=(Button) findViewById(R.id.btn15);
        button16=(Button) findViewById(R.id.btn16);
    }
}