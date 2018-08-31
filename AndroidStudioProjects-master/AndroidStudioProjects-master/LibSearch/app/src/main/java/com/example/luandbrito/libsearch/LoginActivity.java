package com.example.luandbrito.libsearch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;


public class LoginActivity extends AppCompatActivity {

    EditText emailEntrar, senhaEntrar;
    Button botaoentrardoentrar;
    RadioButton  cadastrar;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        emailEntrar = (EditText)findViewById(R.id.emailEntrar);
        senhaEntrar = (EditText)findViewById(R.id.senhaEntrar);
        botaoentrardoentrar = (Button)findViewById((R.id.botaoentrardoentrar));
        cadastrar = (RadioButton)findViewById(R.id.cadastrar);

    }


}
