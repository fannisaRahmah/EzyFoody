package com.example.utsmoprog.model;

import com.example.utsmoprog.R;

import java.util.ArrayList;

public class ItemsData {

    private static String[] itemName = {
            "Air Mineral",
            "Jus Apel",
            "Jus Mangga",
            "Jus Alpukat"
    };

    public static String[] itemPrice = {
            "Rp 4.000,-",
            "Rp 10.000,-",
            "Rp 12.000,-",
            "Rp 15.000,-"
    };

    public static int[] itemPhoto = {
            R.drawable.airmineral,
            R.drawable.apel,
            R.drawable.mangga,
            R.drawable.alpukat
    };

    public static int[] itemQty = {
            1,
            5,
            2,
            8
    };

    public static ArrayList<Item> getListData() {
        ArrayList<Item> list = new ArrayList<>();
        for (int position = 0; position < itemName.length; position++) {
            Item data = new Item();
            data.setName(itemName[position]);
            data.setPrice(itemPrice[position]);
            data.setImage(itemPhoto[position]);
            data.setQuantity(itemQty[position]);
            list.add(data);
        }
        return list;
    }

}