package com.example.e_covid.UI_Layer.View.UserQuarantine.MOH;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.e_covid.R;

public class MOH_Confirmation_UserQ_Record extends AppCompatActivity {

    public ImageView Image5 ;
    public ImageView Image6 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moh_confrmation_user_qrecord);






        Image5 = findViewById (R.id.home3);
        Image5.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MOH_Confirmation_UserQ_Record.this, MOH_DashboardUserQ.class);
                startActivity(intent);
            }
        });
        Image6 = findViewById (R.id.back2);
        Image6.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MOH_Confirmation_UserQ_Record.this, MOH_DashboardUserQ.class);
                startActivity(intent);
            }
        });

    }
}