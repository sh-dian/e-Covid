package com.example.e_covid.Model.CheckIn_CheckOut;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class CheckIn_CheckOutModel extends SQLiteOpenHelper {

    public CheckIn_CheckOutModel(Context context) {super(context, "e-Covid.db", null, 1);}

    @Override
    public void onCreate(SQLiteDatabase DB) {
        DB.execSQL("CREATE Table VisitorForm(cioID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, visfName TEXT, visfPassportNum TEXT, visfOriginCountry TEXT, visfReason TEXT, visfDuration TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase DB, int i, int i1) {
        DB.execSQL("DROP Table if exists CheckIn_CheckOut");
    }

    //insert function
    public Boolean insertVisf_data(String visfName, String visfPassportNum, String visfOriginCountry, String visfReason, String visfDuration){

        SQLiteDatabase DB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("visfName", visfName);
        contentValues.put("visfPassportNum", visfPassportNum);
        contentValues.put("visfOriginCountry", visfOriginCountry);
        contentValues.put("visfReason", visfReason);
        contentValues.put("visfDuration", visfDuration);

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