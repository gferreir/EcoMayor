package com.example.gferreir.ecomayor;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class TreeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tree_activity);
    }

    public void goToBackOnClick(View view){
        startActivity(new Intent(this, MainActivity.class));
    }

}
