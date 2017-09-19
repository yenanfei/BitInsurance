package com.project.dao.daoop;

import com.project.dao.daointerface.InsuranceInfoDao;
import com.project.db.ConnectDB;
import com.project.model.Insurance;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

/**
 * Created by ZZDELY on 2017/9/3.
 */
@Component("insuranceInfoDAOImpl")
public class InsuranceInfoDaoImpl implements InsuranceInfoDao {
    private SqlSession sqlSession = null;
    private ConnectDB connect;

    @Autowired
    private void setDBAccess(@Qualifier("connectDB") ConnectDB connectDB) {
        connect = connectDB;
    }

    private  InsuranceInfoDao insuranceInfoDAO = null;

    private void setSession() {
        try {
            sqlSession = connect.getSqlSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
        insuranceInfoDAO = sqlSession.getMapper(InsuranceInfoDao.class);
    }

    //void InsertInsurance(Insurance insurance);
    //List<Insurance> FindInsurance();
    //void DeleteInsurancebyid(int id);
    //void FindInsurancebyid(int id);
    @Override
    public void InsertInsurance(Insurance insurance)
    {
        if(sqlSession==null) {
            setSession();
        }
        insuranceInfoDAO.InsertInsurance(insurance);
        sqlSession.commit();
    }
    @Override
    public List<Insurance> FindInsurance()
    {
        if(sqlSession==null)
        {
            setSession();
        }
        List<Insurance>insuranceList=null;
        insuranceList=insuranceInfoDAO.FindInsurance();
        return insuranceList;
    }
    @Override
    public void DeleteInsurancebyproductid(int productid)
    {
        if(sqlSession==null)
        {
            setSession();
        }
        insuranceInfoDAO.DeleteInsurancebyproductid(productid);
        sqlSession.commit();
    }
    @Override
    public Insurance FindInsurancebyproductid(int productid)
    {
        if(sqlSession==null)
        {
            setSession();
        }
        Insurance insurance=insuranceInfoDAO.FindInsurancebyproductid(productid);
        return insurance;
    }

}
