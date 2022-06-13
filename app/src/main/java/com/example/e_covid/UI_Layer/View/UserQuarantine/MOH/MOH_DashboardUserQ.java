package com.example.e_covid.UI_Layer.View.UserQuarantine.MOH;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.e_covid.R;
import com.example.e_covid.UI_Layer.View.UserQuarantine.Admin.Admin_Manage_UserQ_Status;
import com.example.e_covid.UI_Layer.View.UserQuarantine.Admin.Admin_View_Record_UserQ;

public class MOH_DashboardUserQ extends AppCompatActivity {


    public ImageView Image1;
    public ImageView Image2;
    public ImageView Image3 ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moh_dashboard_user_q);




        Image1 = findViewById (R.id.imageView29);
        Image1.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MOH_DashboardUserQ.this, Admin_View_Record_UserQ.class);
                startActivity(intent);
            }
        });


        Image2 = findViewById (R.id.imageView31);
        Image2.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MOH_DashboardUserQ.this, Admin_Manage_UserQ_Status.class);
                startActivity(intent);
            }
        });


        Image3 = findViewById (R.id.imageView33);
        Image3.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MOH_DashboardUserQ.this, MOH_Confirmation_UserQ_Record.class);
                startActivity(intent);
            }
        });



    }
}