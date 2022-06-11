package com.example.e_covid.DataLayer.Model.Vaccination;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class VaccinationModel extends SQLiteOpenHelper{
    public VaccinationModel(Context context) {super(context, "e-Covid.db", null, 1);}

    //create table name VaccinationAppointment in e-Covid(database)
    @Override
    public void onCreate(SQLiteDatabase DB) {
        DB.execSQL("CREATE Table VaccinationAppointment(vcID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, vcName TEXT, vcIC TEXT, vcPhoneNum TEXT, vcLocation TeXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    //add function (to table VaccinationAppointment)
    public Boolean insertVC_data(String vcName, String vcIC, String vcPhoneNum, String vcLocation){

        SQLiteDatabase DB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("vcName", vcName);
        contentValues.put("vcIC", vcIC);
        contentValues.put("vcPhoneNum", vcPhoneNum);
        contentValues.put("vcLocation", vcLocation);

        long result = DB.insert("VaccinationAppointment", null, contentValues);

        return result != 1;
    }
}
