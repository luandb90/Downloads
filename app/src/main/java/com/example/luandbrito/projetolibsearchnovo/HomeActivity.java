package com.example.luandbrito.projetolibsearchnovo;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_layout);
    }

    public void biologia(View view) {
        Intent intent = new Intent(HomeActivity.this, Biologia_Primeiro_Activity.class);
        startActivity(intent);
        finish();


    }

    public void espanhol(View view) {
        Intent intent = new Intent(HomeActivity.this, Espanhol_Primeiro_Activity.class);
        startActivity(intent);
        finish();
    }

    public void fisica(View view) {
        Intent intent = new Intent(HomeActivity.this, Fisica_Primeiro_Activity.class);
        startActivity(intent);
        finish();
    }

    public void geografia(View view) {
        Intent intent = new Intent(HomeActivity.this, Geografia_Primeiro_Activity.class);
        startActivity(intent);
        finish();
    }

    public void historia(View view) {
        Intent intent = new Intent(HomeActivity.this, Historia_Primeiro_Activity.class);
        startActivity(intent);
        finish();
    }

    public void ingles(View view) {
        Intent intent = new Intent(HomeActivity.this, Ingles_Primeiro_Activity.class);
        startActivity(intent);
        finish();
    }

    public void linhas(View view) {
        Intent intent = new Intent(HomeActivity.this, Linhas_Primeiro_Activity.class);
        startActivity(intent);
        finish();
    }

    public void matematica(View view) {
        Intent intent = new Intent(HomeActivity.this, Matematica_Primeiro_Activity.class);
        startActivity(intent);
        finish();
    }

    public void portugues(View view) {
        Intent intent = new Intent(HomeActivity.this, Portugues_Primeiro_Activity.class);
        startActivity(intent);
        finish();
    }

    public void quimica(View view) {
        Intent intent = new Intent(HomeActivity.this, Quimica_Primeiro_Activity.class);
        startActivity(intent);
        finish();
    }

    public void biologiasegundo(View view) {
        Intent intent = new Intent(HomeActivity.this, Biologia_Segundo_Activity.class);
        startActivity(intent);
        finish();
    }

    public void espanholsegundo(View view) {
        Intent intent = new Intent(HomeActivity.this, Espanhol_Segundo_Activity.class);
        startActivity(intent);
        finish();
    }

    public void fisicasegundo(View view) {
        Intent intent = new Intent(HomeActivity.this, Fisica_Segundo_Activity.class);
        startActivity(intent);
        finish();
    }

    public void geografiasegundo(View view) {
        Intent intent = new Intent(HomeActivity.this, Geografia_Segundo_Activity.class);
        startActivity(intent);
        finish();
    }

    public void geometriasegundo(View view) {
        Intent intent = new Intent(HomeActivity.this, Geometria_Segundo_Activity.class);
        startActivity(intent);
        finish();
    }

    public void historiasegundo(View view) {
        Intent intent = new Intent(HomeActivity.this, Historia_Segundo_Activity.class);
        startActivity(intent);
        finish();
    }

    public void inglessegundo(View view) {
        Intent intent = new Intent(HomeActivity.this, Ingles_Segundo_Activity.class);
        startActivity(intent);
        finish();
    }

    public void matematicasegunda(View view) {
        Intent intent = new Intent(HomeActivity.this, Matematica_Segundo_Activity.class);
        startActivity(intent);
        finish();
    }

    public void portuguessegundo(View view) {
        Intent intent = new Intent(HomeActivity.this, Portugues_Segundo_Activity.class);
        startActivity(intent);
        finish();
    }

    public void quimicasegundo(View view) {
        Intent intent = new Intent(HomeActivity.this, Quimica_Segundo_Activity.class);
        startActivity(intent);
        finish();
    }

    public void biologiaterceiro(View view) {
        Intent intent = new Intent(HomeActivity.this, Biologia_Terceiro_Activity.class);
        startActivity(intent);
        finish();
    }

    public void espanholterceiro(View view) {
        Intent intent = new Intent(HomeActivity.this, Espanhol_Terceiro_Activity.class);
        startActivity(intent);
        finish();
    }

    public void fisicaterceiro(View view) {
        Intent intent = new Intent(HomeActivity.this, Fisica_Terceiro_Activity.class);
        startActivity(intent);
        finish();
    }

    public void geografiaterceiro(View view) {
        Intent intent = new Intent(HomeActivity.this, Geografia_Terceiro_Activity.class);
        startActivity(intent);
        finish();
    }

    public void geometriaterceiro(View view) {
        Intent intent = new Intent(HomeActivity.this, Geometria_Terceiro_Activity.class);
        startActivity(intent);
        finish();
    }

    public void historisterceiro(View view) {
        Intent intent = new Intent(HomeActivity.this, Historia_Terceiro_Activity.class);
        startActivity(intent);
        finish();
    }

    public void inglestcerceiro(View view) {
        Intent intent = new Intent(HomeActivity.this, Ingles_Terceiro_Activity.class);
        startActivity(intent);
        finish();
    }

    public void matematicaterceiro(View view) {
        Intent intent = new Intent(HomeActivity.this, Matematica_Terceiro_Activity.class);
        startActivity(intent);
        finish();
    }

    public void quimicaterceiro(View view) {
        Intent intent = new Intent(HomeActivity.this, Quimica_Terceiro_Activity.class);
        startActivity(intent);
        finish();
    }

    public void portuguesterceiro(View view) {
        Intent intent = new Intent(HomeActivity.this, Portugues_Terceiro_Activity.class);
        startActivity(intent);
        finish();
    }
}