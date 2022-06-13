package com.example.myapp_11;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<String> personage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadData();
        recyclerView = findViewById(R.id.recycler_view);
        PersonageAdapter adapter = new PersonageAdapter(personage);
        recyclerView.setAdapter(adapter);
    }

    private void loadData(){
        personage = new ArrayList<>();
        personage.add("Scorpion");
        personage.add("Sab Ziro");
        personage.add("Milina");
        personage.add("Nub Saibot");
        personage.add("Kitana");
        personage.add("Kun Lao");
        personage.add("Kenshi");
        personage.add("Sector");
        personage.add("Ermak");
        personage.add("Striker");
        personage.add("Skarlet");
        personage.add("Reptiliya");
        personage.add("Sindel");
        personage.add("Kano");
        personage.add("Goro");
        personage.add("Baraka");
    }
}