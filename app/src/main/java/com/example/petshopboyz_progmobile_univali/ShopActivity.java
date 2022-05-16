package com.example.petshopboyz_progmobile_univali;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class ShopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);

        ImageButton newSchedButton = (findViewById(R.id.newSchedButton) != null) ? findViewById(R.id.newSchedButton) : null;
        if (newSchedButton != null) {
            newSchedButton.setOnClickListener(view -> {
                Intent switchActivityIntent = new Intent(this, CreateSchedActivity.class);
                startActivity(switchActivityIntent);
            });
        }

        ImageButton buttonHome = (findViewById(R.id.homeButton) != null) ? findViewById(R.id.homeButton) : null;
        if (buttonHome != null) {
            buttonHome.setOnClickListener(view -> {
                Intent switchActivityIntent = new Intent(this, HomeActivity.class);
                startActivity(switchActivityIntent);
            });
        }

        ImageButton buttonSched = (findViewById(R.id.calendarButton) != null) ? findViewById(R.id.calendarButton) : null;
        if (buttonSched != null) {
            buttonSched.setOnClickListener(view -> {
                Intent switchActivityIntent = new Intent(this, SchedActivity.class);
                startActivity(switchActivityIntent);
            });
        }

        ImageButton buttonConfig = (findViewById(R.id.settingButton) != null) ? findViewById(R.id.settingButton) : null;
        if (buttonConfig != null) {
            buttonConfig.setOnClickListener(view -> {
                Intent switchActivityIntent = new Intent(this, ConfigActivity.class);
                startActivity(switchActivityIntent);
            });
        }
        ImageButton buttonPetVisualization = (findViewById(R.id.petButton) != null) ? findViewById(R.id.petButton) : null;
        if (buttonPetVisualization != null) {
            buttonPetVisualization.setOnClickListener(view -> {
                Intent switchActivityIntent = new Intent(this, PetVisualization.class);
                startActivity(switchActivityIntent);
            });
        }

        ImageButton accountButton = (findViewById(R.id.userButton) != null) ? findViewById(R.id.userButton) : null;
        if (accountButton != null) {
            accountButton.setOnClickListener(view -> {
                Intent switchActivityIntent = new Intent(this, accountSettings.class);
                startActivity(switchActivityIntent);
            });
        }

    }
}