package com.example.android.metroquiz;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkResults(View view){
        int score = 0;

        EditText answer1 = (EditText) findViewById(R.id.answer1);
        String answer1_text = answer1.getText().toString();
        if(answer1_text.equals(getString(R.string.answer1))){
            score++;
        }

        RadioButton answer2_1 = (RadioButton) findViewById(R.id.answer2_1);
        if(answer2_1.isChecked()){
            score++;
        }

        CheckBox answer3_1 = (CheckBox) findViewById(R.id.answer3_1);
        CheckBox answer3_2 = (CheckBox) findViewById(R.id.answer3_2);
        CheckBox answer3_3 = (CheckBox) findViewById(R.id.answer3_3);
        CheckBox answer3_4 = (CheckBox) findViewById(R.id.answer3_4);
        if(answer3_1.isChecked() && answer3_2.isChecked() == false &&
                answer3_3.isChecked()&& answer3_4.isChecked() == false){
            score++;
        }

        RadioButton answer4_4 = (RadioButton) findViewById(R.id.answer4_4);
        if(answer4_4.isChecked()){
            score++;
        }

        RadioButton answer5_3 = (RadioButton) findViewById(R.id.answer5_3);
        if(answer5_3.isChecked()){
            score++;
        }

        CheckBox answer6_1 = (CheckBox) findViewById(R.id.answer6_1);
        CheckBox answer6_2 = (CheckBox) findViewById(R.id.answer6_2);
        CheckBox answer6_3 = (CheckBox) findViewById(R.id.answer6_3);
        CheckBox answer6_4 = (CheckBox) findViewById(R.id.answer6_4);
        if(answer6_1.isChecked() == false && answer6_2.isChecked() &&
                answer6_3.isChecked()&& answer6_4.isChecked() == false){
            score++;
        }

        RadioButton answer7_2 = (RadioButton) findViewById(R.id.answer7_2);
        if(answer7_2.isChecked()){
            score++;
        }

        CheckBox answer8_1 = (CheckBox) findViewById(R.id.answer8_1);
        CheckBox answer8_2 = (CheckBox) findViewById(R.id.answer8_2);
        CheckBox answer8_3 = (CheckBox) findViewById(R.id.answer8_3);
        CheckBox answer8_4 = (CheckBox) findViewById(R.id.answer8_4);
        if(answer8_1.isChecked() && answer8_2.isChecked() == false &&
                answer8_3.isChecked()&& answer8_4.isChecked() == false){
            score++;
        }

        RadioButton answer9_2 = (RadioButton) findViewById(R.id.answer9_2);
        if(answer9_2.isChecked()){
            score++;
        }

        EditText answer10 = (EditText) findViewById(R.id.answer10);
        String answer10_text = answer1.getText().toString().toLowerCase();
        if(answer1_text.equals(getString(R.string.answer1).toLowerCase())){
            score++;
        }

        Context context = getApplicationContext();
        String text = "score="+score+"/10";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
