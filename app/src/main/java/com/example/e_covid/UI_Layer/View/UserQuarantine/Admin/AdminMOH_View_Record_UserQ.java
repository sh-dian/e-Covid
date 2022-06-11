package com.example.e_covid.UI_Layer.View.UserQuarantine.Admin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.e_covid.R;

public class AdminMOH_View_Record_UserQ extends AppCompatActivity {

    public ImageView Image1;
    public ImageView Image2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_view_record_user_q);






        Image1 = findViewById (R.id.home2);
        Image1.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminMOH_View_Record_UserQ.this, Admin_DashboardUserQ.class);
                startActivity(intent);
            }
        });
        Image2 = findViewById (R.id.back);
        Image2.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminMOH_View_Record_UserQ.this, Admin_DashboardUserQ.class);
                startActivity(intent);
            }
        });





    }
}