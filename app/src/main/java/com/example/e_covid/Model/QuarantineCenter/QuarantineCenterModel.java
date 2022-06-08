package com.example.e_covid.Model.QuarantineCenter;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class QuarantineCenterModel extends SQLiteOpenHelper {
    public QuarantineCenterModel(Context context) {
        super(context, "Database/e-Covid.db", null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase DB) {
        DB.execSQL("CREATE Table QuarantineCenter(qcID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, qcName TEXT, qcAddress TEXT, qcFunding TEXT, qcPhoneNum TEXT," +
                "qcNumOfBeds INTEGER, qcCapacity INTEGER, qcVentilationCapacity INTEGER)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase DB, int i, int i1) {
        DB.execSQL("DROP Table if exists QuarantineCenter");
    }

    //insert function
    public Boolean insertQC_data(String qcName, String qcAddress, String qcFunding, String qcPhoneNum, int qcNumOfBeds, int qcCapacity,
                                 int qcVentilationCapacity){

        SQLiteDatabase DB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("qcName", qcName);
        contentValues.put("qcAddress", qcAddress);
        contentValues.put("qcFunding", qcFunding);
        contentValues.put("qcPhoneNum", qcPhoneNum);
        contentValues.put("qcNumOfBeds", qcNumOfBeds);
        contentValues.put("qcCapacity", qcCapacity);
        contentValues.put("qcVentilationCapacity", qcVentilationCapacity);

        long result = DB.insert("QuarantineCenter", null, contentValues);

        if(result == -1){
            return false;
        }else{
            return true;
        }
    }

    public Cursor getData(){
        SQLiteDatabase DB = this.getWritableDatabase();
        Cursor cursor = DB.rawQuery("SELECT * FROM QuarantineCenter", null);
        return cursor;
    }
}
