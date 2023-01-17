package com.example.mobileapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.Html;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {
EditText E1,E2;
TextView T1,textView1;
int numInt;
Button button;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        ((TextView)findViewById(R.id.text1)).setText(Html.fromHtml("X<sup>2</sup>--->X is the Number and 2 is the Power"));
        E1=findViewById(R.id.editTextNumber5);
        T1=findViewById(R.id.textView16);
        textView1=findViewById(R.id.textView17);
        E2=findViewById(R.id.editTextNumberDecimal);
        button=findViewById(R.id.button5);
        String number=E1.getText().toString().trim();
        String number1=E2.getText().toString().trim();
        if(number.length()==0||number1.length()==0) {
            button.setEnabled(!number.isEmpty()&&!number1.isEmpty());
            textView1.setText("Alert! Enter the Values");
            textView1.setTextColor(Color.parseColor("#FF0303"));
        }
        else {
            button.setEnabled(!number.isEmpty()&&!number1.isEmpty());
            textView1.setText("");
        }
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
        String num=E1.getText().toString();
        String power=E2.getText().toString();
//        float maximum=Float.parseFloat(pow);
//        float get=1;
         numInt=Integer.parseInt(num);
        float powFLoat=Float.valueOf(power);

                double result = Math.pow(numInt, powFLoat);

        T1.setText("The required Answer is "+result);
                textView1.setText("Success! you have done ");
                textView1.setTextColor(Color.parseColor("#0F9D58"));
            }
        });
        E1.addTextChangedListener(EnterNum);
        E2.addTextChangedListener(EnterNum);
    }
    private TextWatcher EnterNum=new TextWatcher() {

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            String number=E1.getText().toString().trim();
            String number1=E2.getText().toString().trim();

            button.setEnabled(!number.isEmpty()&&!number1.isEmpty());
            if(number.length()==0||number1.length()==0) {
                button.setEnabled(!number.isEmpty()&&!number1.isEmpty());
                textView1.setText("Alert! Enter the Values");
                textView1.setTextColor(Color.parseColor("#FF0303"));
            }
            else {
                button.setEnabled(!number.isEmpty()&&!number1.isEmpty());
                textView1.setText("");
            }

        }

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {


        }

        @Override
        public void afterTextChanged(Editable s) {


        }
    };
}