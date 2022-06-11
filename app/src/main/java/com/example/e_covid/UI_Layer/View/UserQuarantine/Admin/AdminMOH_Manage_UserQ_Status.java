package com.example.e_covid.UI_Layer.View.UserQuarantine.Admin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.e_covid.R;

public class AdminMOH_Manage_UserQ_Status extends AppCompatActivity {

    public ImageView Image1;
    public ImageView Image2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_moh_manage_user_qstatus);





        Image1 = findViewById (R.id.home4);
        Image1.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminMOH_Manage_UserQ_Status.this, Admin_DashboardUserQ.class);
                startActivity(intent);
            }
        });
        Image2 = findViewById (R.id.back3);
        Image2.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminMOH_Manage_UserQ_Status.this, Admin_DashboardUserQ.class);
                startActivity(intent);
            }
        });
    }
}