package com.example.farmbnb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class VenueActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_venue);
    }

    public void burgermenu(View v){
        Intent intent = new Intent (this, BurgerActivity.class);
        startActivity(intent);
    }

    public void goToHome(View v){
        Intent intent = new Intent (this, HomeActivity.class);
        startActivity(intent);
    }
}
