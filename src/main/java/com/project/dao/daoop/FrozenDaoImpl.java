package com.project.dao.daoop;

import com.project.dao.daointerface.FrozenDao;
import com.project.db.ConnectDB;
import com.project.model.Frozen;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

/**
 * Created by ZZDELY on 2017/9/3.
 */
@Component("FrozenDaoImpl")
public class FrozenDaoImpl implements FrozenDao {
    private SqlSession sqlSession = null;
    private ConnectDB connect;

    @Autowired
    private void setDBAccess(@Qualifier("connectDB") ConnectDB connectDB) {
        connect = connectDB;
    }
    private FrozenDao frozenDao = null;
    private void setSession() {
        try {
            sqlSession = connect.getSqlSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
        frozenDao = sqlSession.getMapper(FrozenDao.class);
    }

    @Override
    public void DeleteFrozen(int frozenid) {
        if(sqlSession==null)
        {
            setSession();
        }
        frozenDao.DeleteFrozen(frozenid);
        sqlSession.commit();
    }

    @Override
    public List<Frozen> findFrozen() {
        if(sqlSession==null)
        {
            setSession();
        }
        List<Frozen> frozenlist = null;
        frozenlist= frozenDao.findFrozen();
        return frozenlist;
    }

    @Override
    public List<Frozen> findFrozenByTo(int to) {
        if(sqlSession==null)
        {
            setSession();
        }
        List<Frozen> frozenlist = null;
        frozenlist= frozenDao.findFrozenByTo(to);
        return frozenlist;
    }

    @Override
    public void InsertFrozen(Frozen frozen) {
        if(sqlSession==null)
        {
            setSession();
        }
        frozenDao.InsertFrozen(frozen);
        sqlSession.commit();
    }
}
