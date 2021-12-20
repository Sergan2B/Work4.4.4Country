package com.example.work444;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

public class ViewHolder extends RecyclerView.ViewHolder {

    private ImageView imageMatheric;
    private TextView tvMatheric;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        imageMatheric = itemView.findViewById(R.id.imageViewMatheric);
        tvMatheric = itemView.findViewById(R.id.textViewMatheric);
    }

    public void onBind(Matheric matheric, Context context) {
        Glide.with(context).load(matheric.getImageMatheric()).into(imageMatheric);
        tvMatheric.setText(matheric.getTvMatheric());
    }
}
