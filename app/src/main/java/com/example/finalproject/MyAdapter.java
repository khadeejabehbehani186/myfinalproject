package com.example.finalproject;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter {


    ArrayList<deafdumb> pArray;
    Context gt;

    public MyAdapter(ArrayList<deafdumb> pArray, Context gt) {
        this.pArray = pArray;
        this.gt = gt;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.deaf_dumb,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        ((ViewHolder)holder).image.setImageResource(pArray.get(position).getImage());
        ((ViewHolder)holder).name.setText(pArray.get(position).getName());
        ((ViewHolder)holder).view.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent v = new Intent(gt,MainActivity4.class);
                v.putExtra("oo",pArray.get(position));
                 gt.startActivity(v);


            }
        });
    }

    @Override
    public int getItemCount() {
        return pArray.size();
    }



    public static class ViewHolder extends RecyclerView.ViewHolder{

        public TextView name;
        public ImageView image , image1,image2,image3;
        public View view;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            name= itemView.findViewById(R.id.textView5);
            image = itemView.findViewById(R.id.image9);
        }
    }
}
