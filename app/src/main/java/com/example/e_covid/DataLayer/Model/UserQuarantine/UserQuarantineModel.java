package com.example.e_covid.DataLayer.Model.UserQuarantine;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.e_covid.DataLayer.MainDB;

public class UserQuarantineModel  {

    private MainDB  mainDB;
    private Context context;

    public UserQuarantineModel(Context context){
        mainDB = new MainDB(context);
        this.context = context;
    }


    public Boolean insertHome(String QuarantineType, String TestResult, String DateTest, String CurState, Boolean Disable,
                              Boolean ChestDiseases, String Location, Integer PeopleNumber,String DateStart){
    SQLiteDatabase DB = mainDB.getWritableDatabase();
    ContentValues contentValues = new ContentValues();

    contentValues.put( "UQR_QuarantineType",  QuarantineType);
    contentValues.put( "UQR_TestResult",  TestResult);
    contentValues.put( "UQR_DateTest", DateTest);
    contentValues.put( "UQR_CurrentlyState", CurState);
    contentValues.put( "UQR_Disable", Disable);
    contentValues.put( "UQR_ChestDiseases", ChestDiseases);
    contentValues.put( "UQR_Location", Location);
    contentValues.put( "UQR_PeopleNU", PeopleNumber);
    contentValues.put( "UQR_DateStart", DateStart);
    contentValues.put( "UQR_Ambulances", "null");
    contentValues.put( "UQR_Comment", "null");

        long result = DB.insert("QuarantineRegistration", null, contentValues);
        return result != 1;
    }


    public Boolean insertCenter(String QuarantineType, String TestResult, String DateTest, String CurState, Boolean Disable,
                                Boolean ChestDiseases /*, String Location, Integer PeopleNumber,String DateStart, Boolean Ambulances, String Comment*/){
        SQLiteDatabase DB = mainDB.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put( "UQR_QuarantineType",  QuarantineType);
        contentValues.put( "UQR_TestResult",  TestResult);
        contentValues.put( "UQR_DateTest", DateTest);
        contentValues.put( "UQR_CurrentlyState", CurState);
        contentValues.put( "UQR_Disable", Disable);
        contentValues.put( "UQR_ChestDiseases", ChestDiseases);
       /* contentValues.put( "UQR_Location", Location);
        contentValues.put( "UQR_PeopleNU", PeopleNumber);
        contentValues.put( "UQR_DateStart", DateStart);
        contentValues.put( "UQR_Ambulances", Ambulances);
        contentValues.put( "UQR_Comment", Comment);
        */


        long result = DB.insert("QuarantineRegistration", null, contentValues);
        return result != 1;
    }

}
