package com.example.e_covid.Model.Registration;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class RegistrationModel extends SQLiteOpenHelper {

    public RegistrationModel(Context context) {super(context, "e-Covid.db", null, 1);}
    @Override
    public void onCreate(SQLiteDatabase DB) {
        DB.execSQL("CREATE Table Registration(reID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, re_Name TEXT, reIcpassport TEXT, reStateCountry TEXT, rePhoneNumEmail TEXT," +
                "rePassword INTEGER, rePasswordRe INTEGER)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase DB, int i, int i1) {
        DB.execSQL("DROP Table if exists Registration");
    }

    //insert function
    public Boolean insertRE_data(String RE_name, String RE_Icpassport, String RE_StateCountry, String RE_PhoneNumEmail, int RE_Password, int RE_PasswordRe){

        SQLiteDatabase DB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("RE_name", RE_name);
        contentValues.put("RE_Icpassport", RE_Icpassport);
        contentValues.put("RE_StateCountry", RE_StateCountry);
        contentValues.put("RE_PhoneNumEmail", RE_PhoneNumEmail);
        contentValues.put("RE_password", RE_Password);
        contentValues.put("RE_PasswordRe", RE_PasswordRe);


        long result = DB.insert("Registration", null, contentValues);

        return result != 1;
    }

    public Cursor readAllData(){
        String query = "SELECT * FROM Registration";
        SQLiteDatabase DB = this.getReadableDatabase();

        Cursor cursor = null;
        if(DB != null){
            cursor = DB.rawQuery(query, null);
        }
        return cursor;
    }
}
