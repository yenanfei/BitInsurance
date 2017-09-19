package test;
import com.project.dao.daoop.ClaimDaoImpl;
import com.project.model.Claim;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.junit.Test;

import java.io.IOException;
import java.sql.Date;
import java.util.List;
/**
 * Created by ZZDELY on 2017/9/13.
 */
public class TestClaim extends BaseTest{
    @Test
    public void testupdateUserDAO() throws IOException {
        ClaimDaoImpl claimDao = (ClaimDaoImpl) ctx.getBean("ClaimDaoImpl");
        Claim userInfo = new Claim();
        userInfo.setAll(1,"11","","");
        claimDao.InsertClaim(userInfo);
        Claim user=claimDao.findClaimByClaimid(1);
        System.out.println(user.toString());
    }
}
