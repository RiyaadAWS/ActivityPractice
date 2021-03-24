package com.example.activitypractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    String st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        EditText input = findViewById(R.id.editTextActTwo);
        TextView textViewPgOne = findViewById(R.id.textViewAct2);
        String initialTextViewMessage = getIntent().getStringExtra("Key");
        textViewPgOne.setText(initialTextViewMessage);
        st = input.getText().toString();
        st = String.format("%s \n I have read the message", getIntent().getStringExtra("Key"));

        Button buttonPgTwo = findViewById(R.id.btnNext);
        buttonPgTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity2.this, Activity3.class);
                intent.putExtra("Key", st);
                startActivity(intent);
            }
        });
    }
}