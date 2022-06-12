package com.example.e_covid.DataLayer;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MainDB extends SQLiteOpenHelper {

    private static final String DB_Name = "eCovid.db";
    private static final int version = 1;

    public MainDB(Context context) {
        super(context, DB_Name, null,version);
    }

    @Override
    public void onCreate(SQLiteDatabase DB) {
        DB.execSQL("CREATE Table Registration(reID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, RE_Name TEXT, RE_Icpassport TEXT, RE_StateCountry TEXT, RE_PhoneNumEmail TEXT," +
                "RE_Password INTEGER, RE_Passwordre INTEGER)");

        DB.execSQL("CREATE Table QuarantineCenter(QC_ID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, QC_Name TEXT, QC_Address TEXT, QC_Funding TEXT, QC_PhoneNum TEXT," +
                "QC_NumOfBeds INTEGER, QC_Capacity INTEGER, QC_VentilationCapacity INTEGER)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase DB, int oldVerse, int newVerse) {
        DB.execSQL("DROP Table if exists Registration");
        DB.execSQL("DROP Table if exists QuarantineCenter");
    }
}
