package com.project.dao.daoop;

import com.project.dao.daointerface.UserInfoDao;
import com.project.db.ConnectDB;
import com.project.model.UserInfo;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

/**
 * Created by ZZDELY on 2017/9/3.
 */
@Component("userInfoDAOImpl")
public class UserInfoDaoImpl implements UserInfoDao {
    private SqlSession sqlSession = null;
    private ConnectDB connect;
    @Autowired
    private void setDBAccess(@Qualifier("connectDB") ConnectDB connectDB) {
        connect = connectDB;
    }

    private UserInfoDao userInfoDAO = null;
    private void setSession() {
        try {
            sqlSession = connect.getSqlSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
        userInfoDAO = sqlSession.getMapper(UserInfoDao.class);
    }
    @Override
    public void  InsertUserInfo(UserInfo userInfo)
    {
        if(sqlSession==null)
        {
            setSession();
        }
        userInfoDAO.InsertUserInfo(userInfo);
        sqlSession.commit();
    }

    @Override
    public void UpdateUserInfobyusername(UserInfo userInfo)
    {
        if(sqlSession==null)
        {
            setSession();
        }
        userInfoDAO.UpdateUserInfobyusername(userInfo);
        sqlSession.commit();
    }

    @Override
    public UserInfo FindUserInfobyusername(String name)
    {
        if(sqlSession==null)
        {
            setSession();
        }
        UserInfo userInfo=userInfoDAO.FindUserInfobyusername(name);
        return userInfo;
    }

    @Override
    public void Awardbyusername(String name,int score)
    {
        if(sqlSession==null)
        {
            setSession();
        }
        userInfoDAO.Awardbyusername(name,score);
        sqlSession.commit();
    }
}
