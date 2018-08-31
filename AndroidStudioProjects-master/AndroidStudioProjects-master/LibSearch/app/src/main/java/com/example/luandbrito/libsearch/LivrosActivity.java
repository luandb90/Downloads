package com.example.luandbrito.libsearch;

import android.app.Activity;
import android.app.DownloadManager;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.ActivityCompat;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class LivrosActivity extends Activity {

    public LivrosActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_livros);

    getActionBar() . hide();


    String nome = getIntent() . getExtras()
            .getString("user_nome");
        String livro = getIntent() . getExtras()
                .getString("livro_nome");
        String autor = getIntent() . getExtras()
                .getString("livro_autor");
        String image_url = getIntent() . getExtras()
                .getString("thumbnail");
        String preco = getIntent() . getExtras()
                .getString("livro_preco");
        String descricao = getIntent() . getExtras()
                .getString("livro_descricao");
        String email = getIntent() . getExtras()
                .getString("user_email");
        String cpf = getIntent() . getExtras()
                .getString("user_cpf");



        CollapsingToolbarLayout collapsingToolbarLayout =
                findViewById((R.id.collapsingtoolbar_id));

        collapsingToolbarLayout.setTitleEnabled(true);

        TextView tv_nome= findViewById((R.id.aa_livro_name));
        TextView tv_autor= findViewById((R.id.aa_autor));
        TextView tv_preco= findViewById((R.id.aa_preco));
        TextView tv_descricao= findViewById((R.id.aa_descricao));
        ImageView img= findViewById((R.id.aa_thumbnail));

        tv_nome.setText(nome);
        tv_autor.setText(autor);
        tv_preco.setText(preco);
        tv_descricao.setText(descricao);


        collapsingToolbarLayout.setTitle(nome);

        RequestOptions resquestOption = new RequestOptions().centerCrop().placeholder(R.drawable.loading_shape).error(R.drawable.loading_shape);


        Glide.with(this).load(image_url).
                apply(resquestOption).into(img);

    }
}

