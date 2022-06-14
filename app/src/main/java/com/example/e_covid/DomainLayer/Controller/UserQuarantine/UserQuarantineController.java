package com.example.e_covid.DomainLayer.Controller.UserQuarantine;

import android.app.Activity;
import android.database.Cursor;

import com.example.e_covid.DataLayer.Model.UserQuarantine.UserQuarantineModel;

public class UserQuarantineController {

    private final UserQuarantineModel model;

    public UserQuarantineController(Activity ui) {this.model = new UserQuarantineModel(ui);}


    public Boolean Add_QHome(String uqr_QuarantineType,String uqr_TestResult,String uqr_DateTest,String uqr_CurrentlyState,Boolean uqr_Disable,
                             Boolean uqr_ChestDiseases,String uqr_Location,Integer uqr_PeopleNU,String uqr_DateStart){
        return model.insertHome(uqr_QuarantineType, uqr_TestResult,uqr_DateTest, uqr_CurrentlyState, uqr_Disable, uqr_ChestDiseases,
                                 uqr_Location, uqr_PeopleNU,uqr_DateStart);
    }

    public Boolean Add_QCenter(String uqr_QuarantineType,String uqr_TestResult,String uqr_DateTest,String uqr_CurrentlyState,Boolean uqr_Disable,
                             Boolean uqr_ChestDiseases /*,String uqr_Location,Integer uqr_PeopleNU,String uqr_DateStart, Boolean uqr_Ambulances,String uqr_Comment*/ ){
        return model.insertCenter(uqr_QuarantineType, uqr_TestResult,uqr_DateTest, uqr_CurrentlyState, uqr_Disable, uqr_ChestDiseases /*,
                uqr_Location, uqr_PeopleNU,uqr_DateStart,uqr_Ambulances,uqr_Comment */);
    }


}
