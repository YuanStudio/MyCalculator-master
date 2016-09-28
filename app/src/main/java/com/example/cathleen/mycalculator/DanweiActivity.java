package com.example.cathleen.mycalculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DanweiActivity extends AppCompatActivity implements View.OnClickListener{
    private String TAG = "mytag";
    private Button kmtom,mtokm,hourtosecond,secondtohour,cmtoinch,inchtocm,tonum,topi;
    private Button one,two,three,four,five,six,seven,eight,nine,zero,dot,ce;
    private EditText show_danwei;

    public void init(){
        show_danwei = (EditText) findViewById(R.id.show);
        kmtom = (Button)findViewById(R.id.kmtom);
        mtokm = (Button)findViewById(R.id.mtokm);
        hourtosecond = (Button)findViewById(R.id.hourtosecond);
        secondtohour = (Button)findViewById(R.id.secondtohour);
        cmtoinch = (Button)findViewById(R.id.cmtoinch);
        inchtocm = (Button)findViewById(R.id.inchtocm);
        tonum = (Button)findViewById(R.id.tonum);
        topi = (Button)findViewById(R.id.topi);

        one= (Button)findViewById(R.id.one);
        two= (Button)findViewById(R.id.two);
        three= (Button)findViewById(R.id.three);
        four = (Button)findViewById(R.id.four);
        seven= (Button)findViewById(R.id.seven);
        eight= (Button)findViewById(R.id.eight);
        nine= (Button)findViewById(R.id.nine);
        zero= (Button)findViewById(R.id.zero);
        five= (Button)findViewById(R.id.five);
        six= (Button)findViewById(R.id.six);
        ce= (Button)findViewById(R.id.ce);
        dot = (Button)findViewById(R.id.dot);

        this.kmtom.setOnClickListener(this);
        this.mtokm.setOnClickListener(this);
        this.hourtosecond.setOnClickListener(this);
        this.secondtohour.setOnClickListener(this);
        this.cmtoinch.setOnClickListener(this);
        this.inchtocm.setOnClickListener(this);
        this.tonum.setOnClickListener(this);
        this.topi.setOnClickListener(this);
    }

    public void numberListener(){
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show_danwei.setText(show_danwei.getText()+"1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show_danwei.setText(show_danwei.getText()+"2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show_danwei.setText(show_danwei.getText()+"3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show_danwei.setText(show_danwei.getText()+"4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show_danwei.setText(show_danwei.getText()+"5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show_danwei.setText(show_danwei.getText()+"6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show_danwei.setText(show_danwei.getText()+"7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show_danwei.setText(show_danwei.getText()+"8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show_danwei.setText(show_danwei.getText()+"9");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show_danwei.setText(show_danwei.getText()+"0");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show_danwei.setText(show_danwei.getText()+".");
            }
        });
        ce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show_danwei.setText("");
            }
        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danwei);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainIntent = new Intent(DanweiActivity.this,MainActivity.class);
                startActivity(mainIntent);
            }
        });
        init();
        numberListener();
    }

    @Override
    public void onClick(View view) {
        double result = Double.parseDouble(show_danwei.getText().toString());
        switch(view.getId()){
            case R.id.kmtom:
                result = result * 1000;
                show_danwei.setText(String.valueOf(result));
                break;
            case R.id.mtokm:
                result = result/1000;
                show_danwei.setText(String.valueOf(result));
                break;
            case  R.id.hourtosecond:
                result = result * 3600;
                show_danwei.setText(String.valueOf(result));
                break;
            case R.id.secondtohour:
                result = result / 3600;
                show_danwei.setText(String.valueOf(result));
                break;
            case R.id.cmtoinch:
                result = result / 2.54;
                show_danwei.setText(String.valueOf(result));
                break;
            case R.id.inchtocm:
                result = result * 2.54;
                show_danwei.setText(String.valueOf(result));
                break;
            case R.id.tonum:
                result = result * 3.1415926;
                show_danwei.setText(String.valueOf(result));
                break;
            case R.id.topi:
                result = result / 3.1415926;
                show_danwei.setText(String.valueOf(result));
                break;
        }
    }
}
