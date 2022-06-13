package com.example.e_covid.UI_Layer.View.UserQuarantine.MOH;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.e_covid.R;
import com.example.e_covid.UI_Layer.View.UserQuarantine.Admin.Admin_DashboardUserQ;
import com.example.e_covid.UI_Layer.View.UserQuarantine.Admin.Admin_Edit_UserQ;

public class MOH_View_Record_UserQ extends AppCompatActivity {

    public ImageView BackArrow;
    public ImageView MeanPage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moh_view_record_user_q);


        BackArrow = findViewById (R.id.Back21);
        BackArrow.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MOH_View_Record_UserQ.this, Admin_DashboardUserQ.class);
                startActivity(intent);}});
        MeanPage = findViewById (R.id.Home22);
        MeanPage.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MOH_View_Record_UserQ.this, Admin_DashboardUserQ.class);
                startActivity(intent);}});
    }
}