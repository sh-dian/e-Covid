package com.example.e_covid.DomainLayer.Controller.QuarantineCenter;

import android.app.Activity;
import android.database.Cursor;

import com.example.e_covid.DataLayer.Model.QuarantineCenter.QuarantineCenterModel;

public class QuarantineCenterController {

    private final QuarantineCenterModel model;

    public QuarantineCenterController(Activity ui) {
        this.model = new QuarantineCenterModel(ui);
    }

    public Boolean Add_QC(String qcName, String qcAddress, String qcFunding, String qcPhoneNum, int qcBedNum, int qcCapacity, int qcVentilationCapacity){
        return model.insertQC_data(qcName, qcAddress, qcFunding, qcPhoneNum, qcBedNum, qcCapacity, qcVentilationCapacity);
    }

    public Boolean Delete_QC(String qcName){
        return model.deleteQC_data(qcName);
    }

    public Boolean Update_QC(String qcName, String qcAddress, String qcFunding, String qcPhoneNum, int qcBedNum, int qcCapacity, int qcVentilationCapacity){
        return model.updateQC_data(qcName, qcAddress, qcFunding, qcPhoneNum, qcBedNum, qcCapacity, qcVentilationCapacity);
    }

    public Cursor getData() {
        return model.readAllData();
    }
}
