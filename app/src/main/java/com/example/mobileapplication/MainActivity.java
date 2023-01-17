package com.example.mobileapplication;

import androidx.annotation.AnimRes;
import androidx.annotation.AnyRes;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup RG;
    RadioButton R1, R2, R3, R4;
    Button button;
    boolean check;
    int a;
    private String MainActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        R1 = findViewById(R.id.radioButton);
        R2 = findViewById(R.id.radioButton2);
        R3 = findViewById(R.id.radioButton3);
        R4 = findViewById(R.id.radioButton4);
        button = findViewById(R.id.button3);

//        check=false;
        button.setEnabled(false);

                R1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        button.setEnabled(true);
                        a = 1;
                    }
                });
                R2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        button.setEnabled(true);
                         a=2;
                    }
                });
                R3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        button.setEnabled(true);
                        a=3;
                    }
                });
                R4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        button.setEnabled(true);
                        a = 4;
                    }
                });
            }
    public void ClickActivity (View V) {
        if (a == 1) {
            Toast.makeText(this, "Thanks For Clicking", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, MainActivity3.class);
            startActivity(intent);
        }
        else if(a==2) {
            Toast.makeText(this, "Thanks For Clicking", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, MainActivity2.class);
            startActivity(intent);
        }
        else if(a==3){
            Toast.makeText(this, "Thanks For Clicking", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, MainActivity4.class);
            startActivity(intent);

        }
        else{
            Toast.makeText(this, "Thanks For Clicking", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, MainActivity5.class);
            startActivity(intent);
        }
    }



    }

