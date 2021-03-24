package com.example.activitypractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Activity1 extends AppCompatActivity {

    String st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        EditText input = findViewById(R.id.editTextActOne);
        TextView textViewPgOne = findViewById(R.id.textViewAct1);
        String initialTextViewMessage = getIntent().getStringExtra("Key");
        textViewPgOne.setText(initialTextViewMessage);
        st = input.getText().toString();

        Button buttonPgOne = findViewById(R.id.btnNext);
        buttonPgOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity1.this, Activity2.class);
                intent.putExtra("Key", st);
                startActivity(intent);
            }
        });
    }
}