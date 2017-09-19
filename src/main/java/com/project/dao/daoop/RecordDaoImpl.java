package com.project.dao.daoop;

import com.project.dao.daointerface.RecordDao;
import com.project.db.ConnectDB;
import com.project.model.Record;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

/**
 * Created by ZZDELY on 2017/9/3.
 */
@Component("recordDAOImpl")
public class RecordDaoImpl implements RecordDao{
    private SqlSession sqlSession = null;
    private ConnectDB connect;

    @Autowired
    private void setDBAccess(@Qualifier("connectDB") ConnectDB connectDB) {
        connect = connectDB;
    }

    private RecordDao recordDAO = null;

    private void setSession() {
        try {
            sqlSession = connect.getSqlSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
        recordDAO = sqlSession.getMapper(RecordDao.class);
    }

//    Record InsertRecord(Record record);
//    List<Record>FindRecord();
//    List<Record> FindRecordbyUserid(int Userid);


    @Override
    public void InsertRecord(Record record)
    {
        if(sqlSession==null)
        {
            setSession();
        }
        recordDAO.InsertRecord(record);
        sqlSession.commit();
    }
    @Override
    public List<Record> FindRecord()
    {
        if(sqlSession==null)
        {
            setSession();
        }
        List<Record>recordList=null;
        recordList=recordDAO.FindRecord();
        return recordList;
    }
    @Override
    public List<Record> FindRecordbyUserid(String from)
    {
        if(sqlSession == null)
        {
            setSession();
        }
        List<Record>recordList=recordDAO.FindRecordbyUserid(from);
        return recordList;
    }
    @Override
    public Record FindRecordfortop()
    {
        if(sqlSession == null)
        {
            setSession();
        }
        Record record=recordDAO.FindRecordfortop();
        return record;
    }
}
