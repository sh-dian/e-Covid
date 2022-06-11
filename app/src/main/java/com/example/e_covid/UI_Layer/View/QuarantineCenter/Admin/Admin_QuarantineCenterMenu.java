package com.example.e_covid.UI_Layer.View.QuarantineCenter.Admin;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.Toast;

import com.example.e_covid.DomainLayer.Adapter.Admin_QuarantineCenterAdapter;
import com.example.e_covid.DomainLayer.Controller.QuarantineCenter.QuarantineCenterController;
import com.example.e_covid.DataLayer.Model.QuarantineCenter.QuarantineCenterModel;
import com.example.e_covid.R;

import java.util.ArrayList;

public class Admin_QuarantineCenterMenu extends AppCompatActivity {

    //controller object
    QuarantineCenterController adminQuarantineCenterController;

    //Button object
    Button a_Add;

    QuarantineCenterModel quarantineCenterModel;
    ArrayList<String> qcName, qcAddress, qcPhoneNum, qcFunding, qcNumOfBeds, qcCapacity, qcVentilationCapacity;
    Admin_QuarantineCenterAdapter adminQuarantineCenterAdapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_quarantine_center_menu);

        a_Add = findViewById(R.id.a_buttonAdd);

        a_Add.setOnClickListener(view -> {
            addPage();
        });

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

        adminQuarantineCenterAdapter = new Admin_QuarantineCenterAdapter(Admin_QuarantineCenterMenu.this, qcName, qcAddress, qcPhoneNum, qcFunding, qcNumOfBeds, qcCapacity, qcVentilationCapacity);
        recyclerView.setAdapter(adminQuarantineCenterAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(Admin_QuarantineCenterMenu.this));

    }

    private void addPage() {
        Intent intent = new Intent(Admin_QuarantineCenterMenu.this, Admin_AddQuarantineCenter.class);
        startActivity(intent);
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