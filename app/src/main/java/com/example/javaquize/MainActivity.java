package com.example.javaquize;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String[] questions = {"1. The modulus operator (%) in Java can be used only with variables of integer type?",
            "2. Declarations must appear at the start of the body of a Java method?", "3. All bitwise operations are carried out with the same level of precedence in Java?",
           " 4. The operations y >> 3 and y >>> 3 produce the same result when y > 0?",
           "5.The switch selection structure must end with the default case?","6.Java was introduced in 1972?","7.Java has abstract classes?",
    "8.Java supports interface?", "9.static is a keyword?", "10.In a string can we use double quote?"};
    private boolean[] answers = {false,false,false,true,false,false,true,true,true,true};
    private int score = 0;
    private int index =0;
    Button True;
    Button False;
    TextView question;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        True = findViewById(R.id.yes);
        False = findViewById(R.id.no);
        question = findViewById(R.id.question);
        question.setText(questions[index]);
        True.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(index<=questions.length-1) {
                    if(answers[index]==true) {
                        score++;
                    }
                    index++;
                    if(index<=questions.length-1) {
                        question.setText(questions[index]);
                    }
                    else {
                        Toast.makeText(MainActivity.this, "Your Score is " + score, Toast.LENGTH_SHORT).show();
                    }

                }


            }

        });

        False.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(index<=questions.length-1) {
                    if(answers[index]==false) {
                        score++;
                    }
                    index++;
                    if(index<=questions.length-1) {
                        question.setText(questions[index]);
                    }
                    else {
                        Toast.makeText(MainActivity.this, "Your Score is " + score, Toast.LENGTH_SHORT).show();
                    }

                }


            }
        });

    }
}