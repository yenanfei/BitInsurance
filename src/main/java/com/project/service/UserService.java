package com.project.service;

import com.project.model.*;

import java.util.ArrayList;

/**
 * Created by ZZ on 2017/5/11.
 */
public interface UserService {
    void InfoManagement(String username,String password,String age,String mail,String sex,String phone,String IDcard,String illness,String address,String realname);
    UserInfo SelectInfo(String username);
    void Report(String tradeId,String name,String username,String reason);
    ArrayList<ArrayList<String>> SelectReportID(String ID);
    Report SelectReportById(String reportId);
    ArrayList<ArrayList<String>> SelectInsurance();
    ArrayList<String> SelectInsuranceById(String InsuranceId);
    ArrayList<String> Insuranced(String username,String starttime);
    boolean  pay(String fromrealname,String insuranceId,String scorepay,String time,String username);
    ArrayList<ArrayList<String>> SelectInsuranceManage(String username);
    void InsuranceManagement();
    void Claim();
    public boolean sureClaim(String tradeId,String claimreason);
}
