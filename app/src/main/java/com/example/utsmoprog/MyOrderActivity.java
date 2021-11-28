package com.example.utsmoprog;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.utsmoprog.adapter.ItemListAdapter;
import com.example.utsmoprog.databinding.ActivityMyOrderBinding;
import com.example.utsmoprog.model.Item;
import com.example.utsmoprog.model.ItemsData;

import java.util.ArrayList;

public class MyOrderActivity extends AppCompatActivity {

    private ActivityMyOrderBinding binding;
    private final ArrayList<Item> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMyOrderBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.rvMyorder.setHasFixedSize(true);
        list.addAll(ItemsData.getListData());
        showRecyclerView();
    }

    private void showRecyclerView() {
        ItemListAdapter adapter = new ItemListAdapter(list);
        binding.rvMyorder.setLayoutManager(new LinearLayoutManager(this));
        binding.rvMyorder.setAdapter(adapter);
    }
}