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
import sun.misc.BASE64Encoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
@Controller
@SessionAttributes("username")
@RequestMapping("/login")

public class LoginController {

    public static String getMd5(String plainText) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(plainText.getBytes());
            byte b[] = md.digest();

            int i;

            StringBuffer buf = new StringBuffer("");
            for (int offset = 0; offset < b.length; offset++) {
                i = b[offset];
                if (i < 0)
                    i += 256;
                if (i < 16)
                    buf.append("0");
                buf.append(Integer.toHexString(i));
            }
            //32位加密
            return buf.toString();
            // 16位的加密
            //return buf.toString().substring(8, 24);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
    private LoginServiceImpl loginServiceImpl;

    @Autowired
    public void setLoginServiceImpl(@Qualifier("loginServiceImpl") LoginServiceImpl loginServiceImpl) {
        this.loginServiceImpl = loginServiceImpl;
    }
    //http://localhost:8080/login/in
    @RequestMapping(value="/in", method= RequestMethod.GET)
    public String gotoLogin( Model model) {
        return "login";
    }

    //http://localhost:8080/login/resign
    @RequestMapping(value="/resign", method= RequestMethod.GET)
    public String gotoResign( Model model) {
        return "resign";
    }

    @RequestMapping(value="/jump", method= RequestMethod.POST)
    public
    @ResponseBody
    String alltrade(HttpServletRequest request)
    {
        String insurance=request.getParameter("id");
        String starttime=request.getParameter("starttime");
        ArrayList<ArrayList<String>> detailsList = new ArrayList<>();
        String jsonData =JSON.toJSONString(detailsList);
        return jsonData;
    }
    @RequestMapping(value="/check", method= RequestMethod.POST)
    public String Login(HttpServletRequest request) {//1管理员 2注册用户  3业务员
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String md5password=getMd5(password);
        if(username=="")
        {
            return "login_error2";
        }
        if(password=="")
        {
            return "login_error3";
        }
        int type;
        type = loginServiceImpl.Login(username, md5password);
        if (type == 1) {
            HttpSession session=request.getSession();
            session.setAttribute("user",username);
            return "admin_main";
        } else if (type == 2) {
            HttpSession session=request.getSession();
            session.setAttribute("user",username);
            return "user_main";
        } else if (type == 3) {
            HttpSession session=request.getSession();
            session.setAttribute("user",username);
            return "clerk_main";
        }
        else {
            return "login_error";
        }
    }

    @RequestMapping(value="/resignFill", method= RequestMethod.POST)
    public
    @ResponseBody
    String Resign(HttpServletRequest request)
    {
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        String borth=request.getParameter("borth");
        String age=request.getParameter("age");
        String mail=request.getParameter("mail");
        String sex=request.getParameter("sex");
        String phone=request.getParameter("phone");
        String IDcard=request.getParameter("IDcard");
        String marry=request.getParameter("marry");
        String illness=request.getParameter("illness");
        String job=request.getParameter("job");
        String address=request.getParameter("address");
        String realname=request.getParameter("realname");
        String time=request.getParameter("mytime");
        String md5password=getMd5(password);
        loginServiceImpl.Resgiter(username,md5password,borth,age,mail,sex,phone,IDcard,marry,illness,job,address,realname,time);
        String jsonData= JSON.toJSONString("success");
        return jsonData;
    }

    static User curuserlog;
}
