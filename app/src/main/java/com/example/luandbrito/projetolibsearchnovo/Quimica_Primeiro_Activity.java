package com.example.luandbrito.projetolibsearchnovo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Quimica_Primeiro_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quimica_primeiro_layout);
    }

    public void home(View view) {
        Intent intent = new Intent(Quimica_Primeiro_Activity.this, HomeActivity.class);
        startActivity(intent);
        finish();
    }
}
