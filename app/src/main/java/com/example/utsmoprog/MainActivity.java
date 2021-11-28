package com.example.utsmoprog;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    CardView drinks;

    private RecyclerView recyclerView;
//    private ItemAdapter itemAdapter;
    private GridLayoutManager gridLayoutManager;
    private List<Item> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drinks = findViewById(R.id.drinks);

        drinks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent drink = new Intent(MainActivity.this, DrinksActivity.class);
            }
        });

//        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
//
//        initItemData();
//
//        gridLayoutManager = new GridLayoutManager(this, SPAN_COUNT_ONE);
//
//        recyclerView = findViewById(R.id.rv);
//        recyclerView.setAdapter(itemAdapter);
//        recyclerView.setLayoutManager(gridLayoutManager);
    }

//    private void initItemData(){
//        items = new ArrayList<>(4);
//        items.add(new Item(R.drawable.airmineral, "Air Mineral", "Rp. 4.000,-"));
//        items.add(new Item(R.drawable.airmineral, "Air Mineral", "Rp. 4.000,-"));
//        items.add(new Item(R.drawable.airmineral, "Air Mineral", "Rp. 4.000,-"));
//        items.add(new Item(R.drawable.airmineral, "Air Mineral", "Rp. 4.000,-"));
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        return super.onCreateOptionsMenu(menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        if(item.getItemId() == R.id.menu_switch_Layout){
//            switchLayout();
//            switchIcon();
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
//
//    private void switchLayout(){
//        if(gridLayoutManager.getSpanCount() == SPAN_COUNT_ONE){
//            gridLayoutManager.setSpanCount(SPAN_COUNT_THREE);
//        }else{
//            gridLayoutManager.setSpanCount(SPAN_COUNT_ONE);
//        }
//        itemAdapter.notifyItemRangeChanged(0, itemAdapter.getItemCount());
//    }
//
//    private void switchIcon(){
//        if(gridLayoutManager.getSpanCount() == SPAN_COUNT_THREE){
//            item.setIcon(getResources().getDrawable(R.drawable.ic_span_3));
//        }else{
//            item.setIcon(getResources().getDrawable(R.drawable.ic_span_1));
//        }
//    }
}