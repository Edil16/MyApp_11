package com.example.myapp_11;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PersonageViewHolder extends RecyclerView.ViewHolder {
    private TextView tvPersonage;
    public PersonageViewHolder(@NonNull View itemView) {
        super(itemView);
        tvPersonage = itemView.findViewById(R.id.personage);
    }
    public void bind(String personage) {
        tvPersonage.setText(personage);
    }
}
