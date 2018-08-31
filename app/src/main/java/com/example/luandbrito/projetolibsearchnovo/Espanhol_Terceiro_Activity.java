package com.example.luandbrito.projetolibsearchnovo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Espanhol_Terceiro_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.espanhol_terceiro_layout);
    }

    public void home(View view) {
        Intent intent = new Intent(Espanhol_Terceiro_Activity.this, HomeActivity.class);
        startActivity(intent);
        finish();
    }
}
