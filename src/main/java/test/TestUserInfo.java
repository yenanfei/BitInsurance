package test;

import com.project.dao.daoop.UserInfoDaoImpl;
import com.project.model.UserInfo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.junit.Test;

import java.io.IOException;
import java.sql.Date;
import java.util.List;
/**
 * Created by kangxu on 2017/9/11.
 */
public class TestUserInfo extends BaseTest{
    @Test
    public void testupdateUserDAO() throws IOException {
        UserInfoDaoImpl userInfoDaoImpl = (UserInfoDaoImpl) ctx.getBean("userInfoDAOImpl");
        UserInfo userInfo = new UserInfo();
        userInfo.setAll("123","111","1","1","1111","1111","111","11","11",0);
        userInfoDaoImpl.UpdateUserInfobyusername(userInfo);
        UserInfo user = userInfoDaoImpl.FindUserInfobyusername("111");
        System.out.println(user.toString());
    }
}
