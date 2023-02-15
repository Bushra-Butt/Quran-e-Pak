package com.example.checking;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ShowAyatAdapter extends RecyclerView.Adapter<ShowAyatAdapter.Ayats> {

    ArrayList<String> DList;
    public ShowAyatAdapter(ArrayList<String> List) {
        this.DList = List;
    }
    @NonNull
    @Override
    public ShowAyatAdapter.Ayats onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.oneayat, parent, false);
        return new ShowAyatAdapter.Ayats(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull Ayats holder, int position) {
        if(!DList.isEmpty()) {
            holder.data = DList.get(position);
            holder.name.setText(holder.data.toString());
        }

    }
    public int getItemCount() {
        return DList.size();
    }
    public class Ayats extends RecyclerView.ViewHolder {
        TextView name;
        String data;
        public Ayats(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.textViewayt);
        }
    }

}
