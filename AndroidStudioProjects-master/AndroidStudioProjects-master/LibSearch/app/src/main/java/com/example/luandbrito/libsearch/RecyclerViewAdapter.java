package com.example.luandbrito.libsearch;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import org.w3c.dom.Text;

import java.util.List;

public class RecyclerViewAdapter  extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHoder> {


    private Context myContext;
    private List<Livros> mData;
    RequestOptions options;


    public RecyclerViewAdapter(Context myContext, List<Livros> mData, RequestOptions options) {
        this.myContext = myContext;
        this.mData = mData;
        this.options = options;


        options = new RequestOptions().centerCrop()
                .placeholder(R.drawable.loading_shape)
                .error(R.drawable.loading_shape);

    }

    @NonNull
    @Override
    public MyViewHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View view;

        LayoutInflater inflater = LayoutInflater.from(myContext);

        view = inflater.inflate(R.layout.home_layout, parent, false);
        final MyViewHoder viewHoder = new MyViewHoder(view);
        viewHoder.view_container.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(myContext, LivrosActivity.class);
                i.putExtra("user_nome",
                        mData.get(viewHoder.getAdapterPosition()).getNome());

                i.putExtra("livro_nome",
                        mData.get(viewHoder.getAdapterPosition()).getdescricao());

                i.putExtra("livro_autor",
                        mData.get(viewHoder.getAdapterPosition()).getAutor());

                i.putExtra("thumbnail",
                        mData.get(viewHoder.getAdapterPosition()).getImage_url());

                i.putExtra("livro_preco",
                        mData.get(viewHoder.getAdapterPosition()).getPerco());

                i.putExtra("livro_descricao",
                        mData.get(viewHoder.getAdapterPosition()).getdescricao());

                i.putExtra("user_email",
                        mData.get(viewHoder.getAdapterPosition()).getEmail());

                i.putExtra("user_cpf",
                        mData.get(viewHoder.getAdapterPosition()).getCpf());

                myContext.startActivity(i);
            }
        });

        return viewHoder;

    }
    @Override
    public void onBindViewHolder(@NonNull MyViewHoder holder, int position) {


        holder.tv_nomelivro.setText(mData.get(position).getNome());
        holder.tv_autor.setText(mData.get(position).getAutor());
        holder.tv_preco.setText(mData.get(position).getPerco());


    }

    @Override
    public int getItemCount() { return 0;}

    public class MyViewHoder extends RecyclerView.ViewHolder {

        TextView tv_nome;
        TextView tv_nomelivro;
        TextView tv_autor;
        TextView img_thumbinail;
        TextView tv_preco;
        TextView tv_descricao;
        TextView tv_email;
        TextView tv_cpf;
        LinearLayout view_container;



        public MyViewHoder(View itemView) {
            super(itemView);

            view_container = itemView.findViewById(R.id.container);
            tv_nomelivro = itemView.findViewById(R.id.nome_livro);
            tv_autor = itemView.findViewById(R.id.autor);
            tv_preco = itemView.findViewById(R.id.aa_preco);
            tv_descricao = itemView.findViewById(R.id.aa_descricao);
            View thumbnail = itemView.findViewById(R.id.thumbnail);


        }
    }
}
