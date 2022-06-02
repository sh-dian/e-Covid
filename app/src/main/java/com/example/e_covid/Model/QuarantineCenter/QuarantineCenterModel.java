package com.example.e_covid.Model.QuarantineCenter;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

public class QuarantineCenterModel extends SQLiteOpenHelper {
    public QuarantineCenterModel(Context context) {
        super(context, "e-Covid.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase DB) {
        DB.execSQL("CREATE Table QuarantineCenter(qcName TEXT primary key, address TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase DB, int i, int i1) {
        DB.execSQL("DROP Table if exists QuarantineCenter");
    }

    //insert function
    public Boolean insertQC_data(String qcName, String address){
        SQLiteDatabase DB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("qcName", qcName);
        contentValues.put("address", address);

        long result = DB.insert("QuarantineCenter", null, contentValues);

        if(result == 1){
            return false;
        }else{
            return true;
        }
    }
}
