package com.example.checking;

import android.content.Context;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class JsonHelper {
    String MetaFileName;
    JSONArray arrayOfData;
    Context con;
    public JsonHelper(String fileName, Context context) {
        MetaFileName = fileName;
        this.con= context;
        try {
            arrayOfData = new JSONArray(getAssets());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private String getAssets() {
        String jsonString;
        try {
            InputStream inputStream = con.getAssets().open(MetaFileName);
            int size = inputStream.available();
            byte[] buffer = new byte[size];
            inputStream.read(buffer);
            inputStream.close();
            jsonString = new String(buffer, "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
          return null;
        }
        System.out.println(jsonString);
        return jsonString;
    }

    public List<String> getAyats(int start, int end) {
        List<String> a = new ArrayList<>();
        for (int i = start; i <= end; i++)
        {
            try {
//                String s = arrayOfData.getJSONObject(i).getString("UrduTranslation");
                a.add(arrayOfData.getJSONObject(i).getString("text"));
            } catch (JSONException e) {
                e.printStackTrace();

            }
        }
        return a;
    }
    public List<String> getSurahName() {
        List<String> a = new ArrayList<>();
        for (int i = 0; i < arrayOfData.length(); i++)
        {
            try {
//                String s = arrayOfData.getJSONObject(i).getString("UrduTranslation");
                a.add(arrayOfData.getJSONObject(i).getString("englishName"));
            } catch (JSONException e) {
                e.printStackTrace();

            }
        }
        return a;
    }
    public int getSurahNumber(String surahName)
    {
        System.out.println(surahName);
        for (int i = 0; i < arrayOfData.length(); i++)
        {
            System.out.println(i);
            try {
                String temp=arrayOfData.getJSONObject(i).getString("englishName");
                System.out.println("temp"+temp);

                if (temp.equals(surahName))
                {
                    System.out.println(i);
                    return i;
                }
            } catch (JSONException e) {
                e.printStackTrace();

            }
        }
        return -1;
    }
    public int getSurahStart(int surahNumber)
    {
        for (int i = 0; i < arrayOfData.length(); i++)
        {
            try {
                if (arrayOfData.getJSONObject(i).getInt("surah_number") == surahNumber)
                {
                    System.out.println(i);
                    return i;

                }
            } catch (JSONException e) {
                e.printStackTrace();

            }
        }
        return -1;
    }
    public int getSurahEnd(int surahNumber)
    {
        for (int i = arrayOfData.length() - 1; i >= 0; i--)
        {
            try {
                if (arrayOfData.getJSONObject(i).getInt("surah_number") == surahNumber)
                {
                    return i;
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return -1;
    }
}
