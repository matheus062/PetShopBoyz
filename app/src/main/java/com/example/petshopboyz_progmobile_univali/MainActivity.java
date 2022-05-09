package com.example.petshopboyz_progmobile_univali;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        Button buttonLogin = findViewById(R.id.buttonLogin);
        buttonLogin.setOnClickListener (v -> setContentView(R.layout.home));

//        ImageButton buttonSched = (findViewById(R.id.calendarButton) != null) ? findViewById(R.id.calendarButton) : null;
//        if(buttonSched != null){
//            buttonSched.setOnClickListener (v -> setContentView(R.layout.scheduling));
//        }

    }
}