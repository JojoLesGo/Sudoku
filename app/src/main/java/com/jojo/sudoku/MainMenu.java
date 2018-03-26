package com.jojo.sudoku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main_menu);

        final Button easy_button = findViewById(R.id.easy_button);
        final Button medium_button = findViewById(R.id.medium_button);
        final Button hard_button = findViewById(R.id.hard_button);

        easy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Change activity
                startGame(easy_button);

                // Run code to initialize game

            }
        });

        medium_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Change activity
                startGame(medium_button);

                // Run code to initialize game

            }
        });

        hard_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Change activity
                startGame(hard_button);

                // Run code to initialize game

            }
        });

    }
    public void startGame(Button button){
        Intent intent = new Intent(this, InGame.class);
        intent.putExtra("SELECTED_DIFFICULTY", button.getText());
        startActivity(intent);
    }


}