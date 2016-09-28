package com.example.cathleen.mycalculator;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

import java.util.Random;

public class InterestActivity extends AppCompatActivity{

    private Button subject,predicate,object,restart;
    private TextView show_sentence;
    private final String[] subjects = new String[]{"我","我们","他","她"};
    private final String[] predicates = new String[]{"是","不是","爱","讨厌","嫁给","要"};
    private final String[] objects = new String[]{"猪","草泥马","王司徒","弯弯"};

    public void init(){
        show_sentence = (TextView)findViewById(R.id.show_sentence);
        subject = (Button)findViewById(R.id.subject);
        predicate  = (Button)findViewById(R.id.predicate);
        object = (Button)findViewById(R.id.object);
        restart = (Button)findViewById(R.id.restart);
    }
    public void run(){
        subject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random_sub = new Random();
                int r = random_sub.nextInt(subjects.length);
                show_sentence.setText(show_sentence.getText()+subjects[r]);
                subject.setEnabled(false);
            }
        });
        predicate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random_sub = new Random();
                int r = random_sub.nextInt(predicates.length);
                show_sentence.setText(show_sentence.getText()+predicates[r]);
                predicate.setEnabled(false);
            }
        });
        object.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random_sub = new Random();
                int r = random_sub.nextInt(objects.length);
                show_sentence.setText(show_sentence.getText()+objects[r]);
                object.setEnabled(false);
            }
        });
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                subject.setEnabled(true);
                object.setEnabled(true);
                predicate.setEnabled(true);
                show_sentence.setText("");
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insterest);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainIntent = new Intent(InterestActivity.this,MainActivity.class);
                startActivity(mainIntent);
            }
        });
        init();
        run();
    }
}
