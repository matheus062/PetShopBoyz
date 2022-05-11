package com.example.petshopboyz_progmobile_univali;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class ConfigActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config);

        ImageButton buttonShop = (findViewById(R.id.shopButton) != null) ? findViewById(R.id.shopButton) : null;
        if (buttonShop != null) {
            buttonShop.setOnClickListener(view -> {
                Intent switchActivityIntent = new Intent(this, ShopActivity.class);
                startActivity(switchActivityIntent);
            });
        }

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
    }
}