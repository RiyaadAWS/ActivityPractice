package com.example.activitypractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity5 extends AppCompatActivity {

    String st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);

        EditText input = findViewById(R.id.editTextActFive);
        TextView textViewPgOne = findViewById(R.id.textViewAct5);
        String initialTextViewMessage = getIntent().getStringExtra("Key");
        textViewPgOne.setText(initialTextViewMessage);
        st = input.getText().toString();
        st = String.format("%s \n I have read the message", getIntent().getStringExtra("Key"));

        Button buttonPgFour = findViewById(R.id.btnNext);
        buttonPgFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity5.this, Activity1.class);
                intent.putExtra("Key", st);
                startActivity(intent);
            }
        });
    }
}