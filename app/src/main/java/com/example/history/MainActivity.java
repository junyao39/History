package com.example.history;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{

    Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<String>titleArray=new ArrayList<>();
        titleArray.add("Note to Self");
        titleArray.add("Disney Beauty and the Beast");
        titleArray.add("The Animal Book");

        ArrayList<String>authorArray=new ArrayList<>();
        authorArray.add("Connor Franta");
        authorArray.add("Elizabeth Rudnick");
        authorArray.add("Camilla de la Bedoyere");

        ArrayList<Integer>imageArray=new ArrayList<>();
        imageArray.add(R.drawable.note_to_self);
        imageArray.add(R.drawable.disney_beauty_and_the_beast);
        imageArray.add(R.drawable.the_animal_book);


        RecyclerView recyclerView = findViewById(R.id.dataList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter=new Adapter(this,titleArray,authorArray,imageArray);
        recyclerView.setAdapter(adapter);
    }

}