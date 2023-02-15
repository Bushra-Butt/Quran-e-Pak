package com.example.checking;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class surahrecylerview extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    JsonHelper jsonHelper;
    ArrayList<String> List = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surahrecylerview);
        QDH quranInfo = new QDH();
        jsonHelper = new JsonHelper("QuranMetaData.json", this);
        recyclerView= findViewById(R.id.ayat);
        List.addAll(quranInfo.GetSurahEngNames());
        recyclerView.setLayoutManager(new GridLayoutManager(surahrecylerview.this,3));
        adapter=new AdapterAyat(List);
        recyclerView.setAdapter(adapter);

    }
}