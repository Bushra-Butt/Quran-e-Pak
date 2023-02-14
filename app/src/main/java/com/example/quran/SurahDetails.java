package com.example.quran;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SurahDetails extends AppCompatActivity {
    TextView surahText;
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    ArrayList<String> ayat= new ArrayList<>();
    ArrayList<String> List = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.surah_details);
        recyclerView= findViewById(R.id.ayat);
        QDH quranInfo = new QDH();
        String nameSurah = getIntent().getStringExtra("SurahName");
        Integer NextParahStart = getIntent().getIntExtra("GetNextParahStart",0);
        Integer currentP = getIntent().getIntExtra("currentPara",0);
        Integer CurrentParahStart=quranInfo.getParahStart(currentP)-1;
//        Integer PreviousParaStart=quranInfo.getParahStart(currentP-1);
//        Integer CurrentParaEnd=NextParahStart-1;
//        Integer PreviousParaEnd=CurrentParahStart-1;
        Toast.makeText(this, "Surah name" + nameSurah, Toast.LENGTH_SHORT).show();
        QuranText arabic = new QuranText();
        String[] Quran = arabic.QuranText;
        int SurahIndex = quranInfo.getSurahNumber(nameSurah);
        int startIndex= quranInfo.getSurahStart(SurahIndex);
//        int SurahVerses=quranInfo.getSurahVerses(SurahIndex);
        int NextSurahIndex=quranInfo.getSurahStart(SurahIndex);
        if(nameSurah.equals("") || nameSurah.equals("") || nameSurah.equals("")) {
            if (startIndex < CurrentParahStart) {
                startIndex = CurrentParahStart - startIndex;
            }
        }
        for (int i = startIndex-1; i < NextSurahIndex-1; i++)
        {

            if(i==NextParahStart- 1)
            {
                break;
            }
            ayat.add(Quran[i]);
        }
        List.addAll(ayat);
        //        if(SurahIndex != 113) {
//            int nextSurahStartIndex = quranInfo.getSurahStart(number + 1);
//            nextSurahStartIndex--;
//            String str1 = "";
//            for (int i = startIndex - 1; i < nextSurahStartIndex; i++) {
//                str1 += Quran[i];
//                str1 += "\n";
//            }
//            surahText.setText(str1);
//        }
//        else if(number == 113)
//        {
//            int length = Quran.length;
//            int lastIndex = length - 1;
//            String str2 = "";
//            for (int i = startIndex - 1; i <= lastIndex; i++) {
//                str2 += Quran[i];
//                str2 += "\n";
//            }
//            surahText.setText(str2);
//        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter=new AdapterAyat(List);
        recyclerView.setAdapter(adapter);
    }
}