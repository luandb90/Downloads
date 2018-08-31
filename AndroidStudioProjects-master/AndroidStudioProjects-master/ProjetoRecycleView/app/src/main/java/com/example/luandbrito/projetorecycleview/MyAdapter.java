package com.example.luandbrito.projetorecycleview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<Listaitem> listaItems;
    private Context context;


    public MyAdapter(List<Listaitem> listaItens, Context context) {
        this.listaItems = listaItens;
        this.context = context;
    }

    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


    View v = LayoutInflater.from(parent.getContext())
            .inflate(R.layout.lista_item, parent, false);

        return new ViewHolder(v);

    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {
        Listaitem listaitem =listaItems.get(position);

        holder.txtTitulo.setText(listaitem.getTitulo());
        holder.txtDescricao.setText(listaitem.getDescricao());

    }

    @Override
    public int getItemCount() {
        return listaItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView txtTitulo;
        public TextView txtDescricao;



        public ViewHolder(View itemView) {
            super(itemView);

            txtTitulo = (TextView) itemView.findViewById(R.id.txtTitulo);
            txtDescricao = (TextView) itemView.findViewById(R.id.txtDescricao);
        }
    }
}
