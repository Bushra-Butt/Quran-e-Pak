package com.example.quran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class SurahOfSpecificPara extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surah_of_specific_para);
        listView=findViewById(R.id.surah);
        QDH quranSurah = new QDH();
        int number = getIntent().getIntExtra("parah", 0);
        Toast.makeText(this, "Para number is " + number + 1, Toast.LENGTH_SHORT).show();
        ArrayList<String> SurahNames = quranSurah.GetSpecificSurahNames(number+1);
        Integer NextParahStart = quranSurah.getParahStart(number+1);
        ArrayAdapter<String> adaptor = new ArrayAdapter<String>(this, R.layout.itemlist,SurahNames);
        listView.setAdapter(adaptor);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(SurahOfSpecificPara.this, SurahDetails.class);
                String nameofSurah=(String) listView.getItemAtPosition(i);
                intent.putExtra("SurahName", nameofSurah );
                intent.putExtra("GetNextParahStart", NextParahStart);
                intent.putExtra("currentPara", number);
                startActivity(intent);
            }
        });
    }
}