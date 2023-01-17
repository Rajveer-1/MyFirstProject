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

public class MainActivity3 extends AppCompatActivity {
//double a,b,c;

    EditText a1, b1, c1;
    TextView textView,textView1,T1;
    Button button;
    double d;
    float a, b, c;
    boolean check;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        a1 = findViewById(R.id.editTextTextPassword2);
        b1 = findViewById(R.id.editTextTextPassword3);
        c1 = findViewById(R.id.editTextTextPassword4);
        T1=findViewById(R.id.textView19);
        button = findViewById(R.id.button2);
        textView = findViewById(R.id.textView5);
        textView1 = findViewById(R.id.textView10);
        String b2 = b1.getText().toString();
        String a2 = a1.getText().toString();
        String c2 = c1.getText().toString();
        if(a2.length()==0||b2.length()==0||c2.length()==0||a2.compareTo("-")==0||b2.compareTo("-")==0||c2.compareTo("-")==0){
            textView1.setTextColor(Color.parseColor("#FF0303"));
            textView1.setText("Alert! Enter the values");
            button.setEnabled(false);
        }
        else{
            button.setEnabled(true);
            textView1.setText("");
        }
        T1.setText(Html.fromHtml("ax<sup>2</sup>+bx+c=0"));

            button.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    String b2 = b1.getText().toString();
                    String a2 = a1.getText().toString();
                    String c2 = c1.getText().toString();
                    a = Float.parseFloat(a2);
                    b = Float.parseFloat(b2);
                    c = Float.parseFloat(c2);
                    d = (Math.sqrt(b * b - 4 * a * c));
                    textView1.setText("Success! you have done ");
                    textView1.setTextColor(Color.parseColor("#0F9D58"));
                    if (d > 0) {
                        float roots = (float) ((-b + d) / (2.0 * a));
                        float roots1 = (float) ((-b - d) / (2.0 * a));
                        if (roots % 2 == 0 && roots1 % 2 == 0) {
                            int r1 = (int) roots;
                            int r2 = (int) roots1;
                            textView.setText("Roots are real and distinct: " + r1 + "," + r2);
                        } else if (roots % 2 == 0) {
                            int r1 = (int) roots;
                            textView.setText("Roots are real and distinct: " + r1 + "," + roots1);
                        } else if (roots1 % 2 == 0) {
                            int r2 = (int) roots1;
                            textView.setText("Roots are real and distinct: " + roots + "," + r2);
                        } else {
                            textView.setText("Roots are real and distinct: " + roots + "," + roots1);
                        }
                    } else if (d == 0) {
                        float roots = (float) (-b / (2 * a));
                        if (roots % 2 == 0 || roots == 1.0 || roots == -1.0) {
                            int r1 = (int) roots;
                            textView.setText("Roots are equal: " + r1);
                        } else {
                            textView.setText("Roots are equal: " + roots);
                        }

                    } else {
                        textView.setText("Roots are imaginary");
                    }

                }
            });
            a1.addTextChangedListener(EnterNum);;
            b1.addTextChangedListener(EnterNum);
            c1.addTextChangedListener(EnterNum);
        }

    private TextWatcher EnterNum=new TextWatcher() {

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            String number=a1.getText().toString().trim();
            String number1=b1.getText().toString().trim();
            String number2=c1.getText().toString().trim();
          button.setEnabled(!number.isEmpty()&&!number1.isEmpty()&&!number2.isEmpty());
          if(number.length()==0||number1.length()==0||number2.length()==0||number.compareTo("-")==0||number1.compareTo("-")==0||number2.compareTo("-")==0) {
              button.setEnabled(!number.isEmpty()&&!number1.isEmpty()&&!number2.isEmpty()&&number.compareTo("-")!=0&&number1.compareTo("-")!=0&&number2.compareTo("-")!=0);
              textView1.setText("Alert! Enter the Values");
              textView1.setTextColor(Color.parseColor("#FF0303"));
          }
          else {
              button.setEnabled(!number.isEmpty()&&!number1.isEmpty()&&!number2.isEmpty());
              textView1.setText("");
          }

            if(number.length()>7||number1.length()>7||number2.length()>7){
                Toast.makeText(MainActivity3.this, "Number out of Bounds", Toast.LENGTH_SHORT).show();
                button.setEnabled(!number.isEmpty()&&!number1.isEmpty()&&!number2.isEmpty());
                textView1.setText("Alert! You cannot enter more than 7 words");
                textView1.setTextColor(Color.parseColor("#FF0303"));
            }
            else if(number.length()<8&&number.length()>0&&number1.length()<8&&number1.length()>0&&number2.length()<8&&number2.length()>0&&number.compareTo("-")!=0&&number1.compareTo("-")!=0&&number2.compareTo("-")!=0){
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
