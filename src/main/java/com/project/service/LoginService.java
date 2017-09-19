package com.project.service;

import com.project.dao.daointerface.UserDAO;
import com.project.dao.daoop.UserDAOImpl;
import com.project.model.User;

import java.util.ArrayList;

/**
 * Created by ZZDELY on 2017/9/3.
 */

public interface LoginService {
    public void Resgiter(String username,String password,String borth,String age,String mail,String sex,String phone,String IDcard,String marry,String illness,String job,String address,String realname,String time);
    public int Login(String username,String password);
    public void setUserDaoImp1(UserDAOImpl user);
}
