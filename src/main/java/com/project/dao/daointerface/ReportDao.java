package com.project.dao.daointerface;

import com.project.model.Report;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by ZZDELY on 2017/9/3.
 */
public interface ReportDao {
    void InsertReportbyreportid(Report report);//插入举报表
   List<Report> FindReportbyto(String from);
    List<Report> FindReport();//所有举报
    Report FindReportbyreportid(int reportid);//返回：举报ID的举报信息
    void UpdateReportbyreportid(int reportid);//举报ID 更改状
}
