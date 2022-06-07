package com.example.e_covid.View.QuarantineCenter;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.e_covid.Controller.QuarantineCenter.QuarantineCenterController;
import com.example.e_covid.R;

public class Admin_QuarantineCenterMenu extends AppCompatActivity {

    //controller object
    QuarantineCenterController adminQuarantineCenterController;

    //Button object
    Button a_Add;
    Button a_View;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_quarantine_center_menu);

        a_Add = findViewById(R.id.a_buttonAdd);
        a_View = findViewById(R.id.a_buttonView);
        adminQuarantineCenterController = new QuarantineCenterController(this);

        a_Add.setOnClickListener(view -> {
            addPage();
        });

        a_View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor res = adminQuarantineCenterController.getData();

                if(res.getCount() == 0){
                    Toast.makeText(Admin_QuarantineCenterMenu.this,"No Entry Exists", Toast.LENGTH_SHORT).show();
                    return;
                }

                StringBuffer buffer = new StringBuffer();

                while(res.moveToNext()){
                    buffer.append("Quarantine Center Name: "+res.getString(1)+"\n");
                }

                AlertDialog.Builder builder = new AlertDialog.Builder(Admin_QuarantineCenterMenu.this);
                builder.setCancelable(true);
                builder.setTitle("Quarantine Center Entries");
                builder.setMessage(buffer.toString());
                builder.show();

            }
        });
    }

    private void addPage() {
        Intent intent = new Intent(Admin_QuarantineCenterMenu.this, Admin_AddQuarantineCenter.class);
        startActivity(intent);
    }
}