package com.example.utsmoprog;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.utsmoprog.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnDrinks.setOnClickListener(v -> startActivity(new Intent(this, DrinksActivity.class)));
        binding.btnMyorder.setOnClickListener(v -> startActivity(new Intent(this, MyOrderActivity.class)));
    }
}