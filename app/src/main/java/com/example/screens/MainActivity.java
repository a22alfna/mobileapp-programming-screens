package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button sendButton = findViewById(R.id.sendButton);

        sendButton.setOnClickListener(new View.OnClickListener(){
            @Override
                public void onClick(View View){
                    Intent intent = new Intent(MainActivity.this, taEmotData.class);
                    EditText nameEdit = findViewById(R.id.editTextName);
                    EditText ageEdit = findViewById(R.id.editTextAge);

                    String name = nameEdit.getText().toString();
                    String age = ageEdit.getText().toString();

                    intent.putExtra("name", name); // Optional
                    intent.putExtra("number", age); // Optional
                    startActivity(intent);
            }
        });
    }
}
