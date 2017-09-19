package com.project.service;

import java.util.ArrayList;

/**
 * Created by ZZDELY on 2017/9/3.
 */
public interface ClerkService {
    ArrayList<ArrayList<String>> SelectClaimList();
    boolean  claimaccept( String id);
    boolean  reportaccept( String tradeId);
    public ArrayList<String> SelectClaim(String id);
    public void ReviewClaim();
    public ArrayList<ArrayList<String>> SelectReport();
    public void Award();
    public void Ban();
    public void SelectInsurance();
    ArrayList<ArrayList<String>>SelectinsuranceList();
    ArrayList<String> SelectReportById( String reportId);
    boolean AddInsurance(String insurancename,String gaishu,String content,String price);
    public void UpdateInsurance();
    boolean DeleteInsurance(String insuranceId);
}
