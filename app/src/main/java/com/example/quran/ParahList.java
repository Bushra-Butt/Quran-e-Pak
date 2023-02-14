package com.example.quran;

import androidx.appcompat.app.AppCompatActivity;


import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.widget.SearchView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ParahList extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parah_list);
        listView=findViewById(R.id._dynamic);
        QDH quranSurah = new QDH();
        ArrayList<String> ParaNames = quranSurah.GetParaNames();
        ArrayAdapter<String> adaptor = new ArrayAdapter<String>(this, R.layout.itemlist, ParaNames);
        listView.setAdapter(adaptor);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(ParahList.this, SurahOfSpecificPara.class);
                intent.putExtra("parah", i);
                startActivity(intent);
            }
        });
    }
}