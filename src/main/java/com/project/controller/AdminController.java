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
@RequestMapping("/admin")
public class AdminController {
    private AdminServiceImpl adminServiceImpl;

    @Autowired
    public void setAdminServiceImpl(@Qualifier("adminServiceImpl") AdminServiceImpl adminServiceImpl) {
        this.adminServiceImpl= adminServiceImpl;
    }

    //http://localhost:8080/admin/main
    @RequestMapping(value="/main", method= RequestMethod.GET)
    public String gotoadminmain( Model model) {
        return "admin_main";
    }

    //http://localhost:8080/admin/levelmanage
    @RequestMapping(value="/levelmanage", method= RequestMethod.GET)
    public String gotolevelmanage( Model model) {
        return "admin_level_manage";
    }

    //http://localhost:8080/admin/banlist
    @RequestMapping(value="/banlist", method= RequestMethod.GET)
    public String gotobanlist( Model model) {
        return "admin_ban_list";
    }

    //http://localhost:8080/admin/notificationmanage
    @RequestMapping(value="/notificationmanage", method= RequestMethod.GET)
    public String gotonotificationmanage( Model model) {
        return "admin_notification_manage";
    }

    //http://localhost:8080/admin/notificationmanage
    @RequestMapping(value="/addNotification", method= RequestMethod.GET)
    public String gotoaddNotification( Model model) {
        return "admin_notification_add";
    }

    //http://localhost:8080/admin/notificationView
    @RequestMapping(value="/notificationView", method= RequestMethod.GET)
    public String gotonotificationView( Model model) {
        return "admin_notification_detail";
    }

    @RequestMapping(value="/deletenotification", method= RequestMethod.POST,produces = "application/json; charset=utf-8")
    public
    @ResponseBody
    String Deletenotification(HttpServletRequest request){
        String tradeId = request.getParameter("id");
        //if(adminServiceImpl.deletenotification(tradeId))
        if(true)
        {
            ArrayList<String> dataList=new ArrayList<String>();
            String jsonData = JSON.toJSONString(dataList);
            return jsonData;
        }
        return "error";
    }

    @RequestMapping(value="/notificationBack", method= RequestMethod.POST,produces = "application/json; charset=utf-8")
    public
    @ResponseBody
    String NotificationBack(HttpServletRequest request){
        ArrayList<ArrayList<String>> detailsList = new ArrayList<>();
        //detailsList=clerkServiceImpl.SelectClaimList();
        for(int i=0;i<3;i++)
        {
            ArrayList<String> strList = new ArrayList<>();
            strList.add("这是一则通知"+String.valueOf(i));
            detailsList.add(strList);
        }
        String jsonData= JSON.toJSONString(detailsList);
        return jsonData;
    }
    @RequestMapping(value="/addnews", method= RequestMethod.POST)
    public
    @ResponseBody
    String addnews(HttpServletRequest request){
        if(true)
        {
            ArrayList<String> dataList=new ArrayList<String>();
            String jsonData = JSON.toJSONString(dataList);
            return jsonData;
        }
        return "error";
    }
    @RequestMapping(value="/newsview", method= RequestMethod.POST)
    public
    @ResponseBody
    String Newsview(HttpServletRequest request){
        ArrayList<ArrayList<String>> detailsList = new ArrayList<>();
        //detailsList=clerkServiceImpl.SelectClaimList();
        for(int i=0;i<2;i++)
        {
            ArrayList<String> strList = new ArrayList<>();
            strList.add("请查看相关通知"+String.valueOf(i));
            detailsList.add(strList);
        }
        String jsonData= JSON.toJSONString(detailsList);
        return jsonData;
    }

    //http://localhost:8080/admin/addclerk
    @RequestMapping(value="/addclerk", method= RequestMethod.GET)
    public String gotoaddclerk( Model model) {
        return "admin_level_add";
    }

    @RequestMapping(value="/deleteclerk", method= RequestMethod.POST)
    public
    @ResponseBody
    String Deleteclerk(HttpServletRequest request){
        String tradeId = request.getParameter("id");
        //if(adminServiceImpl.deletenotification(tradeId))
        if(true)
        {
            ArrayList<String> dataList=new ArrayList<String>();
            String jsonData = JSON.toJSONString(dataList);
            return jsonData;
        }
        return "error";
    }

    @RequestMapping(value="/levelBack", method= RequestMethod.POST)
    public
    @ResponseBody
    String LevelBackBack(HttpServletRequest request){
        ArrayList<ArrayList<String>> detailsList = new ArrayList<>();
        //detailsList=clerkServiceImpl.SelectClaimList();
        for(int i=0;i<3;i++)
        {
            ArrayList<String> strList = new ArrayList<>();
            strList.add("业务员"+String.valueOf(i));
            detailsList.add(strList);
        }
        String jsonData= JSON.toJSONString(detailsList);
        return jsonData;
    }

    @RequestMapping(value="/newclerk", method= RequestMethod.POST)
    public
    @ResponseBody
    String Newclerk(HttpServletRequest request){
        String tradeId = request.getParameter("id");
        //if(adminServiceImpl.deletenotification(tradeId))
        if(true)
        {
            ArrayList<String> dataList=new ArrayList<String>();
            String jsonData = JSON.toJSONString(dataList);
            return jsonData;
        }
        return "error";
    }
    @RequestMapping(value="/banBack", method= RequestMethod.POST)
    public
    @ResponseBody
    String BanBack(HttpServletRequest request){
        ArrayList<ArrayList<String>> detailsList = new ArrayList<>();
        //detailsList=clerkServiceImpl.SelectClaimList();
        for(int i=0;i<3;i++)
        {
            ArrayList<String> strList = new ArrayList<>();
            strList.add(String.valueOf(i+12));
            strList.add(String.valueOf(i+4));
            strList.add(String.valueOf(i+1));
            strList.add(String.valueOf(i+1120142094));
            detailsList.add(strList);
        }
        String jsonData= JSON.toJSONString(detailsList);
        return jsonData;
    }
    @RequestMapping(value="/banuser", method= RequestMethod.POST)
    public
    @ResponseBody
    String banuser(HttpServletRequest request){
        String tradeId = request.getParameter("id");
        //if(adminServiceImpl.deletenotification(tradeId))
        if(true)
        {
            ArrayList<String> dataList=new ArrayList<String>();
            String jsonData = JSON.toJSONString(dataList);
            return jsonData;
        }
        return "error";
    }
}
