package com.project.dao.daoop;

import com.project.dao.daointerface.ClaimDao;
import com.project.db.ConnectDB;
import com.project.model.Claim;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

/**
 * Created by Nanfei on 2017/9/6.
 */
@Component("ClaimDaoImpl")
public class ClaimDaoImpl implements ClaimDao {
    private SqlSession sqlSession = null;
    private ConnectDB connect;

    @Autowired
    private void setDBAccess(@Qualifier("connectDB") ConnectDB connectDB) {
        connect = connectDB;
    }
    private ClaimDao claimDao = null;
    private void setSession() {
        try {
            sqlSession = connect.getSqlSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
        claimDao = sqlSession.getMapper(ClaimDao.class);
    }
    @Override
    public void InsertClaim(Claim user) {
        if(sqlSession==null)
        {
            setSession();
        }
        claimDao.InsertClaim(user);
        sqlSession.commit();
    }

    @Override
    public List<Claim> findClaim() {
        if(sqlSession==null)
        {
            setSession();
        }
        List<Claim> claim=null;
        claim=claimDao.findClaim();
        return claim;
    }

    @Override
    public Claim findClaimByClaimid(int Claimid) {
        if(sqlSession==null)
        {
            setSession();
        }
        Claim claim=null;
        claim=claimDao.findClaimByClaimid(Claimid);
        return claim;
    }

    @Override
    public List<Claim> findClaimByPolicyId(int PolicyId) {
        if(sqlSession==null)
        {
            setSession();
        }
        List<Claim> claim=null;
        claim=claimDao.findClaimByPolicyId(PolicyId);
        return claim;
    }

    @Override
    public void UpdateClaimbyClaimId(Claim claim) {
        if(sqlSession==null)
        {
            setSession();
        }
        claimDao.UpdateClaimbyClaimId(claim);
        sqlSession.commit();
    }

    @Override
    public void DeleteClaimById(Claim claim) {
        if(sqlSession==null)
        {
            setSession();
        }
        claimDao.DeleteClaimById(claim);
        sqlSession.commit();
    }
}
