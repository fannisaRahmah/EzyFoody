package com.example.utsmoprog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;

import com.example.utsmoprog.adapter.ItemList2Adapter;
import com.example.utsmoprog.adapter.ItemListAdapter;
import com.example.utsmoprog.databinding.ActivityMyOrderBinding;
import com.example.utsmoprog.databinding.ActivityOrderCompleteBinding;
import com.example.utsmoprog.model.Item;
import com.example.utsmoprog.model.ItemsData;

import java.util.ArrayList;

public class OrderCompleteActivity extends AppCompatActivity {

    private ActivityOrderCompleteBinding binding;
    private final ArrayList<Item> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityOrderCompleteBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.rvPayitem.setHasFixedSize(true);
        list.addAll(ItemsData.getListData());
        showRecyclerView();

        binding.btnMenuUtama.setOnClickListener(v -> startActivity(new Intent(this, MainActivity.class)));
    }

    private void showRecyclerView() {
        ItemList2Adapter adapter = new ItemList2Adapter(list);
        binding.rvPayitem.setLayoutManager(new LinearLayoutManager(this));
        binding.rvPayitem.setAdapter(adapter);
    }
}