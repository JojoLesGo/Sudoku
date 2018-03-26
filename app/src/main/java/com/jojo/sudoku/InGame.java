package com.jojo.sudoku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class InGame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_in_game);

        Intent intent = getIntent(); // Get the intent which started the activity
        final String difficulty = intent.getStringExtra("SELECTED_DIFFICULTY"); // Use the key in the intent extra to retrieve the string
        final TextView difficultyTextView = findViewById(R.id.difficulty_view);

        difficultyTextView.setText(difficulty);

    }




}
