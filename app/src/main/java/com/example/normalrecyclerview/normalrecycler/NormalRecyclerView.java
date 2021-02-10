package com.example.normalrecyclerview.normalrecycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.normalrecyclerview.R;

import java.util.ArrayList;

public class NormalRecyclerView extends AppCompatActivity {

    RecyclerView normal_recycler;

    private PlanetAdapter adapter;
    private ArrayList<Planet> planetArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal_recycler_view);

        normal_recycler = findViewById(R.id.normal_recycler);

        normal_recycler.setLayoutManager(new LinearLayoutManager(this));
        planetArrayList = new ArrayList<>();
        adapter = new PlanetAdapter(this, planetArrayList);
        normal_recycler.setAdapter(adapter);
        normal_recycler.addItemDecoration(new DividerItemDecoration(this,
                LinearLayout.VERTICAL));
        createListData();
    }

    private void createListData() {

        //Method - adding data to recyclerview
    }
}