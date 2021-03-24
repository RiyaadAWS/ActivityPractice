package com.example.activitypractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {

    String st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        EditText input = findViewById(R.id.editTextActThree);
        TextView tv = findViewById(R.id.textViewAct3);
        String t = getIntent().getStringExtra("Value");
        tv.setText(t);
        st = input.getText().toString();
        st = String.format("%s \n I have read the message", getIntent().getStringExtra("Value"));

        Button btn = findViewById(R.id.btnNext);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity3.this, Activity4.class);
                intent.putExtra("Value", st);
                startActivity(intent);
            }
        });

        btn = findViewById(R.id.btnBack);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity3.this, Activity2.class);
                startActivity(intent);
            }
        });
    }
}