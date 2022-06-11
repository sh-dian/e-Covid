package com.example.e_covid.UI_Layer.View.QuarantineCenter.User;

import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.e_covid.DomainLayer.Adapter.QuarantineCenter.User_QuarantineCenterAdapter;
import com.example.e_covid.DomainLayer.Controller.QuarantineCenter.QuarantineCenterController;
import com.example.e_covid.DataLayer.Model.QuarantineCenter.QuarantineCenterModel;
import com.example.e_covid.R;

import java.util.ArrayList;

public class User_SearchQuarantineCenter extends AppCompatActivity {

    //controller object
    QuarantineCenterController adminQuarantineCenterController;

    QuarantineCenterModel quarantineCenterModel;
    ArrayList<String> qcName, qcAddress, qcPhoneNum, qcFunding, qcNumOfBeds, qcCapacity, qcVentilationCapacity;
    User_QuarantineCenterAdapter user_quarantineCenterAdapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_search_quarantine_center);

        recyclerView = findViewById(R.id.recyclerView);
        quarantineCenterModel = new QuarantineCenterModel(this);
        qcName = new ArrayList<>();
        qcAddress = new ArrayList<>();
        qcPhoneNum = new ArrayList<>();
        qcFunding = new ArrayList<>();
        qcNumOfBeds = new ArrayList<>();
        qcCapacity = new ArrayList<>();
        qcVentilationCapacity = new ArrayList<>();

        storeDataInArrays();

        user_quarantineCenterAdapter = new User_QuarantineCenterAdapter(User_SearchQuarantineCenter.this, qcName, qcAddress, qcPhoneNum, qcFunding, qcNumOfBeds, qcCapacity, qcVentilationCapacity);
        recyclerView.setAdapter(user_quarantineCenterAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(User_SearchQuarantineCenter.this));
    }

    void storeDataInArrays(){
        Cursor cursor = quarantineCenterModel.readAllData();
        if(cursor.getCount() == 0){
            Toast.makeText(this,"No data", Toast.LENGTH_SHORT).show();
        }else{
            while(cursor.moveToNext()){
                qcName.add(cursor.getString(1));
                qcAddress.add(cursor.getString(2));
                qcPhoneNum.add(cursor.getString(3));
                qcFunding.add(cursor.getString(4));
                qcNumOfBeds.add(cursor.getString(5));
                qcCapacity.add(cursor.getString(6));
                qcVentilationCapacity.add(cursor.getString(7));
            }
        }
    }
}