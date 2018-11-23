package com.example.gferreir.ecomayor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToTreeOnClick(View view){
        startActivity(new Intent(this, TreeActivity.class));
    }

    public void goToCarOnClick(View view){
        startActivity(new Intent(this, CarActivity.class));
    }

}
