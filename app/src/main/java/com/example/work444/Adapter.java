package com.example.work444;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<ViewHolder> {

    private ArrayList<Matheric> dataMatheric;
    private onClickItem onClickItem;
    private Context context;

    public Adapter(ArrayList<Matheric> dataMatheric, onClickItem onClickItem, Context context) {
        this.dataMatheric = dataMatheric;
        this.onClickItem = onClickItem;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_matheric, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.onBind(dataMatheric.get(position), context);
        holder.itemView.setOnClickListener(view -> onClickItem.onClick(position));
    }

    @Override
    public int getItemCount() {
        return dataMatheric.size();
    }
}
