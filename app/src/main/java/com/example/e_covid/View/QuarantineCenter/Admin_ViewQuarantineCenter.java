package com.example.e_covid.View.QuarantineCenter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import com.example.e_covid.R;

public class Admin_ViewQuarantineCenter extends AppCompatActivity {

    EditText qcName, qcAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_view_quarantine_center);
    }


}