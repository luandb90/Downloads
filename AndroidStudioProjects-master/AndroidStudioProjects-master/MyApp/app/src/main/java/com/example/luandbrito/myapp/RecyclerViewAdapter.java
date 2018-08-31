package com.example.luandbrito.myapp;


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

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context myContext;
    private List<Anime>mData;
    RequestOptions option;


public RecyclerViewAdapter(Context myContext, List<Anime> mData){
    this.myContext = myContext;
    this.mData = mData;

    //Requerindo option para Glide


    option = new RequestOptions().centerCrop()
            .placeholder(R.drawable.loading_shape)
            .error(R.drawable.loading_shape);


}

    @NonNull
    @Override
    public RecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;

        LayoutInflater inflater = LayoutInflater.from(myContext);

        view = inflater.inflate(R.layout.anime_row_item, parent, false);
        final MyViewHolder viewHolder = new MyViewHolder(view);
        viewHolder.view_container.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(myContext, AnimeActivity.class);
                i.putExtra("anime_name",
                        mData.get(viewHolder.getAdapterPosition()).getName());
                i.putExtra("anime_description",
                        mData.get(viewHolder.getAdapterPosition()).getDescription());
                i.putExtra("anime_studio",
                        mData.get(viewHolder.getAdapterPosition()).getStudio());
                i.putExtra("anime_category",
                        mData.get(viewHolder.getAdapterPosition()).getCategorie());
                i.putExtra("anime_nb_episode",
                        mData.get(viewHolder.getAdapterPosition()).getNb_episode());
                i.putExtra("anime_rating",
                        mData.get(viewHolder.getAdapterPosition()).getRating());
                i.putExtra("anime_img",
                        mData.get(viewHolder.getAdapterPosition()).getImage_url());

                myContext.startActivity(i);
            }
        });

        return viewHolder;

    }
    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.MyViewHolder holder, int position) {

        holder.tv_name.setText(mData.get(position).getName());
        holder.tv_rating.setText(mData.get(position).getRating());
        holder.tv_studio.setText(mData.get(position).getStudio());
        holder.tv_category.setText(mData.get(position).getCategorie());


        Glide.with(myContext).load(mData.get(position)
                .getImage_url()).apply(option)
                .into(holder.img_thumbnail);


    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tv_name;
        TextView tv_rating;
        TextView tv_studio;
        TextView tv_category;
        ImageView img_thumbnail;
        LinearLayout view_container;



        public MyViewHolder(View itemView) {
            super(itemView);

            view_container = itemView.findViewById(R.id.container);
            tv_name = itemView.findViewById(R.id.anime_name);
            tv_rating = itemView.findViewById(R.id.rating);
            tv_studio = itemView.findViewById(R.id.studio);
            tv_category = itemView.findViewById(R.id.categorie);
            img_thumbnail = itemView.findViewById(R.id.thumbnail);



        }
    }
}
