package com.example.android.venessavisintry_1202150247_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;

public class Menu extends AppCompatActivity {

    // untuk deklarasi objek
    private final LinkedList<String> foods = new LinkedList<>();
    private final LinkedList<Integer> priceses = new LinkedList<>();
    private final LinkedList<Integer> photos = new LinkedList<>();
    private int mCount = 0;

    private RecyclerView mRecyclerView;
    private MenuAdapter mAdapter;

    // method ketika dijalankan saat activity dibuat
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        dummiesData();
        // Get a handle to the RecyclerView.
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        // membuat adapter dan memanggil data yang akan ditampilkan
        mAdapter = new MenuAdapter(this, foods, priceses, photos);
        // menghubungkan adaptor dengan RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // memberikan RecyclerView sebagai pengelola tata letak default.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void dummiesData(){
        for (int i = 0;i < 3; i++){
            // memberi dan memanggil nama untuk data yang ditampilkan
            foods.add("Burger");
            foods.add("Dessert");
            foods.add("Chocolate Pudding");
            foods.add("Spaghetti");
            foods.add("Beef Pizza");
            foods.add("Sate");
            foods.add("Steak Tuna");
            foods.add("Milkshake Chocolate");
            foods.add("Lemon Tea");

            // mamanggil harga
            priceses.add(35000);
            priceses.add(32000);
            priceses.add(30000);
            priceses.add(42000);
            priceses.add(62000);
            priceses.add(33000);
            priceses.add(38000);
            priceses.add(28000);
            priceses.add(26000);

            // memanggil foto yang ada di drawable
            photos.add(R.drawable.burger);
            photos.add(R.drawable.dessert);
            photos.add(R.drawable.chopudding);
            photos.add(R.drawable.spaghetti);
            photos.add(R.drawable.pizza);
            photos.add(R.drawable.sate);
            photos.add(R.drawable.steak);
            photos.add(R.drawable.milkshake);
            photos.add(R.drawable.lemon);
        }
    }
}
