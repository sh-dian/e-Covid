package com.example.e_covid.DataLayer.Model.Movement;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class CheckIn_CheckOutModel extends SQLiteOpenHelper {

    public CheckIn_CheckOutModel(Context context) {super(context, "e-Covid.db", null, 1);}

    @Override
    public void onCreate(SQLiteDatabase DB) {
        DB.execSQL("CREATE Table CheckIn_CheckOut(cioID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, cioName TEXT, cioLocation TEXT, cioPhoneNum TEXT, cioTime TEXT, cioRiskStatus TEXT, cioVaccineStatus TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase DB, int i, int i1) {
        DB.execSQL("DROP Table if exists CheckIn_CheckOut");
    }

    //insert function
    public Boolean insertCIO_data(String cioName, String cioLocation, String cioPhoneNum, String cioTime, String cioRiskStatus, String cioVaccineStatus){

        SQLiteDatabase DB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("cioName", cioName);
        contentValues.put("cioLocation", cioLocation);
        contentValues.put("cioPhoneNum", cioPhoneNum);
        contentValues.put("cioTime", cioTime);
        contentValues.put("cioRiskStatus", cioRiskStatus);
        contentValues.put("cioVaccineStatus", cioVaccineStatus);


        long result = DB.insert("CheckIn_CheckOut", null, contentValues);

        return result != 1;
    }

    public Cursor readAllData(){
        String query = "SELECT * FROM CheckIn_CheckOut";
        SQLiteDatabase DB = this.getReadableDatabase();

        Cursor cursor = null;
        if(DB != null){
            cursor = DB.rawQuery(query, null);
        }
        return cursor;
    }
}