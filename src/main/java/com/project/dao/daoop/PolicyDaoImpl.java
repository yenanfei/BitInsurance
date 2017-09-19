package com.project.dao.daoop;

import com.project.dao.daointerface.PolicyDao;
import com.project.db.ConnectDB;
import com.project.model.Policy;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

/**
 * Created by ZZDELY on 2017/9/3.
 */
@Component("policyDAOImpl")
public class PolicyDaoImpl implements PolicyDao{
    private SqlSession sqlSession = null;
    private ConnectDB connect;

    @Autowired
    private void setDBAccess(@Qualifier("connectDB") ConnectDB connectDB) {
        connect = connectDB;
    }

    private PolicyDao policyDAO = null;

    private void setSession() {
        try {
            sqlSession = connect.getSqlSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
        policyDAO = sqlSession.getMapper(PolicyDao.class);
    }
    //void InsertPolicy(Policy policy);
    //Policy FindPolicy();
    @Override
    public void InsertPolicy(Policy policy)
    {
        if(sqlSession==null)
        {
            setSession();
        }
        policyDAO.InsertPolicy(policy);
        sqlSession.commit();
    }
    @Override
    public List<Policy> FindPolicy(String name)
    {
        if(sqlSession==null)
        {
            setSession();
        }
        List<Policy> policy=policyDAO.FindPolicy(name);
        return policy;
    }
    @Override
    public Policy FindPolicybypolicyid(int Policyid)
    {
        if(sqlSession==null)
        {
            setSession();
        }
        Policy policy=policyDAO.FindPolicybypolicyid(Policyid);
        return policy;
    }
}
