package com.example.learnrecylcerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import org.json.JSONArray;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    JSONArray jsonArray;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ClassJsonParser.parse(getResources().getString(R.string.JSON_Resp));

        recyclerView = findViewById(R.id.recycleView);

        MainActivityAdapter mainActivityAdapter = new MainActivityAdapter(this, getResources().getString(R.string.JSON_Resp));
        recyclerView.setAdapter(mainActivityAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }


}