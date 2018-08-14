package com.example.marvin.infs3634quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {

    private Button mTrueButton;
    private Button mFalseButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        mTrueButton =(Button) findViewById(R.id.IDtrueButton);
        mTrueButton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Toast.makeText(QuizActivity.this, R.string.correctToast, Toast.LENGTH_SHORT).show();
         }
        });

        mFalseButton =(Button) findViewById(R.id.IDfalseButton);
        mFalseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(QuizActivity.this, R.string.falseToast, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
