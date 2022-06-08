package com.example.e_covid.Adapter;

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
import com.example.e_covid.View.QuarantineCenter.Admin_ViewQuarantineCenter;

import java.util.ArrayList;

public class QuarantineCenterAdapter extends RecyclerView.Adapter<QuarantineCenterAdapter.MyViewHolder> {

    private final Context context;
    private Activity activity;
    private final ArrayList qcName;
    private final ArrayList qcAddress;
    private int position;

    public QuarantineCenterAdapter(Context context, ArrayList qcName , ArrayList qcAddress){
        this.context = context;
        this.qcName = qcName;
        this.qcAddress = qcAddress;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, int position ) {
        holder.qcName_txt.setText(String.valueOf(qcName.get(position)));
        holder.qcAddress_txt.setText(String.valueOf(qcAddress.get(position)));

        //Recyclerview onClickListener
        holder.mainLayout.setOnClickListener(view -> {
            Intent intent = new Intent(context, Admin_ViewQuarantineCenter.class);
            intent.putExtra("name", String.valueOf(qcName.get(position)));
            intent.putExtra("address", String.valueOf(qcAddress.get(position)));
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return qcName.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView qcName_txt;
        TextView qcAddress_txt;

        LinearLayout mainLayout;

        MyViewHolder(@NonNull View itemView) {
            super(itemView);
            qcName_txt = itemView.findViewById(R.id.qcName_txt);
            qcAddress_txt = itemView.findViewById(R.id.qcAddress_txt);
            mainLayout = itemView.findViewById(R.id.mainLayout);
        }

    }
}
