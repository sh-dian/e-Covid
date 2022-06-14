package com.example.e_covid.UI_Layer.View.UserQuarantine.Admin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.e_covid.R;
import com.example.e_covid.UI_Layer.View.Login.Admin.Admin_Menu_Page;
import com.example.e_covid.UI_Layer.View.UserQuarantine.MOH.MOH_Manage_UserQ_Status;

public class Admin_DashboardUserQ extends AppCompatActivity {

    public ImageView BackArrow;
    public ImageView MeanPage;

    public ImageView Image1;
    public ImageView Image2;
    public ImageView Image3;
    public ImageView Image4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_admin_dashboard_user_q);

        Image1 = findViewById (R.id.imageView24);
        Image1.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Admin_DashboardUserQ.this, Admin_View_Record_UserQ.class);
                startActivity(intent);
            }
        });

        Image2 = findViewById (R.id.imageView26);
        Image2.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Admin_DashboardUserQ.this, Admin_Manage_UserQ_Status.class);
                startActivity(intent);
            }
        });

        Image3 = findViewById (R.id.imageView27);
        Image3.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Admin_DashboardUserQ.this, Admin_Manage_Records.class);
                startActivity(intent);
            }
        });


        Image4 = findViewById (R.id.imageView25);
        Image4.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Admin_DashboardUserQ.this, Admin_Edit_UserQ.class);
                startActivity(intent);
            }
        });


        BackArrow = findViewById (R.id.Back10);
        BackArrow.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Admin_DashboardUserQ.this, Admin_Menu_Page.class);
                startActivity(intent);}});
        MeanPage = findViewById (R.id.Home10);
        MeanPage.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Admin_DashboardUserQ.this, Admin_DashboardUserQ.class);
                startActivity(intent);}});



    }
}