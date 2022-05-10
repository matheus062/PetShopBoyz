package com.example.petshopboyz_progmobile_univali;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageButton buttonSched = (findViewById(R.id.calendarButton) != null) ? findViewById(R.id.calendarButton) : null;
        if (buttonSched != null) {
            buttonSched.setOnClickListener(view -> {
                Intent switchActivityIntent = new Intent(this, SchedActivity.class);
                startActivity(switchActivityIntent);
            });
        }
    }
}