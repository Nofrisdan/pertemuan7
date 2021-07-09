package com.example.nofrisdan_pertemuan7;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends
        RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private ArrayList<String> rvData;
    public RecyclerViewAdapter(ArrayList<String> DataList) {
        rvData = DataList;
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tvTittle;
        public TextView tvSubtitle;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTittle = (TextView) itemView.findViewById(R.id.tv_tit);
            tvSubtitle = (TextView) itemView.findViewById(R.id.tv_sub);
        }
    }
    @NonNull @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.recyclerview_item, viewGroup, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        final String nama = rvData.get(i);
        viewHolder.tvTittle.setText(rvData.get(i));
        viewHolder.tvSubtitle.setText("Anjarwati " + i);
    }
    @Override
    public int getItemCount() {
        return rvData.size();
    }
}
