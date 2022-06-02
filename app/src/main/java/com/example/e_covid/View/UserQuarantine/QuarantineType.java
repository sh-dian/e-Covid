package com.example.e_covid.View.UserQuarantine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.e_covid.R;

//import androidx.appcompat.app.AppCompatActivity;

public class QuarantineType extends AppCompatActivity {

    public Button button1;
    public Button button2;

    public ImageView Image1;
    public ImageView Image2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quarantine_type);

        button1 = (Button) findViewById (R.id.HomeQ);

        button1.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuarantineType.this, HomeQuarantineData.class);
                startActivity(intent);
            }
        });

        button2 = (Button) findViewById (R.id.CenterQ);
        button2.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuarantineType.this, CenterQuarantineData.class);
                startActivity(intent);
            }
        });

        Image1 = findViewById (R.id.Back1);
        Image1.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuarantineType.this, UserRegistration.class);
                startActivity(intent);
            }
        });
        Image2 = findViewById (R.id.Home1);
        Image2.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuarantineType.this, UserRegistration.class);
                startActivity(intent);
            }
        });
    }
}