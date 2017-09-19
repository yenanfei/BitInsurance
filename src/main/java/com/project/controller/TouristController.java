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
import java.util.List;

@Controller
@SessionAttributes("username")
@RequestMapping("/tourist")
public class TouristController {
    private TouristServiceImpl touristServiceImpl;

    @Autowired
    public void setTouristServiceImpl(@Qualifier("TouristServiceImpl") TouristServiceImpl touristServiceImpl) {
        this.touristServiceImpl = touristServiceImpl;
    }

    //http://localhost:8080/tourist/notificationView
    @RequestMapping(value="/notification", method= RequestMethod.GET)
    public String gotonotification( Model model) {
        return "tourist_notification_view";
    }

    @RequestMapping(value="/alltrade", method= RequestMethod.POST, produces = "application/json; charset=utf-8")
    public
    @ResponseBody
    String alltrade(HttpServletRequest request)
    {
        String insurance=request.getParameter("id");
        String starttime=request.getParameter("starttime");
        ArrayList<ArrayList<String>> detailsList = touristServiceImpl.selectalltrade();
        String jsonData =JSON.toJSONString(detailsList);
        return jsonData;
    }

    @RequestMapping(value="/selecttrade", method= RequestMethod.POST, produces = "application/json; charset=utf-8")
    public
    @ResponseBody
    String selecttrade(HttpServletRequest request)
    {
        String username=request.getParameter("username");
        String tradeid=request.getParameter("tradeid");
        ArrayList<ArrayList<String>> detailsList = touristServiceImpl.SelectTrade(tradeid);
        String jsonData =JSON.toJSONString(detailsList);
        return jsonData;
    }

    @RequestMapping(value="/selectnotification", method= RequestMethod.POST, produces = "application/json; charset=utf-8")
    public
    @ResponseBody
    String selectnotification(HttpServletRequest request)
    {
        String newsid=request.getParameter("id");
        ArrayList<String> detailsList = touristServiceImpl.SelectNotifiction(newsid);
        String jsonData =JSON.toJSONString(detailsList);
        return jsonData;
    }
}
