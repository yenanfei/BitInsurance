package com.project.controller;

/**
 * Created by ZZDELY on 2017/9/3.
 */
import com.alibaba.fastjson.JSON;
import com.project.service.impl.*;
import com.project.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.management.monitor.StringMonitor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;

@Controller
@SessionAttributes("sessionUser")
@RequestMapping("/user")
public class UserController {
    private UserServiceImpl userServiceImpl;

    @Autowired
    public void setUserServiceImpl(@Qualifier("userServiceImpl") UserServiceImpl userServiceImpl) {
        this.userServiceImpl= userServiceImpl;
    }
    //http://localhost:8080/user/main
    @RequestMapping(value="/main", method= RequestMethod.GET)
    public String gotoMain( Model model) {
        return "user_main";
    }

    //http://localhost:8080/user/infomanage
    @RequestMapping(value="/infomanage", method= RequestMethod.GET)
    public String gotoinfomanage( Model model) {
        return "user_info_manage";
    }

    @RequestMapping(value="/infoUpdate", method= RequestMethod.POST)
    public
    @ResponseBody
    String InfoManagement(HttpServletRequest request) {
        String username=request.getParameter("username");
        String password="";
        String age=request.getParameter("age");
        String mail=request.getParameter("mail");
        String sex=request.getParameter("sex");
        String phone=request.getParameter("phone");
        String IDcard=request.getParameter("IDcard");
        String illness=request.getParameter("illness");
        String address=request.getParameter("address");
        String realname=request.getParameter("realname");
        userServiceImpl.InfoManagement(username,password,age,mail,sex,phone,IDcard,illness,address,realname);
        String jsonData= JSON.toJSONString("success");
        return jsonData;
    }

    @RequestMapping(value="/SelectInfo", method= RequestMethod.POST)
    public
    @ResponseBody
    String SelectInfo(HttpServletRequest request) {
        ArrayList<ArrayList<String>> detailsList = new ArrayList<>();
        ArrayList<String> strList = new ArrayList<>();
        HttpSession session=request.getSession();
        String username= (String) session.getAttribute("user");
        UserInfo userInfo=userServiceImpl.SelectInfo(username);
        String age=userInfo.getAge();
        String mail= userInfo.getEmail();
        String sex=userInfo.getGender();
        String phone= userInfo.getPhone();
        String IDcard=userInfo.getIdcard();
        String illness=userInfo.getDisease();
        String address=userInfo.getAddress();
        String realname=userInfo.getRealname();
        /*String password="1";
        String borth="2";
        String age="3";
        String mail="4";
        String sex="5";
        String phone="6";
        String IDcard="7";
        String marry="8";
        String illness="9";
        String job="10";
        String address="11";*/

        strList.add(username);
        strList.add("" + age);
        strList.add("" + mail);
        strList.add("" + sex);
        strList.add("" + phone);
        strList.add("" + IDcard);
        strList.add("" + illness);
        strList.add("" + address);
        strList.add("" + realname);
        detailsList.add(strList);
        String jsonData= JSON.toJSONString(detailsList);
        return jsonData;
    }

    //http://localhost:8080/user/report
    @RequestMapping(value="/report", method= RequestMethod.GET)
    public String gotoreport( Model model) {
        return "user_report";
    }

    @RequestMapping(value="/reportContent", method= RequestMethod.POST)
    public
    @ResponseBody
    String SelectReport(HttpServletRequest request) {
        String tradeId=request.getParameter("tradeID");
        String name=request.getParameter("name");
        String username=request.getParameter("username");
        String reason=request.getParameter("reason");
        userServiceImpl.Report(tradeId,name,username,reason);
        String jsonData= JSON.toJSONString("success");
        return jsonData;
    }

    @RequestMapping(value="/reportSelect", method= RequestMethod.POST)
    public
    @ResponseBody
    String selectReportID(HttpServletRequest request) {
        HttpSession session=request.getSession();
        String username= (String) session.getAttribute("user");
        ArrayList<ArrayList<String>> detailsList =userServiceImpl.SelectReportID(username);
       /* detailsList.add(strList);
        for(int i=0;i<4;i++)
        {
            ArrayList<String> strList = new ArrayList<>();
            strList.add(String.valueOf(i));
            strList.add(""+String.valueOf(i+1));
            detailsList.add(strList);
        }*/
        String jsonData= JSON.toJSONString(detailsList);
        return jsonData;
    }

    //http://localhost:8080/user/ReportView
    @RequestMapping(value="/ReportView", method= RequestMethod.GET)
    public String gotoReportView( Model model) {
        return "user_report_view";
    }

    @RequestMapping(value="/ReportView", method= RequestMethod.POST)
    public
    @ResponseBody
    String Selectreport(HttpServletRequest request) {
        String reportId = request.getParameter("id");
        ArrayList<String> dataList=new ArrayList<String>();
        dataList.add("1");
        dataList.add("没利润高");
        dataList.add(""+"swqwqwqwqwqwqwqww");
        /*ArrayList<String> dataList = userServiceImpl.SelectReportById(reportId);*/
        String jsonData = JSON.toJSONString(dataList);
        return jsonData;
    }


    //http://localhost:8080/user/viewinsurance
    @RequestMapping(value="/insuranceList", method= RequestMethod.GET)
    public String gotoInsuranceList( Model model) {
        return "user_insurance_list";
    }

    @RequestMapping(value="/SelectInsurance", method= RequestMethod.POST, produces = "application/json; charset=utf-8")
    public
    @ResponseBody
    String SelectInsurance(HttpServletRequest request) {
        ArrayList<ArrayList<String>> dataList = userServiceImpl.SelectInsurance();
        //ArrayList<ArrayList<String>> dataList =new ArrayList<>();
        /*for(int i=0;i<3;i++) {
            ArrayList<String> strlist=new ArrayList<>();
            strlist.add(String.valueOf(i+1));
            strlist.add(""+"断腿保险"+String.valueOf(i+1));
            strlist.add(""+"这是断腿保险"+String.valueOf(i+1));
            dataList.add(strlist);
        }*/
        String jsonData = JSON.toJSONString(dataList);
        return jsonData;
    }

    //http://localhost:8080/user/Insurance?id
    @RequestMapping(value="/Insurance", method= RequestMethod.GET)
    public String gotoInsurance( Model model) {
        return "user_insurance_view";
    }

    @RequestMapping(value="/InsuranceView", method= RequestMethod.POST, produces = "application/json; charset=utf-8")
    public
    @ResponseBody
    String SelectInsuranceById(HttpServletRequest request) {
        String insuranceId = request.getParameter("id");
        ArrayList<String> dataList = userServiceImpl.SelectInsuranceById(insuranceId);
        /*ArrayList<String> dataList=new ArrayList<String>();
        dataList.add("1");
        dataList.add(""+"swqwqwqwqwqwqwqww");*/
        String jsonData = JSON.toJSONString(dataList);
        return jsonData;
    }

    @RequestMapping(value="/buyinsurance", method= RequestMethod.GET)
    public String gotobuyinsurance( Model model) {
        return "user_insurance_buy";
    }

    @RequestMapping(value="/BuyInsurance", method= RequestMethod.POST, produces = "application/json; charset=utf-8")
    public
    @ResponseBody
    String ByInsurance(HttpServletRequest request)
    {
        String insurance=request.getParameter("id");
        String starttime=request.getParameter("starttime");

        ArrayList<String>detailsList = userServiceImpl.Insuranced(insurance,starttime);
        /*ArrayList<String> detailsList=new ArrayList<>();
        detailsList.add("断腿保险");
        detailsList.add(""+"mamama");
        detailsList.add(""+"100");
        detailsList.add(""+"明天");
        detailsList.add(""+"10");*/
        HttpSession session=request.getSession();
        String username= (String) session.getAttribute("user");
        detailsList.add(""+username);
        detailsList.add(""+"12345");
        String jsonData =JSON.toJSONString(detailsList);
        return jsonData;
    }

    @RequestMapping(value="/pay", method= RequestMethod.POST, produces = "application/json; charset=utf-8")
    public
    @ResponseBody
    String pay(HttpServletRequest request)
    {
        String fromrealname=request.getParameter("fromrealname");
        String insuranceId=request.getParameter("insuranceId");
        String scorepay=request.getParameter("scorepay");
        String starttime=request.getParameter("starttime");
        HttpSession session=request.getSession();
        String username= (String) session.getAttribute("user");
        if(userServiceImpl.pay(fromrealname,insuranceId,scorepay,starttime,username))
        {
            ArrayList<String> detailsList=new ArrayList<>();
            String jsonData =JSON.toJSONString(detailsList);
            return jsonData;
        }
        else{
            return "error";
        }

    }

    //http://localhost:8080/user/insurancemanage
    @RequestMapping(value="/insurancemanage", method= RequestMethod.GET)
    public String gotoinsurancemanage( Model model) {
        return "user_insurance_manage";
    }

    @RequestMapping(value="/Myinsurance", method= RequestMethod.POST, produces = "application/json; charset=utf-8")
    public
    @ResponseBody
    String myinsurance(HttpServletRequest request){
        HttpSession session=request.getSession();
        String userId= (String) session.getAttribute("user");
        //ArrayList<ArrayList<String>> detailsList = new ArrayList<>();
        ArrayList<ArrayList<String>> detailsList=userServiceImpl.SelectInsuranceManage(userId);
        /*detailsList.add(strList);
        for(int i=0;i<4;i++)
        {
            ArrayList<String> strList = new ArrayList<>();
            strList.add(String.valueOf(i));
            strList.add(""+String.valueOf(i+1));
            strList.add(""+String.valueOf(i+1));
            detailsList.add(strList);
        }*/
        String jsonData =JSON.toJSONString(detailsList);
        return jsonData;
    }

    //http://localhost:8080/user/Myinsurance
    @RequestMapping(value="/claim", method= RequestMethod.GET)
    public String gotoMyinsurance( Model model) {
        return "user_claim_details";
    }

    @RequestMapping(value="/claim", method= RequestMethod.POST, produces = "application/json; charset=utf-8")
    public
    @ResponseBody
    String sure(HttpServletRequest request){
        String tradeId=request.getParameter("id");
        String claimreason=request.getParameter("claimreason");
        if(userServiceImpl.sureClaim(tradeId,claimreason)) {
            ArrayList<String> detailsList = new ArrayList<>();
            String jsonData = JSON.toJSONString(detailsList);
            return jsonData;
        }
        return "error";
    }

}
