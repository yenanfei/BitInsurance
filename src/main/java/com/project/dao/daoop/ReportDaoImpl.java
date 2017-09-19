package com.project.dao.daoop;

import com.project.dao.daointerface.ReportDao;
import com.project.db.ConnectDB;
import com.project.model.Report;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

/**
 * Created by ZZDELY on 2017/9/3.
 */
@Component("reportDAOIpl")
public class ReportDaoImpl implements ReportDao {
    private SqlSession sqlSession = null;
    private ConnectDB connect;

    @Autowired
    private void setDBAccess(@Qualifier("connectDB") ConnectDB connectDB) {
        connect = connectDB;
    }

    private ReportDao reportDAO = null;

    private void setSession() {
        try {
            sqlSession = connect.getSqlSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
        reportDAO = sqlSession.getMapper(ReportDao.class);
    }
   // void InsertReportbyreportid(@Param("reportid") int reportid, @Param("text") String text);
  //  void FindReportbyto(int to);
  //  List<Report> FindReport();
  //  void FindReportbyreportid(int reportid);
    @Override
    public void InsertReportbyreportid(Report report)
    {
        if(sqlSession == null)
        {
            setSession();
        }
        reportDAO.InsertReportbyreportid(report);
        sqlSession.commit();
    }
    @Override
    public List<Report> FindReportbyto(String from)
    {
        if(sqlSession == null)
        {
            setSession();
        }
        List<Report>reportList=null;
        reportList=reportDAO.FindReportbyto(from);
        return reportList;

    }
    @Override
    public Report FindReportbyreportid(int reportid)
    {
        if(sqlSession == null)
        {
            setSession();
        }
        Report report=reportDAO.FindReportbyreportid(reportid);
        return report;
    }

    @Override
    public void UpdateReportbyreportid(int reportid)
    {
        if(sqlSession == null)
        {
            setSession();
        }
        reportDAO.UpdateReportbyreportid(reportid);
        sqlSession.commit();
    }


    @Override
    public  List<Report> FindReport()
    {
        if(sqlSession == null)
        {
            setSession();
        }
        List<Report>reportList=null;
        reportList=reportDAO.FindReport();
        return reportList;
    }

}
