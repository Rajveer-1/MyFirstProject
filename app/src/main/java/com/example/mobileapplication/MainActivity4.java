package com.example.mobileapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity4 extends AppCompatActivity {
Button button;
EditText E1,E2,E3,E4,E5,E6;
TextView textView,textView1;
    float a1,a2,b1,b2,c1,c2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        E4=findViewById(R.id.editTextNumber4);
        E5=findViewById(R.id.editTextNumber6);
        E6=findViewById(R.id.editTextNumber8);
        E1=findViewById(R.id.editTextNumber2);
        E2=findViewById(R.id.editTextNumber3);
        E3=findViewById(R.id.editTextNumber7);
        textView1=findViewById(R.id.textView11);
        button=findViewById(R.id.button4);
        textView=findViewById(R.id.textView9);
        String a3 = E1.getText().toString();
        String a4 = E2.getText().toString();
        String c3 = E3.getText().toString();
        String b3 = E4.getText().toString();
        String b4 = E5.getText().toString();
        String c4 = E6.getText().toString();
        if(a3.length()==0||a4.length()==0||c3.length()==0||b3.length()==0||c4.length()==0||b4.length()==0||a3.compareTo("-")==0||a3.compareTo(".")==0||a4.compareTo("-")==0||a4.compareTo(".")==0||b3.compareTo("-")==0||b3.compareTo(".")==0||c3.compareTo("-")==0||c3.compareTo(".")==0||b4.compareTo("-")==0||b4.compareTo(".")==0||c4.compareTo("-")==0||c4.compareTo(".")==0){
            button.setEnabled(false);
            textView1.setTextColor(Color.parseColor("#FF0303"));
            textView1.setText("Alert! Enter the values");
        }
        else{
            button.setEnabled(true);
            textView1.setText("");
        }
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a3 = E1.getText().toString();
                String a4 = E2.getText().toString();
                String c3 = E3.getText().toString();
                String b3 = E4.getText().toString();
                String b4 = E5.getText().toString();
                String c4 = E6.getText().toString();
                a1=Float.parseFloat(a3);
                a2=Float.parseFloat(a4);
                c1=Float.parseFloat(c3);
                b1=Float.parseFloat(b3);
                b2=Float.parseFloat(b4);
                c2=Float.parseFloat(c4);
                b2=a1*b2-a2*b1;
                c2=c2*a1-c1*b1;
                textView1.setText("Success! you have done ");
                textView1.setTextColor(Color.parseColor("#0F9D58"));
                float y=(float)c2/b2;
                a1=a1*b2;
                c1=c1*b2-c2*a2;
                float x=(float)c1/a1;



                textView.setText("Value of x = "+x+" and y = "+y);


            }
        });
        E1.addTextChangedListener(EnterNum);
        E2.addTextChangedListener(EnterNum);
        E3.addTextChangedListener(EnterNum);
        E4.addTextChangedListener(EnterNum);
        E5.addTextChangedListener(EnterNum);
        E6.addTextChangedListener(EnterNum);

    }
    private TextWatcher EnterNum=new TextWatcher() {

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            String number=E1.getText().toString().trim();
            String number1=E2.getText().toString().trim();
            String number2=E3.getText().toString().trim();
            String number3=E4.getText().toString().trim();
            String number4=E5.getText().toString().trim();
            String number5=E6.getText().toString().trim();
            button.setEnabled(!number.isEmpty()&&!number1.isEmpty()&&!number2.isEmpty()&&!number3.isEmpty()&&!number4.isEmpty()&&!number5.isEmpty());
            if(number.length()==0||number1.length()==0||number2.length()==0||number3.length()==0||number4.length()==0||number5.length()==0||number.compareTo("-")==0||number.compareTo(".")==0||number1.compareTo("-")==0||number1.compareTo(".")==0||number2.compareTo("-")==0||number2.compareTo(".")==0||number3.compareTo("-")==0||number3.compareTo(".")==0||number4.compareTo("-")==0||number4.compareTo(".")==0||number5.compareTo("-")==0||number5.compareTo(".")==0) {
                button.setEnabled(!number.isEmpty()&&!number1.isEmpty()&&!number2.isEmpty()&&!number3.isEmpty()&&!number4.isEmpty()&&!number5.isEmpty()&&number.compareTo("-")!=0&&number.compareTo(".")!=0&&number1.compareTo("-")!=0&&number1.compareTo(".")!=0&&number2.compareTo(".")!=0&&number2.compareTo("-")!=0&&number3.compareTo("-")!=0&&number3.compareTo(".")!=0&&number4.compareTo("-")!=0&&number4.compareTo(".")!=0&&number5.compareTo("-")!=0&&number.compareTo(".")!=0);
                textView1.setText("Alert! Enter the Values");

                textView1.setTextColor(Color.parseColor("#FF0303"));
            }
            else {
                button.setEnabled(!number.isEmpty()&&!number1.isEmpty()&&!number2.isEmpty()&&!number3.isEmpty()&&!number4.isEmpty()&&!number5.isEmpty());
                textView1.setText("");
            }
            if(number.length()>7||number1.length()>7||number2.length()>7||number3.length()>7||number4.length()>7||number5.length()>7){
                Toast.makeText(MainActivity4.this, "Number out of Bounds", Toast.LENGTH_SHORT).show();
                button.setEnabled(!number.isEmpty()&&!number1.isEmpty()&&!number2.isEmpty()&&!number3.isEmpty()&&!number4.isEmpty()&&!number5.isEmpty());
                textView1.setText("Alert! You cannot enter more than 6 words");
                textView1.setTextColor(Color.parseColor("#FF0303"));
            }
            else if(number.length()<=6&&number.length()>0&&number1.length()<=6&&number1.length()>0&&number2.length()<=6&&number2.length()>0&&number3.length()<=6&&number3.length()>0&&number4.length()<=6&&number4.length()>0&&number5.length()<=6&&number5.length()>0&&number!="-"&&number!="."&&number1=="-"&&number1=="."&&number2=="-"&&number2=="."&&number3=="-"&&number3=="."&&number4=="-"&&number4=="."&&number5=="-"&&number5=="."){
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