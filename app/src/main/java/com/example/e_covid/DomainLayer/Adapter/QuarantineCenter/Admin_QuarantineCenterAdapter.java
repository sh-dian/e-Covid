package com.example.e_covid.DomainLayer.Adapter.QuarantineCenter;

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
import com.example.e_covid.UI_Layer.View.QuarantineCenter.Admin.Admin_ViewQuarantineCenter;

import java.util.ArrayList;

public class Admin_QuarantineCenterAdapter extends RecyclerView.Adapter<Admin_QuarantineCenterAdapter.MyViewHolder> {

    private final Context context;
    private Activity activity;
    private final ArrayList qcName;
    private final ArrayList qcAddress;
    private final ArrayList qcPhoneNum;
    private final ArrayList qcFunding;
    private final ArrayList qcNumOfBeds;
    private final ArrayList qcCapacity;
    private final ArrayList qcVentilationCapacity;
    private int position;

    public Admin_QuarantineCenterAdapter(Context context, ArrayList qcName, ArrayList qcAddress, ArrayList qcPhoneNum, ArrayList qcFunding, ArrayList qcNumOfBeds, ArrayList qcCapacity, ArrayList qcVentilationCapacity){
        this.context = context;
        this.qcName = qcName;
        this.qcAddress = qcAddress;
        this.qcPhoneNum = qcPhoneNum;
        this.qcFunding = qcFunding;
        this.qcNumOfBeds = qcNumOfBeds;
        this.qcCapacity = qcCapacity;
        this.qcVentilationCapacity = qcVentilationCapacity;
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
        holder.qcPhoneNum_txt.setText(String.valueOf(qcPhoneNum.get(position)));

        /*holder.qcFunding_txt.setText(String.valueOf(qcFunding.get(position)));
        holder.qcNumOfBeds_txt.setText(String.valueOf(qcNumOfBeds.get(position)));
        holder.qcCapacity_txt.setText(String.valueOf(qcCapacity.get(position)));
        holder.qcVentilationCapacity_txt.setText(String.valueOf(qcVentilationCapacity.get(position)));*/

        //Recyclerview onClickListener
        holder.mainLayout.setOnClickListener(view -> {
            Intent intent = new Intent(context, Admin_ViewQuarantineCenter.class);
            intent.putExtra("name", String.valueOf(qcName.get(position)));
            intent.putExtra("address", String.valueOf(qcAddress.get(position)));
            intent.putExtra("phoneNum", String.valueOf(qcPhoneNum.get(position)));
            intent.putExtra("funding", String.valueOf(qcFunding.get(position)));
            intent.putExtra("numOfBeds", String.valueOf(qcNumOfBeds.get(position)));
            intent.putExtra("capacity", String.valueOf(qcCapacity.get(position)));
            intent.putExtra("ventilationCapacity", String.valueOf(qcVentilationCapacity.get(position)));
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
        TextView qcPhoneNum_txt;
        TextView qcFunding_txt;
        TextView qcNumOfBeds_txt;
        TextView qcCapacity_txt;
        TextView qcVentilationCapacity_txt;

        LinearLayout mainLayout;

        MyViewHolder(@NonNull View itemView) {
            super(itemView);
            qcName_txt = itemView.findViewById(R.id.qcName_txt);
            qcAddress_txt = itemView.findViewById(R.id.qcAddress_txt);
            qcPhoneNum_txt = itemView.findViewById(R.id.qcPhoneNum_txt);

            mainLayout = itemView.findViewById(R.id.mainLayout);
        }

    }
}
