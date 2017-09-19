package test;
import com.project.dao.daoop.ReportDaoImpl;
import com.project.model.Report;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.junit.Test;

import java.io.IOException;
import java.sql.Date;
import java.util.List;
/**
 * Created by ZZDELY on 2017/9/11.
 */
public class TestReport extends BaseTest{
    @Test
    public void testupdateUserDAO() throws IOException {
        ReportDaoImpl reportDAOImpl = (ReportDaoImpl) ctx.getBean("reportDAOIpl");
        Report userInfo = new Report();
        userInfo.setAll("111","11","0",0,2,"222");
        reportDAOImpl.InsertReportbyreportid(userInfo);
        Report user=reportDAOImpl.FindReportbyreportid(2);
        System.out.println(user.toString());
    }
}
