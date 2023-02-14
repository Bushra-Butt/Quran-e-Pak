package com.example.quran;

import android.app.Dialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class AdapterAyat extends RecyclerView.Adapter<AdapterAyat.AyatVH> {

    ArrayList<String> DList;
    public AdapterAyat(ArrayList<String> List) {
        this.DList = List;
    }
    @NonNull
    @Override
    public AdapterAyat.AyatVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.oneayat, parent, false);
        return new AdapterAyat.AyatVH(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull AyatVH holder, int position) {
        if(!DList.isEmpty()) {
            holder.data = DList.get(position);
            holder.name.setText(holder.data.toString());
        }
    }
    @Override
    public int getItemCount() {
        return DList.size();
    }
    public class AyatVH extends RecyclerView.ViewHolder {
        TextView name;
        String data;
        public AyatVH(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.textViewayt);
        }
    }

}
