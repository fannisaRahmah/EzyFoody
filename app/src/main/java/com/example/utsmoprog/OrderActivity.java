package com.example.utsmoprog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;

import com.example.utsmoprog.adapter.ItemList2Adapter;
import com.example.utsmoprog.adapter.ItemListAdapter;
import com.example.utsmoprog.databinding.ActivityDrinksBinding;
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

        binding.btnMyorder.setOnClickListener(v -> startActivity(new Intent(this, MyOrderActivity.class)));
    }

//    private void showRecyclerView() {
//        ItemList2Adapter adapter = new ItemList2Adapter(list);
//        binding.rvMyorder.setLayoutManager(new LinearLayoutManager(this));
//        binding.rvMyorder.setAdapter(adapter);
//    }
}