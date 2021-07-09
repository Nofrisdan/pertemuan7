package com.example.nofrisdan_pertemuan7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> dataSet; @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dataSet = new ArrayList<>();
        initDataSet();
        recyclerView = (RecyclerView) findViewById(R.id.rv_main);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new RecyclerViewAdapter(dataSet);
        recyclerView.setAdapter(adapter);
    }
    
    //set data init
    
    private void initDataSet() {
        dataSet.add("A");
        dataSet.add("B");
        dataSet.add("C");
        dataSet.add("D");
        dataSet.add("E");
        dataSet.add("F");
        dataSet.add("G");
        dataSet.add("H");
        dataSet.add("I");
        dataSet.add("J");
    }
}
