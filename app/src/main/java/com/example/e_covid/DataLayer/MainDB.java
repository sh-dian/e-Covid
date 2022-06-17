package com.example.e_covid.DataLayer;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MainDB extends SQLiteOpenHelper {

    private static final String DB_Name = "eCovid.db";
    private static final int version = 1;

    public MainDB(Context context) {
        super(context, DB_Name, null,version);
    }

    //drop table in database if exists
    @Override
    public void onUpgrade(SQLiteDatabase DB, int oldVerse, int newVerse) {

        DB.execSQL("DROP Table if exists User");
        DB.execSQL("DROP Table if exists MovementRecord");
        DB.execSQL("DROP Table if exists VaccinationRegistration");
        DB.execSQL("DROP Table if exists VaccinationCertificate");
        DB.execSQL("DROP Table if exists Dependent");
        DB.execSQL("DROP Table if exists AdminQuarantineRecord");
        DB.execSQL("DROP Table if exists UserQuarantineDetail");
        DB.execSQL("DROP Table if exists UserQuarantineRegistration");
        DB.execSQL("DROP Table if exists QuarantineCenter");
    }

    //Create Table for database
    @Override
    public void onCreate(SQLiteDatabase DB) {

        DB.execSQL("CREATE Table User(ECMS_ID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, ECMS_UserType TEXT, ECMS_FullName TEXT, ECMS_Password TEXT, ECMS_EmailPhone TEXT," +
                "ECMS_StateCountry INTEGER)");

                ContentValues values = new ContentValues();

                values.put("ECMS_ID", "1");
                values.put("ECMS_UserType", "Malaysian Citizen");
                values.put("ECMS_Password", "123");
                values.put("ECMS_Fullname", "Dharmaseelan");
                values.put("ECMS_EmailPhoneNo", "0104691403");
                values.put("ECMS_StateCountry ", "Perak");

                DB.insert("User", "ECMS_ID", values);


        DB.execSQL("CREATE Table VaccinationCertificate(VCert_ID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, VCert_Name TEXT," +
                "VCert_BatchNum TEXT, VCert_VaccineNum TEXT, VCert_VaccinatedDate TEXT)");

                ContentValues values2 = new ContentValues();

                values2.put("VCert_ID", "1");
                values2.put("VCert_Name", "1");
                values2.put("VCert_BatchNum", "11");
                values2.put("VCert_VaccineNum", "111");
                values2.put("VCert_VaccinatedDate ", "15-05-2022");

                DB.insert("VaccinationCertificate", "VCert_ID", values2);

        DB.execSQL("CREATE Table Dependent(Dependent_ID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, Dependent_Name TEXT," +
                "Dependent_Relation TEXT)");

                ContentValues values3 = new ContentValues();

                values3.put("Dependent_ID", "1");
                values3.put("Dependent_Name", "Raman");
                values3.put("Dependent_Relation", "Parent");

                DB.insert("Dependent", "Dependent_ID", values3);

        DB.execSQL("CREATE Table QuarantineCenter(QC_ID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, QC_Name TEXT, QC_PhoneNum TEXT, QC_Type TEXT, QC_Capacity INTEGER," +
                "QC_NumOfBeds INTEGER, QC_VentilationCapacity INTEGER, QC_Address TEXT, QC_Funding TEXT)");

                ContentValues values4 = new ContentValues();

                values4.put("QC_ID", "1");
                values4.put("QC_Name", "Hospital Sungai Buloh");
                values4.put("QC_PhoneNum", "0436274342");
                values4.put("QC_Type", "Hospital Based");
                values4.put("QC_Capacity", "1000");
                values4.put("QC_NumOfBeds", "1000");
                values4.put("QC_VentilationCapacity", "1000");
                values4.put("QC_Address", "Pulau Pinang");
                values4.put("QC_Funding", "Government");

                DB.insert("QuarantineCenter", "QC_ID", values4);

        DB.execSQL("CREATE Table UserQuarantineRegistration(UQR_ID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, UQR_QuarantineType TEXT, UQR_TestResult TEXT," +
                "UQR_DateTest DATE, UQR_CurrentlyState TEXT, UQR_Disease BOOLEAN, UQR_ChestDisease BOOLEAN, UQR_Location TEXT," +
                "UQR_PeopleNU INTEGER, UQR_DataStart DATE, UQR_Ambulances BOOLEAN, UQR_Comment TEXT, " +
                "ECMS_ID INTEGER NOT NULL, QC_ID INTEGER NOT NULL," +
                "FOREIGN KEY(ECMS_ID) REFERENCES User(ECMS_ID), FOREIGN KEY(QC_ID) REFERENCES QuarantineCenter(QC_ID))");

                ContentValues values5 = new ContentValues();

                values5.put("ECMS_ID", "1");
                values5.put("UQR_ID", "1");
                values5.put("UQR_QuarantineType ", " null ");
                values5.put("UQR_TestResult ", " null ");
                values5.put("UQR_DateTest ", " null ");
                values5.put("UQR_CurrentlyState", " null ");
                values5.put("UQR_Disease ", " null ");
                values5.put("UQR_ChestDiseases ", " null ");
                values5.put("UQR_Location", " null ");
                values5.put("UQR_PeopleNU ", " null ");
                values5.put("UQR_DataStart ", " null ");
                values5.put("UQR_Ambulances", " null ");
                values5.put("UQR_Comment ", " null ");
                values5.put("QC_ID", "");

                DB.insert("UserQuarantineRegistration", "UQR_ID", values5);


        DB.execSQL("CREATE Table UserQuarantineDetail(UQD_ID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, UQD_Question1 BOOLEAN, UQD_Question2 BOOLEAN," +
                "UQD_Question3 BOOLEAN, UQD_Question4 BOOLEAN, UQD_Question5 BOOLEAN, UQD_DayLeft DATE," +
                "UQR_ID INTEGER NOT NULL," +
                "FOREIGN KEY(UQR_ID) REFERENCES UserQuarantineRegistration(UQR_ID))");

                ContentValues values7 = new ContentValues();

                values7.put("ECMS_ID", "1");
                values7.put("UQD_ID", "1");
                values7.put("UQR_ID", "1");
                values7.put("UQR_Question1", " null ");
                values7.put("UQR_Question2", " null ");
                values7.put("UQR_Question3", " null ");
                values7.put("UQR_Question4", " null ");
                values7.put("UQR_Question5", " null ");
                values7.put("UQR_DayLeft", " null ");

                DB.insert("UserQuarantineDetail", "UQD_ID", values7);

        DB.execSQL("CREATE Table AdminQuarantineRecord(AQR_ID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, AQR_StatusQ BOOLEAN," +
                "AQR_CheckQ BOOLEAN, AQR_Feedback TEXT," +
                "UQR_ID INTEGER NOT NULL," +
                "FOREIGN KEY(UQR_ID) REFERENCES UserQuarantineRegistration(UQR_ID))");

                    ContentValues values8 = new ContentValues();

                    values8.put("ECMS_ID", "1");
                    values8.put("AQR_ID", "1");
                    values8.put("AQR_StatusQ ", "null");
                    values8.put("AQR_CheckQ", "null");
                    values8.put("AQR_FeedBack ", "l");
                    values8.put("UQR_ID", "1");

                    DB.insert("AdminQuarantineRecord", "AQR_ID", values8);

        DB.execSQL("CREATE Table MovementRecord(MR_ID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, MR_Location TEXT, MR_Name TEXT, MR_PhoneNum TEXT, MR_Date TEXT, MR_Time TEXT, " +
                "MR_RiskStatus TEXT, MR_VaccineStatus TEXT, " +
                "ECMS_ID INTEGER NOT NULL,"+
                "FOREIGN KEY(ECMS_ID) REFERENCES User(ECMS_ID))");

                ContentValues values9 = new ContentValues();

                values9.put("MR_ID", "1");
                values9.put("ECMS_ID", "1");
                values9.put("MR_Location", "UMP pekan");
                values9.put("MR_Date", "03-05-2020");
                values9.put("MR_Time", "01:00pm");
                values9.put("MR_RiskStatus", "Normal");
                values9.put("MR_VaccineStatus", "vaccinated");
                
                DB.insert("MovementRecord", "MR_ID", values9);

        DB.execSQL("CREATE Table VaccinationRegistration(VRegID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, VReg_Status TEXT, VReg_PlaceAppointment TEXT, VReg_DateAppointment TEXT," +
                "ECMS_ID INTEGER NOT NULL, VCert_ID INTEGER NOT NULL," +
                "FOREIGN KEY(ECMS_ID) REFERENCES User(ECMS_ID), FOREIGN KEY(VCert_ID) REFERENCES VaccinationCertificate(VCert_ID))");

                ContentValues values10 = new ContentValues();

                values10.put("VRegID", "1");
                values10.put("VReg_Status", "Yes");
                values10.put("VReg_PlaceAppointment", "Perak");
                values10.put("VReg_DateAppointment ", "01-05-2022");
                values10.put("VCert_ID", "1");
                values10.put("ECMS_ID", "1");

                DB.insert("VaccinationRegistration", "VRegID", values10);

    }


}
