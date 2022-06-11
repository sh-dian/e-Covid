package com.example.e_covid.DataLayer.Model.Movement;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MovementModel extends SQLiteOpenHelper {

    public MovementModel(Context context) {super(context, "e-Covid.db", null, 1);}

    @Override
    public void onCreate(SQLiteDatabase DB) {
        DB.execSQL("CREATE Table VisitorForm(cioID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, cioName TEXT, cioLocation TEXT, cioPhoneNumber TEXT, cioDate TEXT, cioRiskStatus TEXT, cioVaccineStatus TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase DB, int i, int i1) {
        DB.execSQL("DROP Table if exists CheckIn_CheckOut");
    }

    //insert function
    public Boolean insertCIO_data(String cioLocation, String cioDate, String cioTime){

        SQLiteDatabase DB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("cioLocation", cioLocation);
        contentValues.put("cioDate", cioDate);
        contentValues.put("cioTime", cioTime);

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