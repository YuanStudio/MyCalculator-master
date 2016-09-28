package com.example.cathleen.mycalculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MoreActivyty extends AppCompatActivity implements View.OnClickListener{
    private final static String TAG = "mytag";

    private TextView result_more;
    private Button one, two, three, four, five, six, seven, eight, nine,zero,dot;
    private Button  cube, square, radical,reciprocal,power,sin,cos,tan;
    private Button ce, del,calculate,return_main;
    public String equation = "";
    public String result = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_activyty);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainIntent = new Intent(MoreActivyty.this,MainActivity.class);
                startActivity(mainIntent);
            }
        });
        init();
        return_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MoreActivyty.this);
                builder.setTitle("帮助");
                builder.setMessage("请先输入数字，在输入功能操作");
                builder.create();
                builder.show();
            }
        });
    }

    public void init(){
        result_more = (TextView)findViewById(R.id.result_more);
        return_main = (Button)findViewById(R.id.return_main);
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
        dot = (Button)findViewById(R.id.dot);

        cube = (Button)findViewById(R.id.cube);
        square= (Button)findViewById(R.id.square);
        radical= (Button)findViewById(R.id.radical);
        reciprocal = (Button)findViewById(R.id.reciprocal);
        power = (Button)findViewById(R.id.power);
        sin = (Button)findViewById(R.id.sin);
        cos = (Button)findViewById(R.id.cos);
        tan = (Button)findViewById(R.id.tan);

        ce = (Button)findViewById(R.id.ce);
        del = (Button)findViewById(R.id.del);
        calculate = (Button)findViewById(R.id.calculate);

        this.ce.setOnClickListener(this);
        this.del.setOnClickListener(this);
        this.calculate.setOnClickListener(this);

        this.cube.setOnClickListener(this);
        this.square.setOnClickListener(this);
        this.reciprocal.setOnClickListener(this);
        this.radical.setOnClickListener(this);
        this.power.setOnClickListener(this);
        this.sin.setOnClickListener(this);
        this.cos.setOnClickListener(this);
        this.tan.setOnClickListener(this);

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
        this.dot.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==one.getId()) {
            // 数1
            this.equation += "1";
            this.result_more.setText(this.equation);
            Log.v(TAG,"1");
        } else if (v == this.two) {
            // 数2
            this.equation += "2";
            this.result_more.setText(this.equation);
            Log.v(TAG,"2");
        } else if (v == this.three) {
            // 数3
            this.equation += "3";
            this.result_more.setText(this.equation);
        } else if (v == this.four) {
            // 数4
            this.equation += "4";
            this.result_more.setText(this.equation);
        } else if (v == this.five) {
            // 数5
            this.equation += "5";
            this.result_more.setText(this.equation);
        } else if (v == this.six) {
            // 数6
            this.equation += "6";
            this.result_more.setText(this.equation);
        } else if (v == this.seven) {
            // 数7
            this.equation += "7";
            this.result_more.setText(this.equation);
        } else if (v == this.eight) {
            // 数8
            this.equation += "8";
            this.result_more.setText(this.equation);
        } else if (v == this.nine) {
            // 数9
            this.equation += "9";
            this.result_more.setText(this.equation);
        } else if (v == this.zero) {
            // 零
            this.equation += "0";
            this.result_more.setText(this.equation);
        }else if (v == this.dot) {
            // 小数点
            if (!(this.equation == "" || this.equation == null)) {
                if (!this.equation.matches(".{" + (this.equation.length() - 1)
                        + "}[+-/*^.]")) {
                    String[] num = this.equation.split("[\\^]|[/]|[+]|[*]|[-]");
                    if (!num[num.length - 1].contains(".")) {
                        this.equation += ".";
                        this.result_more.setText(this.equation);
                    }
                }
            }
        }else if (v == this.calculate) {
            // 计算
            if (!(this.equation == "" || this.equation == null)) {
                if (!this.equation.matches(".{" + (this.equation.length() - 1)
                        + "}[+-/*^]")) {
                    this.equation += "=";
                    result = Calculators.calculate(this.equation);
                    this.equation += result;
                    this.result_more.setText(this.equation);
                    this.equation = result;
                }
            }
        } else if (v == this.ce) {
            // 清空
            this.equation = "";
            this.result_more.setText(this.equation);
        }else if (v == this.del) {
            // 删除上一个
            if (!(this.equation == "" || this.equation == null)) {
                this.equation = this.equation.substring(0,
                        this.equation.length() - 1);
                this.result_more.setText(this.equation);
            }

        } else if (v == this.square) {
            // 平方
            if (!(this.equation == "" || this.equation == null)) {
                if (!this.equation.matches(".{" + (this.equation.length() - 1)
                        + "}[+-/*^]")) {
                    Double num = Double.parseDouble(this.equation);
                    num *= num;
                    this.equation = num + "";
                    this.result_more.setText(this.equation);
                }
            }
        } else if (v == this.cube) {
            // 立方
            if (!(this.equation == "" || this.equation == null)) {
                if (!this.equation.matches(".{" + (this.equation.length() - 1)
                        + "}[+-/*^]")) {
                    Double num = Double.parseDouble(this.equation);
                    num *= num * num;
                    this.equation = num + "";
                    this.result_more.setText(this.equation);
                }
            }
        } else if (v == this.radical) {
            // 平方根
            if (!(this.equation == "" || this.equation == null)) {
                if (!this.equation.matches(".{" + (this.equation.length() - 1)
                        + "}[\\^]|[/]|[+]|[*]|[-]")) {
                    Double num = Double.parseDouble(this.equation);
                    num = Math.sqrt(num);
                    this.equation = num + "";
                    this.result_more.setText(this.equation);
                }
            }
        } else if (v == this.reciprocal) {
            // 倒数
            if (!(this.equation == "" || this.equation == null)) {
                if (!this.equation.matches(".{" + (this.equation.length() - 1)
                        + "}[+-/*^]")) {
                    Double num = Double.parseDouble(this.equation);
                    num = 1 / num;
                    this.equation = num + "";
                    this.result_more.setText(this.equation);
                }
            }
        } else if (v == this.power) {
            // 次幂
            if (!(this.equation == "" || this.equation == null)) {
                if (!this.equation.matches(".{" + (this.equation.length() - 1)
                        + "}[+-/*^]")) {
                    this.equation += "^";
                    this.result_more.setText(this.equation);
                }
            }
        }else if (v == this.sin) {
            // 正弦
            if (!(this.equation == "")) {
                this.equation += "s";
                result = Calculators.calculate(this.equation);
                this.result_more.setText(result);
                this.equation = "";
            }

        } else if (v == this.cos) {
            // 余弦
            if (!(this.equation == "")) {
                this.equation += "c";
                result = Calculators.calculate(this.equation);
                this.result_more.setText(result);
                this.equation = "";
            }
        } else if (v == this.tan) {
            // 正切
            if (!(this.equation == "")) {
                this.equation += "t";
                result = Calculators.calculate(this.equation);
                this.result_more.setText(result);
                this.equation = "";
            }
        }
    }
}
