package com.project.service.impl;
import com.project.dao.daointerface.UserDAO;
import com.project.dao.daoop.UserDAOImpl;
import com.project.dao.daoop.UserInfoDaoImpl;
import com.project.service.LoginService;
import com.project.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Created by ZZDELY on 2017/9/3.
 */
@Service("loginServiceImpl")
public class LoginServiceImpl implements LoginService{
    private UserDAOImpl userDAOImpl;
    private UserInfoDaoImpl userInfoDaoImpl;
    @Autowired
    public void setUserDaoImp1(UserDAOImpl user) {
        this.userDAOImpl=user;
    }
    @Autowired
    public void setUserInfoDaoImp1(UserInfoDaoImpl userInfo) {
        this.userInfoDaoImpl=userInfo;
    }
    @Override
    public int Login(String username, String password) {
        return userDAOImpl.findUser(username,password);
    }
    @Override
    //todo
    //注册，根据传进来的参数修改数据库，字段还有待敲定
    public void Resgiter(String username,String password,String borth,String age,String mail,String sex,String phone,String IDcard,String marry,String illness,String job,String address,String realname,String time)
    {
        try {
            User user = new User();
            UserInfo userinfo = new UserInfo();
            user.setAll(username, password, 2, time, "0");
            userinfo.setAll(realname, username, age, sex, phone, mail, address, illness, IDcard, 0);
            userInfoDaoImpl.InsertUserInfo(userinfo);
            userDAOImpl.InsertUser(user);
        }
        catch(Exception e)
        {
            System.out.print(e);
        }
    }
}
