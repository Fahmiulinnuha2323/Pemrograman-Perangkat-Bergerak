package com.funqud.clubindonesia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    public boolean onSupportNavigateUp(){
        onBackPressed();
        return true;
    }
}
