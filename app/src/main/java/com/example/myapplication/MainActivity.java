package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mTrueButton;
    private Button mFalseButton;
    private int id = 0;
    private int numberOfQuestion = Common.questions.size();
    private String ans;
    private int totalTrueAnswer = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTrueButton =  findViewById(R.id.button_yes);
        mFalseButton =  findViewById(R.id.button_no);
        viewQuestion(0);
        mTrueButton.setOnClickListener(v -> {
            ans = Common.questions.get(id).isTrueAns() ?  "correct" : "incorrect";
            viewResult(ans);
            viewQuestion(++id);
        });

        mFalseButton.setOnClickListener(v -> {
            ans = !Common.questions.get(id).isTrueAns() ?  "correct" : "incorrect";
            viewResult(ans);
            viewQuestion(++id);
        });
    }

    public void viewQuestion(int id){
        TextView textView = findViewById(R.id.textView);
        if(id< numberOfQuestion){
            textView.setText(Common.questions.get(id).getContent());
        }else {
            textView.setText(String.format("so cau tra loi dung la: %s", totalTrueAnswer));
            mTrueButton.setEnabled(false);
            mFalseButton.setEnabled(false);
        }
    }

    public void viewResult(String ans){
        Toast.makeText(MainActivity.this,
                ans,
                Toast.LENGTH_SHORT).show();
        if(ans.equals("correct")){
            totalTrueAnswer ++;
        }
    }

}