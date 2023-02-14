package com.example.quran;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    ListView myListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myListView = findViewById(R.id.listView);
        QDH quranInfo = new QDH();
        int number = getIntent().getIntExtra("number", 0);
        int temp=number+1;
        Toast.makeText(this, "Para number is " +temp, Toast.LENGTH_SHORT).show();
        QuranText list = new QuranText();
        ArrayList<String> surahNames = quranInfo.GetSurahNames();
        ArrayAdapter<String> adaptor = new ArrayAdapter<String>(this,R.layout.itemlist, surahNames);
        myListView.setAdapter(adaptor);
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, SurahDetails.class);
                intent.putExtra("number", i );
                startActivity(intent);
            }
        });
    }
}