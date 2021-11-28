package com.example.utsmoprog;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.utsmoprog.adapter.ItemList3Adapter;
import com.example.utsmoprog.databinding.ActivityOrderBinding;
import com.example.utsmoprog.model.Item;

import java.util.ArrayList;

public class OrderActivity extends AppCompatActivity {

    private ActivityOrderBinding binding;
    private final ArrayList<Item> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityOrderBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.rvMyorder.setHasFixedSize(true);
        showRecyclerView();

        binding.btnMyorder.setOnClickListener(v -> startActivity(new Intent(this, MyOrderActivity.class)));
    }

    private void showRecyclerView() {
        ItemList3Adapter adapter = new ItemList3Adapter(list);
        binding.rvMyorder.setLayoutManager(new LinearLayoutManager(this));
        binding.rvMyorder.setAdapter(adapter);
    }
}