package com.example.work444;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterCountry extends RecyclerView.Adapter<ViewHolderCountry> {

    private Context context;
    private ArrayList<Country> dataCountry;

    public AdapterCountry(ArrayList<Country> countries, Context context) {
        this.context = context;
        this.dataCountry = countries;
    }

    @NonNull
    @Override
    public ViewHolderCountry onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolderCountry(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_country, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderCountry holder, int position) {
        holder.onBind(dataCountry.get(position), context);
    }

    @Override
    public int getItemCount() {
        return dataCountry.size();
    }
}
