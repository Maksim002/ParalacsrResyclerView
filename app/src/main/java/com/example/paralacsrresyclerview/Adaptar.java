package com.example.paralacsrresyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class Adaptar extends RecyclerView.Adapter<ViewHolder> {
    private List<SampelEntiti> list = new ArrayList<>();

    public Adaptar(List<SampelEntiti> list){
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.item_sample,viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
    viewHolder.bind(getItem(position));
    }

    public SampelEntiti getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getItemCount() {
        return list.size() ;
    }



}
