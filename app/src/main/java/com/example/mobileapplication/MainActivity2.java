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

public class MainActivity2 extends AppCompatActivity {

    private Button button;
    private TextView textView0;
    private TextView textView1;
    private TextView textView2;
    private TextView textView3;
    private TextView textView4;
    private TextView textView5;
    private TextView textView6;
    private TextView textView7;
    private TextView textView8;
    private TextView textView9;
    private TextView textView12;
    private TextView textView14;

    private EditText edittext;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button=findViewById(R.id.button);
        textView0=findViewById(R.id.textView);
        textView1=findViewById(R.id.TextView1);
        textView2=findViewById(R.id.TextView2);
        textView3=findViewById(R.id.TextView3);
        textView4=findViewById(R.id.TextView4);
        textView5=findViewById(R.id.TextView5);
        textView6=findViewById(R.id.TextView6);
        textView7=findViewById(R.id.TextView7);
        textView8=findViewById(R.id.TextView8);
        textView9=findViewById(R.id.TextView9);
        textView12=findViewById(R.id.textView13);
        textView14=findViewById(R.id.textView14);


        edittext=findViewById(R.id.editTextNumber);
        edittext.addTextChangedListener(EnterNum);

        String number=edittext.getText().toString();
//            button.setEnabled(!number.isEmpty());
        if(number.length()==0){
            button.setEnabled(false);
            textView14.setText("Alert! Enter the number");
        }
        else{
            button.setEnabled(true);
            textView14.setText("");
        }


        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                String num=edittext.getText().toString();
                int table=Integer.parseInt(num);
                textView12.setText("The corresponding table of the number "+table+" is");
                Toast.makeText(MainActivity2.this, "Thanks For using This App", Toast.LENGTH_SHORT).show();
//      for(int i=0;i<10;i++){
////        int i=0;
                (textView0).setText(table+" x "+(1)+" = "+table*(1));
                (textView1).setText(table+" x "+(2)+" = "+table*(2));
                (textView2).setText(table+" x "+(3)+" = "+table*(3));
                (textView3).setText(table+" x "+(4)+" = "+table*(4));
                (textView4).setText(table+" x "+(5)+" = "+table*(5));
                (textView5).setText(table+" x "+(6)+" = "+table*(6));
                (textView6).setText(table+" x "+(7)+" = "+table*(7));
                (textView7).setText(table+" x "+(8)+" = "+table*(8));
                (textView8).setText(table+" x "+(9)+" = "+table*(9));
                (textView9).setText(table+" x "+(10)+" = "+table*(10));
//        (textView0).setText(table+" x "+(1)+" = "+table*(1));
                textView14.setText("Success! you have done ");
                textView14.setTextColor(Color.parseColor("#0F9D58"));

//       }
            }
        });
    }
    private TextWatcher EnterNum=new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {


        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            String number=edittext.getText().toString().trim();
            button.setEnabled(!number.isEmpty());
            if(number.length()==0){
                Toast.makeText(MainActivity2.this, "Please Enter the Number", Toast.LENGTH_SHORT).show();
                button.setEnabled(!number.isEmpty());
                textView14.setText("Alert! Enter the number");
                textView14.setTextColor(Color.parseColor("#FF0303"));
            }
            else{
                button.setEnabled(!number.isEmpty());
                textView14.setText("");
            }
            if(number.length()>9){
                Toast.makeText(MainActivity2.this, "Number out of Bounds", Toast.LENGTH_SHORT).show();
                button.setEnabled(number.isEmpty());
                textView14.setText("Alert! You cannot enter more than 9 words");
                textView14.setTextColor(Color.parseColor("#FF0303"));
            }
            else if(number.length()<9&&number.length()>0){
                textView14.setText("");
            }
        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    };
}