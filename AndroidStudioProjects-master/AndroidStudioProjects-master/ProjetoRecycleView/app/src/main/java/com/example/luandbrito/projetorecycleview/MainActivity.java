package com.example.luandbrito.projetorecycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String URL_DATA = "https://simplifiedcoding.net/demos/marvel/";
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;

    private List<Listaitem> listItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycleView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        listItems = new ArrayList<>();


        for (int i = 0; i <= 10; i++) {
            Listaitem listaItem = new Listaitem(
                    "Título " + (i + 1),
                    "Lorem ipsum dummy text"

            );

            listaItem.add(listaItem);
        }

        List<Listaitem> listaItem;
        adapter = new MyAdapter(listaItem,this);

        recyclerView.setAdapter(adapter);



    }


}