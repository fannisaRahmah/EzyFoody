package com.example.utsmoprog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;

import com.example.utsmoprog.adapter.ItemListAdapter;
import com.example.utsmoprog.databinding.ActivityDrinksBinding;
import com.example.utsmoprog.model.ItemsData;

public class DrinksActivity extends AppCompatActivity {

    private ActivityDrinksBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDrinksBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnOrder.setOnClickListener(v -> startActivity(new Intent(this, OrderActivity.class)));
        binding.btnMyorder.setOnClickListener(v -> startActivity(new Intent(this, MyOrderActivity.class)));
    }


}