package com.example.e_covid.View.QuarantineCenter;

import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.e_covid.Adapter.QuarantineCenterAdapter;
import com.example.e_covid.Controller.QuarantineCenter.QuarantineCenterController;
import com.example.e_covid.Model.QuarantineCenter.QuarantineCenterModel;
import com.example.e_covid.R;

import java.util.ArrayList;

public class User_SearchQuarantineCenter extends AppCompatActivity {

    //controller object
    QuarantineCenterController adminQuarantineCenterController;

    QuarantineCenterModel quarantineCenterModel;
    ArrayList<String> qcName, qcAddress;
    QuarantineCenterAdapter quarantineCenterAdapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_search_quarantine_center);

        recyclerView = findViewById(R.id.recyclerView);
        quarantineCenterModel = new QuarantineCenterModel(this);
        qcName = new ArrayList<>();
        qcAddress = new ArrayList<>();

        storeDataInArrays();

        quarantineCenterAdapter = new QuarantineCenterAdapter(User_SearchQuarantineCenter.this, qcName, qcAddress);
        recyclerView.setAdapter(quarantineCenterAdapter);
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
            }
        }
    }
}