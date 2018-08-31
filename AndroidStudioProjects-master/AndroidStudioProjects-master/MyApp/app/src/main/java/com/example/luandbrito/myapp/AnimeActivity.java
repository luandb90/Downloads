package com.example.luandbrito.myapp;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class AnimeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anime);

        //Escondendo o actionBar default

        getSupportActionBar() .hide();

        //Recuperando dados

        String name = getIntent().getExtras()
                .getString("anime_name");
        String description = getIntent().getExtras()
                .getString("anime_description");
        String studio = getIntent().getExtras()
                .getString("anime_studio");
        String category = getIntent().getExtras()
                .getString("anime_category");
        String rating = getIntent().getExtras()
                .getString("anime_rating");
        int nd_episode = getIntent().getExtras()
                .getInt("anime_nd_episode");
        String image_url = getIntent().getExtras()
                .getString("anime_img");

        //Iniciando as views

        CollapsingToolbarLayout collapsingToolbarLayout =
                findViewById((R.id.collapsingtoolbar_id));

        collapsingToolbarLayout.setTitleEnabled(true);

        TextView tv_name= findViewById((R.id.aa_anime_name));
        TextView tv_studio= findViewById((R.id.aa_studio));
        TextView tv_category= findViewById((R.id.aa_categoria));
        TextView tv_description= findViewById((R.id.aa_description));
        TextView tv_rating= findViewById((R.id.aa_rating));
        ImageView img= findViewById((R.id.aa_thumbnail));
        //setando valores para as views
        tv_name.setText(name);
        tv_studio.setText(studio);
        tv_category.setText(category);
        tv_description.setText(description);
        tv_rating.setText(rating);


        collapsingToolbarLayout.setTitle(name);

        RequestOptions resquestOption = new RequestOptions().centerCrop().placeholder
                (R.drawable.loading_shape).error(R.drawable.loading_shape);

        //setando imagem usado o Glide

        Glide.with(this).load(image_url).
                apply(resquestOption).into(img);



    }
}
