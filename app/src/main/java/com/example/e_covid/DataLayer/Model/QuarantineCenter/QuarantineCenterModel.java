package com.example.e_covid.DataLayer.Model.QuarantineCenter;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.e_covid.DataLayer.MainDB;

public class QuarantineCenterModel{

    //declaration
    private MainDB mainDB;
    private Context context;

    public QuarantineCenterModel(Context context){
        mainDB = new MainDB(context);
        this.context = context;
    }

    //insert function
    public Boolean insertQC_data(String QC_Name, String QC_Address, String QC_Type, String QC_Funding, String QC_PhoneNum, int QC_NumOfBeds, int QC_Capacity,
                                 int QC_VentilationCapacity){

        SQLiteDatabase DB = mainDB.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("QC_Name", QC_Name);
        contentValues.put("QC_Address", QC_Address);
        contentValues.put("QC_PhoneNum", QC_PhoneNum);
        contentValues.put("QC_Type", QC_Type);
        contentValues.put("QC_Funding", QC_Funding);
        contentValues.put("QC_NumOfBeds", QC_NumOfBeds);
        contentValues.put("QC_Capacity", QC_Capacity);
        contentValues.put("QC_VentilationCapacity", QC_VentilationCapacity);

        long result = DB.insert("QuarantineCenter", null, contentValues);

        return result != 1;
    }

    //delete function
    public Boolean deleteQC_data(String QC_Name){

        SQLiteDatabase DB = mainDB.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        Cursor cursor = DB.rawQuery("SELECT * FROM QuarantineCenter WHERE QC_Name =?", new String[] {QC_Name});

        if(cursor.getCount() > 0) {

            long result = DB.delete("QuarantineCenter", "QC_Name=?", new String[]{QC_Name});

            if(result == -1){
                return false;
            }else{
                return true;
            }
        }else{
            return false;
        }
    }

    //update function
    public Boolean updateQC_data(String QC_Name, String QC_Address, String QC_Funding, String QC_PhoneNum, int QC_NumOfBeds, int QC_Capacity,
                                 int QC_VentilationCapacity){

        SQLiteDatabase DB = mainDB.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("QC_Address", QC_Address);
        contentValues.put("QC_PhoneNum", QC_PhoneNum);
        contentValues.put("QC_Funding", QC_Funding);
        contentValues.put("QC_NumOfBeds", QC_NumOfBeds);
        contentValues.put("QC_Capacity", QC_Capacity);
        contentValues.put("QC_VentilationCapacity", QC_VentilationCapacity);

        Cursor cursor = DB.rawQuery("SELECT * FROM QuarantineCenter WHERE QC_Name =?", new String[] {QC_Name});

        if(cursor.getCount() > 0) {

            long result = DB.update("QuarantineCenter", contentValues, "QC_Name=?", new String[]{QC_Name});

            if(result == -1){
                return false;
            }else{
                return true;
            }
        }else{
            return false;
        }
    }

    public Cursor readAllData(){
        String query = "SELECT * FROM QuarantineCenter";
        SQLiteDatabase DB = mainDB.getReadableDatabase();

        Cursor cursor = null;
        if(DB != null){
            cursor = DB.rawQuery(query, null);
        }
        return cursor;
    }
}
