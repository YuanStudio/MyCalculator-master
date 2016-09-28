package com.example.cathleen.mycalculator;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnClickListener{
    Button interest,more,help_main;
    private TextView result_main;
    private Button one, two, three, four, five, six, seven, eight, nine,zero;
    private Button add,sub, mul, division, ce, del,dot,calculate;
    private Button jinzhi,danwei;
    public String equation = "";
    public String result = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "点我点我点我", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        init();
        interest.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent interestIntent = new Intent(MainActivity.this,InterestActivity.class);
                startActivity(interestIntent);
            }
        });
        more.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moreIntent = new Intent(MainActivity.this,MoreActivyty.class);
                startActivity(moreIntent);
            }
        });
        danwei.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent danweiIntent = new Intent(MainActivity.this,DanweiActivity.class);
                startActivity(danweiIntent);
            }
        });
        jinzhi.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent jinzhiIntent = new Intent(MainActivity.this,JinzhiActivity.class);
                startActivity(jinzhiIntent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        switch (id){
            case R.id.help:
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("帮助");
                builder.setMessage("这是一个灰常帅气的帮助");
                builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this,"单击了取消",Toast.LENGTH_SHORT).show();
                    }
                });
                builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this,"单击了确定",Toast.LENGTH_SHORT).show();
                    }
                });
                builder.create();
                builder.show();
                break;
            case R.id.exit:
                System.exit(-1);
                break;
        }

        return super.onOptionsItemSelected(item);
    }
    public void init(){
        result_main = (TextView)findViewById(R.id.result_main);
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

        add = (Button)findViewById(R.id.add);
        sub = (Button)findViewById(R.id.sub);
        mul = (Button)findViewById(R.id.mul);
        division = (Button)findViewById(R.id.division);
        ce = (Button)findViewById(R.id.ce);
        del = (Button)findViewById(R.id.del);
        calculate = (Button)findViewById(R.id.calculate);

        interest = (Button)findViewById(R.id.interest);
        more = (Button)findViewById(R.id.more);
        help_main = (Button)findViewById(R.id.help_main);
        danwei = (Button)findViewById(R.id.danwei);
        jinzhi = (Button)findViewById(R.id.jinzhi);

        this.add.setOnClickListener(this);
        this.sub.setOnClickListener(this);
        this.mul.setOnClickListener(this);
        this.division.setOnClickListener(this);
        this.ce.setOnClickListener(this);
        this.del.setOnClickListener(this);
        this.calculate.setOnClickListener(this);
        this.help_main.setOnClickListener(this);

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
            this.result_main.setText(this.equation);
        } else if (v == this.two) {
            // 数2
            this.equation += "2";
            this.result_main.setText(this.equation);
        } else if (v == this.three) {
            // 数3
            this.equation += "3";
            this.result_main.setText(this.equation);
        } else if (v == this.four) {
            // 数4
            this.equation += "4";
            this.result_main.setText(this.equation);
        } else if (v == this.five) {
            // 数5
            this.equation += "5";
            this.result_main.setText(this.equation);
        } else if (v == this.six) {
            // 数6
            this.equation += "6";
            this.result_main.setText(this.equation);
        } else if (v == this.seven) {
            // 数7
            this.equation += "7";
            this.result_main.setText(this.equation);
        } else if (v == this.eight) {
            // 数8
            this.equation += "8";
            this.result_main.setText(this.equation);
        } else if (v == this.nine) {
            // 数9
            this.equation += "9";
            this.result_main.setText(this.equation);
        } else if (v == this.zero) {
            // 零
            this.equation += "0";
            this.result_main.setText(this.equation);
        }else if (v == this.dot) {
            // 小数点
            if (!(this.equation == "" || this.equation == null)) {
                if (!this.equation.matches(".{" + (this.equation.length() - 1)
                        + "}[+-/*^.]")) {
                    String[] num = this.equation.split("[\\^]|[/]|[+]|[*]|[-]");
                    if (!num[num.length - 1].contains(".")) {
                        this.equation += ".";
                        this.result_main.setText(this.equation);
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
                    this.result_main.setText(this.equation);
                    this.equation = result;
                }
            }
        } else if (v == this.ce) {
            // 清空
            this.equation = "";
            this.result_main.setText(this.equation);
        }else if (v == this.del) {
            // 删除上一个
            if (!(this.equation == "" || this.equation == null)) {
                this.equation = this.equation.substring(0,
                        this.equation.length() - 1);
                this.result_main.setText(this.equation);
            }

        }else if (v == this.add) {
            // 加号
            if (!(this.equation == "" || this.equation == null)) {
                if (!this.equation.matches(".{" + (this.equation.length() - 1)
                        + "}[+-/*^]")) {
                    this.equation += "+";
                    this.result_main.setText(this.equation);
                }
            }
        } else if (v == this.sub) {
            // 减号
            if (!(this.equation == "" || this.equation == null)) {
                if (!this.equation.matches(".{" + (this.equation.length() - 1)
                        + "}[+-/*^]")) {
                    this.equation += "-";
                    this.result_main.setText(this.equation);
                }
            }
        } else if (v == this.mul) {
            // 乘号
            if (!(this.equation == "" || this.equation == null)) {
                if (!this.equation.matches(".{" + (this.equation.length() - 1)
                        + "}[+-/*^]")) {
                    this.equation += "*";
                    this.result_main.setText(this.equation);
                }
            }
        } else if (v == this.division) {
            // 除号
            if (!(this.equation == "" || this.equation == null)) {
                if (!this.equation.matches(".{" + (this.equation.length() - 1)
                        + "}[+-/*^]")) {
                    this.equation += "/";
                    this.result_main.setText(this.equation);
                }
            }
        } else if(v == help_main) {
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setTitle("欢迎");
            builder.setMessage("欢迎主上驾到，主上慧眼识英雄，希望小七我能给您带来方便");
            builder.setNegativeButton("朕知道了", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Toast.makeText(MainActivity.this,"小七告退",Toast.LENGTH_SHORT).show();
                }
            });
            builder.setPositiveButton("赏", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Toast.makeText(MainActivity.this,"谢主上",Toast.LENGTH_SHORT).show();
                }
            });
            builder.create();
            builder.show();
        }

    }
}
