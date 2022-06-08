package com.example.e_covid.Adapter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.e_covid.R;
import com.example.e_covid.View.QuarantineCenter.Admin_QuarantineCenterMenu;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    private final Context context;
    private Activity activity;
    private final ArrayList qcName;

    public CustomAdapter(Context context, ArrayList qcName){
        this.context = context;
        this.qcName = qcName;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, @SuppressLint("RecyclerView") int position ) {

        holder.qcName_txt.setText(String.valueOf(qcName.get(position)));

        //Recyclerview onClickListener
        holder.mainLayout.setOnClickListener(view -> {
            Intent intent = new Intent(context, Admin_QuarantineCenterMenu.class);
            intent.putExtra("id", String.valueOf(qcName.get(position)));
            activity.startActivityForResult(intent, 1);
        });
    }

    @Override
    public int getItemCount() {
        return qcName.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView qcName_txt;
        LinearLayout mainLayout;

        MyViewHolder(@NonNull View itemView) {
            super(itemView);
            qcName_txt = itemView.findViewById(R.id.qcName_txt);
            mainLayout = itemView.findViewById(R.id.mainLayout);
        }

    }
}
