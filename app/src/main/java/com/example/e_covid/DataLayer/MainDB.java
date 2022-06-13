package com.example.e_covid.DataLayer;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MainDB extends SQLiteOpenHelper {

    private static final String DB_Name = "eCovid.db";
    private static final int version = 1;

    public MainDB(Context context) {
        super(context, DB_Name, null,version);
    }

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

    @Override
    public void onCreate(SQLiteDatabase DB) {

        DB.execSQL("CREATE Table User(ECMS_ID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, ECMS_UserType TEXT, ECMS_FullName TEXT, ECMS_Password TEXT, ECMS_EmailPhone TEXT," +
                "ECMS_StateCountry INTEGER)");

        DB.execSQL("CREATE Table VaccinationCertificate(VCert_ID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, VCert_Name TEXT," +
                "VCert_BatchNum TEXT, VCert_VaccineNum TEXT, VCert_VaccinatedDate TEXT)");

        DB.execSQL("CREATE Table Dependent(Dependent_ID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, Dependent_Name TEXT," +
                "Dependent_Relation TEXT)");

        DB.execSQL("CREATE Table QuarantineCenter(QC_ID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, QC_Name TEXT, QC_PhoneNum TEXT, QC_Capacity INTEGER," +
                "QC_NumOfBeds INTEGER, QC_VentilationCapacity INTEGER, QC_Address TEXT, QC_Funding TEXT)");

        DB.execSQL("CREATE Table UserQuarantineRegistration(UQR_ID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, UQR_QuarantineType TEXT, UQR_TestResult TEXT," +
                "UQR_DateTest DATE, UQR_CurrentlyState TEXT, UQR_Disease BOOLEAN, UQR_ChestDisease BOOLEAN, UQR_Location TEXT," +
                "UQR_PeopleNU INTEGER, UQR_DataStart DATE, UQR_Ambulances BOOLEAN, UQR_Comment TEXT, " +
                "ECMS_ID INTEGER NOT NULL, QC_ID INTEGER NOT NULL," +
                "FOREIGN KEY(ECMS_ID) REFERENCES User(ECMS_ID), FOREIGN KEY(QC_ID) REFERENCES QuarantineCenter(QC_ID))");

        DB.execSQL("CREATE Table UserQuarantineDetail(UQD_ID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, UQD_Question1 BOOLEAN, UQD_Question2 BOOLEAN," +
                "UQD_Question3 BOOLEAN, UQD_Question4 BOOLEAN, UQD_Question5 BOOLEAN, UQD_DayLeft DATE," +
                "UQR_ID INTEGER NOT NULL," +
                "FOREIGN KEY(UQR_ID) REFERENCES UserQuarantineRegistration(UQR_ID))");

        DB.execSQL("CREATE Table AdminQuarantineRecord(AQR_ID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, AQR_StatusQ BOOLEAN," +
                "AQR_CheckQ BOOLEAN, AQR_Feedback TEXT," +
                "UQR_ID INTEGER NOT NULL," +
                "FOREIGN KEY(UQR_ID) REFERENCES UserQuarantineRegistration(UQR_ID))");

        DB.execSQL("CREATE Table MovementRecord(MR_ID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, MR_Location TEXT, MR_Name TEXT, MR_PhoneNum TEXT, MR_Date TEXT, MR_Time TEXT, " +
                "MR_RiskStatus TEXT, MR_VaccineStatus TEXT, " +
                "ECMS_ID INTEGER NOT NULL,"+
                "FOREIGN KEY(ECMS_ID) REFERENCES User(ECMS_ID))");

        DB.execSQL("CREATE Table VaccinationRegistration(VRegID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, VReg_Status TEXT, VReg_PlaceAppointment TEXT, VReg_DateAppointment TEXT," +
                "ECMS_ID INTEGER NOT NULL, VCert_ID INTEGER NOT NULL," +
                "FOREIGN KEY(ECMS_ID) REFERENCES User(ECMS_ID), FOREIGN KEY(VCert_ID) REFERENCES VaccinationCertificate(VCert_ID))");
    }
}
