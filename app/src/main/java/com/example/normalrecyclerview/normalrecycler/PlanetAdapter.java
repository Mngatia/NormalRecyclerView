package com.example.normalrecyclerview.normalrecycler;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PlanetAdapter extends RecyclerView.Adapter<PlanetAdapter.PlanetHolder> {

    //Adapter class has 2 classes - Planet Adapter, Planet Holder

    private Context context;
    private ArrayList<Planet> planets;

    //constructor
    public PlanetAdapter(Context context, ArrayList<Planet> planets) {
        this.context = context;
        this.planets = planets;
    }

    @NonNull
    @Override
    public PlanetAdapter.PlanetHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull PlanetAdapter.PlanetHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
//. Planet Holder
    public class PlanetHolder extends RecyclerView.ViewHolder {

        private TextView txtName, txtDistance, txtGravity, txtDiameter;
        
        public PlanetHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
