package com.example.e_covid.Model.Vaccination;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.e_covid.R;

public class VaccinationModel extends SQLiteOpenHelper{
    public VaccinationModel(Context context) {super(context, "e-Covid.db", null, 1);}

    @Override
    public void onCreate(SQLiteDatabase DB) {
        DB.execSQL("CREATE Table VaccinationAppointment(vcID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, vcName TEXT, vcIC TEXT, vcPhoneNum TEXT, vcLocation TeXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public Boolean insertVC_data(String vcName, String vcID, String vcPhoneNum, String vcLocation){

        SQLiteDatabase DB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("vcName", vcName);
        contentValues.put("vcID", vcID);
        contentValues.put("vcPhoneNum", vcPhoneNum);
        contentValues.put("vcLocation", vcLocation);

        long result = DB.insert("VaccinationAppointment", null, contentValues);

        return result != 1;
    }
}
