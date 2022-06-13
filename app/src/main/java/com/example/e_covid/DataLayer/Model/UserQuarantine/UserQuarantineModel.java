package com.example.e_covid.DataLayer.Model.UserQuarantine;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;
import android.widget.Toast;

public class UserQuarantineModel extends SQLiteOpenHelper {


    private Context context;
    private static final String DATABADE_NAME = "UserQuarantine.db";
    private static final int DATABADE_VERGION = 1;

    private static final String TABLE_NAME = "Registration Quarantine ";
    private static final String UQR_ID  =  "_id";
    private static final String UQR_QuarantineType  = "QuarantineType";
    private static final String UQR_TestResult = "TestResult";
    private static final String UQR_DateTest = "DateTest";
    private static final String UQR_CurrentlyState = "CurState";
    private static final String UQR_Disable  = "Disable";
    private static final String UQR_ChestDiseases  = "ChestDiseases";




    public UserQuarantineModel(@Nullable Context context) {
        super(context, DATABADE_NAME, null, DATABADE_VERGION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String query = "CREATE TABLE " + TABLE_NAME +
                        " (" + UQR_ID  + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                            UQR_QuarantineType  + " TEXT, " +
                            UQR_TestResult + " TEXT, " +
                            UQR_DateTest + " INTEGER, " +
                            UQR_CurrentlyState + " TEXT, " +
                            UQR_Disable  + " BOOLONE, " +
                            UQR_ChestDiseases  + " BOOLONE);";
        db.execSQL(query);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);

    }

    public boolean  addHome(String Type, String Result, Integer DateTest , String CurState, Boolean Disable , Boolean Chest) {

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv =  new ContentValues();
        cv.put(UQR_QuarantineType , Type);
        cv.put(UQR_TestResult, Result);
        cv.put(UQR_DateTest, DateTest);
        cv.put(UQR_CurrentlyState, CurState);
        cv.put(UQR_Disable , Disable);
        cv.put(UQR_ChestDiseases , Chest);
        long result = db.insert(TABLE_NAME,null, cv);
        if(result == -1){
            Toast.makeText(context, "Failed", Toast.LENGTH_SHORT).show();

            return false;
        }else{
            Toast.makeText(context, "AddedSuccessfully!", Toast.LENGTH_SHORT).show();
            return true;
        }


    }
}
