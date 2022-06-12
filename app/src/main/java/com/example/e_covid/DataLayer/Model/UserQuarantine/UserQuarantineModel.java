package com.example.e_covid.DataLayer.Model.UserQuarantine;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;
import android.widget.Toast;

public class UserQuarantineModel extends SQLiteOpenHelper {


    private Context context;
    private static final String DATABADE_NAME = "Qregistration.db";
    private static final int DATABADE_VERGION = 1;

    private static final String TABLE_NAME = "UserQuarantineRegistration";
    private static final String COLUMN_ID =  "_id";
    private static final String COLUMN_Type = "QuarantineType";
    private static final String COLUMN_Result = "TestResult";
    private static final String COLUMN_DateTest = "DateTest";
    private static final String COLUMN_CurState = "CurState";
    private static final String COLUMN_Disable = "Disable";
    private static final String COLUMN_Chest = "ChestDiseases";




    public UserQuarantineModel(@Nullable Context context) {
        super(context, DATABADE_NAME, null, DATABADE_VERGION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String query = "CREATE TABLE " + TABLE_NAME +
                        " (" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                            COLUMN_Type + " TEXT, " +
                            COLUMN_Result + " TEXT, " +
                            COLUMN_DateTest + " INTEGER, " +
                            COLUMN_CurState + " TEXT, " +
                            COLUMN_Disable + " BOOLONE, " +
                            COLUMN_Chest + " BOOLONE);";
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
        cv.put(COLUMN_Type, Type);
        cv.put(COLUMN_Result, Result);
        cv.put(COLUMN_DateTest, DateTest);
        cv.put(COLUMN_CurState, CurState);
        cv.put(COLUMN_Disable, Disable);
        cv.put(COLUMN_Chest, Chest);
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
