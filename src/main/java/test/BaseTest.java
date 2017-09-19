package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by HCHJ on 2017/5/11.
 */

public class BaseTest {
    public ApplicationContext ctx = new ClassPathXmlApplicationContext("file:E:\\wwww\\BitInsurance\\src\\main\\webapp\\WEB-INF\\applicationContext.xml");
}
