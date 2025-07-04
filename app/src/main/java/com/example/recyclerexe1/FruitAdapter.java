package com.example.recyclerexe1;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.net.CookieHandler;
import java.util.ArrayList;

public class FruitAdapter extends RecyclerView.Adapter<FruitAdapter.FruitViewHolder>
{
    private ArrayList<ItemFruit> dataList;
    public FruitAdapter(ArrayList<ItemFruit> fruitList) {
        this.dataList = fruitList;
    }
    public class FruitViewHolder extends RecyclerView.ViewHolder{
        public final TextView tvDesc;
        public final TextView tvName;
        public final ImageView ivFruitImage;

        public FruitViewHolder(View view)
        {
            super(view);
            tvDesc = view.findViewById(R.id.FruitDesc);
            tvName = view.findViewById(R.id.FruitName);
            ivFruitImage = view.findViewById(R.id.ImgViewFruit);
        }
    }
    @NonNull
    @Override
    public FruitAdapter.FruitViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = View.inflate(parent.getContext(),R.layout.item_row,null);
        return new FruitViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FruitAdapter.FruitViewHolder holder, int position) {

        ItemFruit currentItem = dataList.get(position);
        holder.tvDesc.setText((currentItem.getDescription()));
        holder.tvName.setText((currentItem.getName()));
        holder.ivFruitImage.setImageResource((currentItem.getImageResource()));
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}
