package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class taEmotData extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ta_emot_data);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String name = extras.getString("name");
            String age = extras.getString("age");
            // Do something with the name and number

            TextView nameView = findViewById(R.id.textViewNamn);
            nameView.setText(name);

            TextView ageView = findViewById(R.id.textViewAge);
            ageView.setText(age);

        }
    }
}