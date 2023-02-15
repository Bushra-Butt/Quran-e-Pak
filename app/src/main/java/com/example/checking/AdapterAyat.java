package com.example.checking;


import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.AdapterView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class AdapterAyat extends RecyclerView.Adapter<AdapterAyat.AyatVH> {

    ArrayList<String> DList;
    public AdapterAyat(ArrayList<String> List) {
        this.DList = List;
    }
    @NonNull
    @Override
    public AdapterAyat.AyatVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.onesurahname, parent, false);
        return new AdapterAyat.AyatVH(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull AyatVH holder, int position) {
        if(!DList.isEmpty()) {
            holder.data = DList.get(position);
            holder.name.setText(holder.data.toString());

        }
    }
//    public void setAyats(List<> list) {
//        this.ayats = list;
//        notifyDataSetChanged();
//    }
    @Override
    public int getItemCount() {
        return DList.size();
    }
    public class AyatVH extends RecyclerView.ViewHolder {
        TextView name;
        String data;
        public AyatVH(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.nameOfSurah);
            name.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(v.getContext(), ayat.class);
                    intent.putExtra("SurahName",name.getText().toString());
                    v.getContext().startActivity(intent);
                }
            });
        }
    }

}
