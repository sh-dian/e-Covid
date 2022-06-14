package com.example.e_covid.UI_Layer.View.UserQuarantine.Admin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.e_covid.R;
import com.example.e_covid.UI_Layer.View.UserQuarantine.User.QuarantineDetails;
import com.example.e_covid.UI_Layer.View.UserQuarantine.User.UserRegistration;

public class Admin_Edit_UserQ extends AppCompatActivity {

    public ImageView BackArrow;
    public ImageView MeanPage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_admin_edit_user_q);





        BackArrow = findViewById (R.id.Back14);
        BackArrow.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Admin_Edit_UserQ.this, Admin_DashboardUserQ.class);
                startActivity(intent);}});
        MeanPage = findViewById (R.id.Home11);
        MeanPage.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Admin_Edit_UserQ.this, Admin_DashboardUserQ.class);
                startActivity(intent);}});
    }
}