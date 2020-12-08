package com.fushaolei.android_mix_recyclerview_demo;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter {
    public static final int TYPE_ONE = 1;
    public static final int TYPE_TWO = 2;

    private List<Bean> beanList = new ArrayList<>();

    public MyAdapter(List<Bean> beanList) {
        this.beanList = beanList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        switch (viewType) {
            case TYPE_ONE:
//                view  = View.inflate(parent.getContext(), R.layout.item_type_one,null);
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_type_one,parent,false);
                return new OneViewHolder(view);
            case TYPE_TWO:
//                view  = View.inflate(parent.getContext(), R.layout.item_type_two,null);
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_type_two,parent,false);
                return new TwoViewHolder(view);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        if (holder instanceof OneViewHolder) {
            ((OneViewHolder) holder).mCover.setImageResource(beanList.get(position).getPic());
            ((OneViewHolder) holder).mDesc.setText(beanList.get(position).getDesc());
            ((OneViewHolder) holder).mTitle.setText(beanList.get(position).getTitle());
        } else if (holder instanceof TwoViewHolder) {
            ((TwoViewHolder) holder).mAvator.setImageResource(beanList.get(position).getPic());
            ((TwoViewHolder) holder).mName.setText(beanList.get(position).getName());
            ((TwoViewHolder) holder).mButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.e("==","你点击的是第 "+position+" 项");
                 }
            });
        }
    }

    @Override
    public int getItemViewType(int position) {
        int layoutStyle = beanList.get(position).getLayoutStyle();
        switch (layoutStyle) {
            case 1:
                return TYPE_ONE;
            case 2:
                return TYPE_TWO;
        }
        return 0;
    }

    @Override
    public int getItemCount() {
        return beanList.size();
    }

    private class OneViewHolder extends RecyclerView.ViewHolder{
        private ImageView mCover;
        private TextView mDesc;
        private TextView mTitle;

        public OneViewHolder(@NonNull View itemView) {
            super(itemView);
            mCover = itemView.findViewById(R.id.iv_cover);
            mDesc = itemView.findViewById(R.id.tv_desc);
            mTitle = itemView.findViewById(R.id.tv_title);
        }
    }
    private class TwoViewHolder extends RecyclerView.ViewHolder{
        private ImageView mAvator;
        private TextView mName;
        private Button mButton;

        public TwoViewHolder(@NonNull View itemView) {
            super(itemView);
            mAvator = itemView.findViewById(R.id.iv_avator);
            mName = itemView.findViewById(R.id.tv_name);
            mButton = itemView.findViewById(R.id.btn_btn);
        }
    }
}
