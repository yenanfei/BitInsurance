package com.project.controller;

/**
 * Created by ZZDELY on 2017/9/3.
 */
import com.alibaba.fastjson.JSON;
import com.project.model.*;
import com.project.service.impl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

@Controller
@SessionAttributes("username")
@RequestMapping("/clerk")
public class ClerkController {
    private ClerkServiceImpl clerkServiceImpl;

    @Autowired
    public void setClerkServiceImpl(@Qualifier("clerkServiceImpl") ClerkServiceImpl clerkServiceImpl) {
        this.clerkServiceImpl = clerkServiceImpl;
    }

    //http://localhost:8080/clerk/main
    @RequestMapping(value="/main", method= RequestMethod.GET)
    public String gotoclerkmain( Model model) {
        return "clerk_main";
    }

    //http://localhost:8080/clerk/claim
    @RequestMapping(value="/claim", method= RequestMethod.GET)
    public String gotoclaim( Model model) {
        return "clerk_claim_list";
    }

    @RequestMapping(value="/claimlist", method= RequestMethod.POST, produces = "application/json; charset=utf-8")
    public
    @ResponseBody
    String Selectclaimlist(HttpServletRequest request){
        ArrayList<ArrayList<String>> detailsList = new ArrayList<>();
        detailsList=clerkServiceImpl.SelectClaimList();
        /*for(int i=0;i<3;i++)
        {
            ArrayList<String> strList = new ArrayList<>();
            strList.add(String.valueOf(i));
            strList.add(""+String.valueOf(i+1));
            strList.add(""+String.valueOf(i+2));
            detailsList.add(strList);
        }*/
        String jsonData= JSON.toJSONString(detailsList);
        return jsonData;
    }

    //http://localhost:8080/clerk/claimid?
    @RequestMapping(value="/ClaimView", method= RequestMethod.GET)
    public String gotoClaimView( Model model) {
        return "clerk_claim_details";
    }

    @RequestMapping(value="/ClaimViewBack", method= RequestMethod.POST, produces = "application/json; charset=utf-8")
    public
    @ResponseBody
    String SelectClaim(HttpServletRequest request) {
        String tradeId = request.getParameter("id");
        /*ArrayList<String> dataList=new ArrayList<String>();
        dataList.add("1");
        dataList.add(""+"swqwqwqwqwqwqwqww");*/
        ArrayList<String> dataList = clerkServiceImpl.SelectClaim(tradeId);
        String jsonData = JSON.toJSONString(dataList);
        return jsonData;
    }

    @RequestMapping(value="/Claimaccept", method= RequestMethod.POST)
    public
    @ResponseBody
    String Claimaccept(HttpServletRequest request) {
        String claimId = request.getParameter("id");
        if(clerkServiceImpl.claimaccept(claimId))
        {
            ArrayList<String> dataList=new ArrayList<String>();
            String jsonData = JSON.toJSONString(dataList);
            return jsonData;
        }
        return "error";
    }
    //http://localhost:8080/clerk/reportList
    @RequestMapping(value="/reportList", method= RequestMethod.GET)
    public String gotoreportList( Model model) {
        return "clerk_report_list";
    }

    @RequestMapping(value="/reportlist", method= RequestMethod.POST, produces = "application/json; charset=utf-8")
    public
    @ResponseBody
    String reportlist(HttpServletRequest request){
        ArrayList<ArrayList<String>> detailsList = new ArrayList<>();
        detailsList=clerkServiceImpl.SelectReport();
        /*for(int i=0;i<3;i++)
        {
            ArrayList<String> strList = new ArrayList<>();
            strList.add(String.valueOf(i));
            strList.add(""+String.valueOf(i+1));
            strList.add(""+String.valueOf(i+2));
            detailsList.add(strList);
        }*/
        String jsonData= JSON.toJSONString(detailsList);
        return jsonData;
    }

    //http://localhost:8080/clerk/claimid?
    @RequestMapping(value="/ReportView", method= RequestMethod.GET)
    public String gotoReportView( Model model) {
        return "clerk_report_view";
    }

    @RequestMapping(value="/ReportViewBack", method= RequestMethod.POST, produces = "application/json; charset=utf-8")
    public
    @ResponseBody
    String Selectreport(HttpServletRequest request) {
        String reportId = request.getParameter("id");
       /* ArrayList<String> dataList=new ArrayList<String>();
        dataList.add("1");
        dataList.add(""+"swqwqwqwqwqwqwqww");*/
        ArrayList<String> dataList = clerkServiceImpl.SelectReportById(reportId);
        String jsonData = JSON.toJSONString(dataList);
        return jsonData;
    }

    @RequestMapping(value="/Reportaccept", method= RequestMethod.POST)
    public
    @ResponseBody
    String Reportaccept(HttpServletRequest request) {
        String reportId = request.getParameter("id");
        if(clerkServiceImpl.reportaccept(reportId))
        {
            ArrayList<String> dataList=new ArrayList<String>();
            String jsonData = JSON.toJSONString(dataList);
            return jsonData;
        }
        return "error";
    }
    //http://localhost:8080/clerk/insurancelist
    @RequestMapping(value="/insurancelist", method= RequestMethod.GET)
    public String gotoinsurancelist( Model model) {
        return "clerk_insurance_list";
    }

    @RequestMapping(value="/insurancelist", method= RequestMethod.POST, produces = "application/json; charset=utf-8")
    public
    @ResponseBody
    String selectInsurance(HttpServletRequest request){
        ArrayList<ArrayList<String>> detailsList = new ArrayList<>();
        detailsList=clerkServiceImpl.SelectinsuranceList();
        /*for(int i=0;i<3;i++)
        {
            ArrayList<String> strList = new ArrayList<>();
            strList.add(String.valueOf(i));
            strList.add(""+String.valueOf(i+1));
            strList.add(""+String.valueOf(i+2));
            detailsList.add(strList);
        }*/
        String jsonData= JSON.toJSONString(detailsList);
        return jsonData;
    }
/*    @RequestMapping(value="/deleteInsurance", method= RequestMethod.POST, produces = "application/json; charset=utf-8")
    public
    @ResponseBody
    String deleteInsurance(HttpServletRequest request){
        String insuranceId=request.getParameter("id");
        if(clerkServiceImpl.DeleteInsurance(insuranceId))
        {
            ArrayList<String> dataList=new ArrayList<String>();
            String jsonData = JSON.toJSONString(dataList);
            return jsonData;
        }
        return "error";
    }*/

    //http://localhost:8080/clerk/addInsurance
    @RequestMapping(value="/addInsurance", method= RequestMethod.GET)
    public String gotoaddInsurance( Model model) {
        return "clerk_insurance_add";
    }

    @RequestMapping(value="/addInsurance1", method= RequestMethod.POST, produces = "application/json; charset=utf-8")
    public
    @ResponseBody
    String addInsurance1(HttpServletRequest request) {
        ArrayList<String> dataList=new ArrayList<String>();
        String jsonData = JSON.toJSONString(dataList);
        return jsonData;
    }

    @RequestMapping(value="/addInsurance", method= RequestMethod.POST, produces = "application/json; charset=utf-8")
    public
    @ResponseBody
    String addInsurance2 (HttpServletRequest request){
        String insurancename=request.getParameter("insurancename");
        String gaishu=request.getParameter("gaishu");
        String content=request.getParameter("content");
        String price=request.getParameter("price");
        if(clerkServiceImpl.AddInsurance(insurancename,gaishu,content,price))
        {
            ArrayList<String> dataList=new ArrayList<String>();
            String jsonData = JSON.toJSONString(dataList);
            return jsonData;
        }
        return "error";
    }

}
