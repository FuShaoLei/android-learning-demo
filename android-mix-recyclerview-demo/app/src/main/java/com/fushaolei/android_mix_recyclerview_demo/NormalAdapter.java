package com.fushaolei.android_mix_recyclerview_demo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NormalAdapter extends RecyclerView.Adapter<NormalAdapter.ViewHolder> {
    List<Bean> mData = new ArrayList<>();

    public NormalAdapter(List<Bean> mData) {
        this.mData = mData;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_type_one,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.mCover.setImageResource(mData.get(position).getPic());
        holder.mDesc.setText(mData.get(position).getDesc());
        holder.mTitle.setText(mData.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView mCover;
        private TextView mDesc;
        private TextView mTitle;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mCover = itemView.findViewById(R.id.iv_cover);
            mDesc = itemView.findViewById(R.id.tv_desc);
            mTitle = itemView.findViewById(R.id.tv_title);
        }
    }
}
