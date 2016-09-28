package com.example.cathleen.mycalculator;

import android.content.Intent;
import android.os.Bundle;
import android.renderscript.Double2;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class JinzhiActivity extends AppCompatActivity implements View.OnClickListener{
    Button toBinary,toOctal,toHex;
    Button one,two,three,four,five,six,seven,eight,nine,zero,ce;
    EditText show_jinzhi;

    public void init(){

        show_jinzhi = (EditText) findViewById(R.id.show_jinzhi);
        one = (Button)findViewById(R.id.one);
        two = (Button)findViewById(R.id.two);
        three = (Button)findViewById(R.id.three);
        four = (Button)findViewById(R.id.four);
        five = (Button)findViewById(R.id.five);
        six = (Button)findViewById(R.id.six);
        seven = (Button)findViewById(R.id.seven);
        eight = (Button)findViewById(R.id.eight);
        nine = (Button)findViewById(R.id.nine);
        zero = (Button)findViewById(R.id.zero);

        toBinary = (Button)findViewById(R.id.toBinary);
        toOctal= (Button)findViewById(R.id.toOctal);
        toHex= (Button)findViewById(R.id.toHex);
        show_jinzhi = (EditText)findViewById(R.id.show_jinzhi);
        ce = (Button)findViewById(R.id.ce);

        this.one.setOnClickListener(this);
        this.two.setOnClickListener(this);
        this.three.setOnClickListener(this);
        this.four.setOnClickListener(this);
        this.five.setOnClickListener(this);
        this.six.setOnClickListener(this);
        this.seven.setOnClickListener(this);
        this.eight.setOnClickListener(this);
        this.nine.setOnClickListener(this);
        this.zero.setOnClickListener(this);

        this.toBinary.setOnClickListener(this);
        this.toOctal.setOnClickListener(this);
        this.toHex.setOnClickListener(this);
        this.ce.setOnClickListener(this);

    }

    public void numberListener(){
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show_jinzhi.setText(show_jinzhi.getText()+"1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show_jinzhi.setText(show_jinzhi.getText()+"2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show_jinzhi.setText(show_jinzhi.getText()+"3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show_jinzhi.setText(show_jinzhi.getText()+"4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show_jinzhi.setText(show_jinzhi.getText()+"5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show_jinzhi.setText(show_jinzhi.getText()+"6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show_jinzhi.setText(show_jinzhi.getText()+"7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show_jinzhi.setText(show_jinzhi.getText()+"8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show_jinzhi.setText(show_jinzhi.getText()+"9");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show_jinzhi.setText(show_jinzhi.getText()+"0");
            }
        });
        ce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show_jinzhi.setText("");
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jinzhi);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  mainIntent = new Intent(JinzhiActivity.this,MainActivity.class);
                startActivity(mainIntent);
            }
        });
        init();
        numberListener();
    }

    @Override
    public void onClick(View view) {
        String result;
        switch(view.getId()) {
            case R.id.toBinary:
                result = Integer.toBinaryString(Integer.parseInt(show_jinzhi.getText().toString()));
                show_jinzhi.setText(String.valueOf(result));
                break;
            case R.id.toHex:
                result = Integer.toHexString(Integer.parseInt(show_jinzhi.getText().toString()));
                show_jinzhi.setText(String.valueOf(result));
                break;
            case R.id.toOctal:
                result = Integer.toOctalString(Integer.parseInt(show_jinzhi.getText().toString()));
                show_jinzhi.setText(String.valueOf(result));
                break;
        }
    }
}
