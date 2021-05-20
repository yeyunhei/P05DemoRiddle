package sg.edu.rp.c346.id20011806.p05demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity extends AppCompatActivity {

    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer1);

        tvAnswer = findViewById(R.id.textView);
        tvAnswer.setText("In Second Activity");
        Intent intentReceived = getIntent();
        String questionsSelected = intentReceived.getStringExtra("Question");
        //Create 2 intents to receive answer of String and int value
        String ans = intentReceived.getStringExtra("Answer");
        int ansInt = intentReceived.getIntExtra("Answer", -1);

        if (ans.isEmpty()) { //if answer is int value / not String value
            tvAnswer.setText(questionsSelected + " answer is: " + ansInt);
        } else { //if answer is String value
            tvAnswer.setText(questionsSelected + " answer is: " + ans);
        }




    }
}