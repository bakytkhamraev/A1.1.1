package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int value1;
    int value2;
    String op;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.result);
    }

    public void onClickNumber(View v) {
        switch (v.getId()) {
            case R.id.btn_zero:
                textView.append("0");
                break;
            case R.id.btn_one:
                textView.append("1");
                break;
            case R.id.btn_two:
                textView.append("2");
                break;
            case R.id.btn_three:
                textView.append("3");
                break;
            case R.id.btn_four:
                textView.append("4");
                break;
            case R.id.five:
                textView.append("5");
                break;
            case R.id.btn_six:
                textView.append("6");
                break;
            case R.id.btn_seven:
                textView.append("7");
                break;
            case R.id.btn_eight:
                textView.append("8");
                break;
            case R.id.btn_nine:
                textView.append("9");
                break;
        }
    }


    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.multiply:
                value1 = Integer.valueOf(textView.getText().toString());
                textView.setText(value1 + "*");
                op="*";
                break;
            case R.id.btn_plus:
                value1 = Integer.valueOf(textView.getText().toString());
                textView.setText(value1 + "+");
                op="+";
                break;
            case R.id.btn_minus:
                value1 = Integer.valueOf(textView.getText().toString());
                textView.setText(value1 + "-");
                op="-";
                break;
            case R.id.btn_divide:
                value1 = Integer.valueOf(textView.getText().toString());
                textView.setText(value1 + "/");
                op="/";
                break;
            case R.id.btn_equal:
                String first = textView.getText().toString().replace(value1 + op+"", "");
                value2 = Integer.valueOf(first);
                switch (op){
                    case "+":
                        textView.setText(value1 + "+" + value2 + "=" + (value1 + value2));
                        break;
                    case "-":
                        textView.setText(value1 + "-" + value2 + "=" + (value1 - value2));
                        break;
                    case "*":
                        textView.setText(value1 + "*" + value2 + "=" + (value1 * value2));
                        break;
                    case "/":
                        textView.setText(value1 + "/" + value2 + "=" + (float)value1 / value2);
                        break;
                }

            case R.id.btn_clear:
                textView.setText("");
                break;
        }
    }
}