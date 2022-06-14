package com.example.e_covid.UI_Layer.View.UserQuarantine.MOH;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.e_covid.R;
import com.example.e_covid.UI_Layer.View.UserQuarantine.Admin.Admin_DashboardUserQ;

public class MOH_Manage_UserQ_Status extends AppCompatActivity {

    public ImageView BackArrow;
    public ImageView MeanPage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moh_manage_user_qstatus);



        BackArrow = findViewById (R.id.Back22);
        BackArrow.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MOH_Manage_UserQ_Status.this, Admin_DashboardUserQ.class);
                startActivity(intent);}});
        MeanPage = findViewById (R.id.Home22);
        MeanPage.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MOH_Manage_UserQ_Status.this, Admin_DashboardUserQ.class);
                startActivity(intent);}});


    }
}