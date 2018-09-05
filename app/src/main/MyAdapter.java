package com.example.dsm2017.blinkstudy;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>  {

    private ArrayList<Row_Info> Row_InfoArrayList;
    MyAdapter(ArrayList<Row_Info> foodInfoArrayList){
        this.Row_InfoArrayList = foodInfoArrayList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_row, parent, false);

        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        MyViewHolder myViewHolder = (MyViewHolder) holder;

        myViewHolder.tvtitle.setText(Row_InfoArrayList.get(position).title);
        myViewHolder.tvnotice.setText(Row_InfoArrayList.get(position).notice);
    }

    @Override
    public int getItemCount() {
        return Row_InfoArrayList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvtitle;
        TextView tvnotice;

        MyViewHolder(View view){
            super(view);
            tvtitle = view.findViewById(R.id.tv_title);
            tvnotice = view.findViewById(R.id.tv_notice);
        }
    }

}
