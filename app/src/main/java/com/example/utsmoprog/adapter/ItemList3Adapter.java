package com.example.utsmoprog.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.utsmoprog.R;
import com.example.utsmoprog.databinding.ActivityOrderItemBinding;
import com.example.utsmoprog.model.Item;

import java.util.ArrayList;

public class ItemList3Adapter extends RecyclerView.Adapter<ItemList3Adapter.ViewHolder> {

    private final ArrayList<Item> itemArrayList;

    public ItemList3Adapter(ArrayList<Item> itemArrayList) {
        this.itemArrayList = itemArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_order_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Item item = itemArrayList.get(position);
        if (item.getName().equals("Jus Apel")){
            holder.binding.tvName.setText(item.getName());
            holder.binding.tvPrice.setText(item.getPrice());
            holder.binding.tvQty.setText(item.getQuantity());
            Glide.with(holder.itemView.getContext())
                    .load(item.getImage())
                    .into(holder.binding.ivImage);
        }
    }

    @Override
    public int getItemCount() {
        return itemArrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private final ActivityOrderItemBinding binding;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            binding = ActivityOrderItemBinding.bind(itemView);
        }
    }
}
