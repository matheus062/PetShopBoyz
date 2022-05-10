package com.example.petshopboyz_progmobile_univali;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class SchedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sched);

        ImageButton buttonHome = (findViewById(R.id.homeButton) != null) ? findViewById(R.id.homeButton) : null;
        if (buttonHome != null) {
            buttonHome.setOnClickListener(view -> {
                Intent switchActivityIntent = new Intent(this, HomeActivity.class);
                startActivity(switchActivityIntent);
            });
        }
    }
}