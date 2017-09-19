package com.project.dao.daoop;


import com.project.dao.daointerface.UserDAO;
import com.project.db.ConnectDB;
import com.project.model.User;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.io.IOException;


@Component("userDAOImpl")
public class UserDAOImpl implements UserDAO {
    private SqlSession sqlSession = null;
    private ConnectDB connect;

    @Autowired
    private void setDBAccess(@Qualifier("connectDB") ConnectDB connectDB) {
        connect = connectDB;
    }

    private UserDAO userDAO = null;

    private void setSession() {
        try {
            sqlSession = connect.getSqlSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
        userDAO = sqlSession.getMapper(UserDAO.class);
    }
    @Override
    public void InsertUser(User user) {
        if(sqlSession==null)
        {
            setSession();
        }
        userDAO.InsertUser(user);
        sqlSession.commit();
    }

    //back level int level=-1,1,2,3
    @Override
    public int findUser(String name, String password) {

        if(sqlSession==null)
       {
           setSession();
       }
       int level=userDAO.findUser(name,password);
        return level;
    }
}