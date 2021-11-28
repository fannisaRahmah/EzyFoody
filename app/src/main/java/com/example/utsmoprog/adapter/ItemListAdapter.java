package com.example.utsmoprog.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.utsmoprog.R;
import com.example.utsmoprog.databinding.ActivityMyorderItemBinding;
import com.example.utsmoprog.model.Item;

import java.util.ArrayList;

public class ItemListAdapter extends RecyclerView.Adapter<ItemListAdapter.ViewHolder> {

    private ArrayList<Item> itemArrayList;

    public ItemListAdapter(ArrayList<Item> itemArrayList) {
        this.itemArrayList = itemArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_myorder_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Item item = itemArrayList.get(position);
        holder.binding.tvName.setText(item.getName());
        holder.binding.tvPrice.setText(item.getPrice());
        Glide.with(holder.itemView.getContext())
                .load(item.getImage())
                .into(holder.binding.ivImage);
    }

    @Override
    public int getItemCount() {
        return itemArrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private final ActivityMyorderItemBinding binding;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            binding = ActivityMyorderItemBinding.bind(itemView);
        }
    }
}
