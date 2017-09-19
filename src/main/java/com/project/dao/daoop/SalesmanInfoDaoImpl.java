package com.project.dao.daoop;

/**
 * Created by ZZDELY on 2017/9/3.
 */
import com.project.dao.daointerface.SalesmanDao;
import com.project.db.ConnectDB;
import com.project.model.SalesmanInfo;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component("salesmanInfoDaoImpl")
public class SalesmanInfoDaoImpl implements SalesmanDao {
    private SqlSession sqlSession = null;
    private ConnectDB connect;

    @Autowired
    private void setDBAccess(@Qualifier("connectDB") ConnectDB connectDB) {
        connect = connectDB;
    }

    private SalesmanDao salesmanDao = null;

    private void setSession() {
        try {
            sqlSession = connect.getSqlSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
        salesmanDao = sqlSession.getMapper(SalesmanDao.class);
    }
    @Override
    public void InsertSalesmaninfobyname(SalesmanInfo salesmanInfo)
    {
        if(sqlSession == null)
        {
            setSession();
        }
        salesmanDao.InsertSalesmaninfobyname(salesmanInfo);
        sqlSession.commit();
    }

    @Override
    public void DeleteSalesmaninfobyname(String name)
    {
        if(sqlSession == null)
        {
            setSession();
        }
        salesmanDao.DeleteSalesmaninfobyname(name);
        sqlSession.commit();
    }

    @Override
    public List<SalesmanInfo> FindSalesmaninfo()
    {
        if(sqlSession == null)
        {
            setSession();
        }
        List<SalesmanInfo>salesmanInfoList=null;
        salesmanInfoList=salesmanDao.FindSalesmaninfo();
        return salesmanInfoList;
    }
}
