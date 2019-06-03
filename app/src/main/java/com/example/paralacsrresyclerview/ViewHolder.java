package com.example.paralacsrresyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.VectorEnabledTintResources;
import android.view.View;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.github.abdularis.piv.VerticalScrollParallaxImageView;
import com.github.abdularis.piv.transformer.VerticalParallaxTransformer;

public class ViewHolder extends RecyclerView.ViewHolder {
    private TextView textView;
    private VerticalScrollParallaxImageView imageView;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.tView);
        imageView = itemView.findViewById(R.id.imageView);
        imageView.setViewTransformer(new VerticalParallaxTransformer());
    }

    public void bind(SampelEntiti item) {
        textView.setText(item.getTitle());

        Glide.with(itemView)
                .load(item.getPath())
                .apply(RequestOptions.centerCropTransform())
                .into(imageView);
    }
}
