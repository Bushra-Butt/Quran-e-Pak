package com.example.checking;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ayat extends AppCompatActivity {

    JsonHelper jsonHelper;
    ArrayList<String> list = new ArrayList<>();
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayat);
        QDH quranInfo = new QDH();
        recyclerView= findViewById(R.id.onesurahayat);
        jsonHelper = new JsonHelper("QuranMetaData.json", this);
        String nameSurah = getIntent().getStringExtra("SurahName");
        int SuranNumber= quranInfo.getESurahNumber(nameSurah);
//        int getSurahVerses=quranInfo.getSurahVerses(SuranNumber);
//        int NextSurahNumber
        list.addAll(jsonHelper.getAyats(jsonHelper.getSurahStart( SuranNumber+1),jsonHelper.getSurahEnd(SuranNumber+1)));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter=new ShowAyatAdapter(list);
        recyclerView.setAdapter(adapter);

    }
}