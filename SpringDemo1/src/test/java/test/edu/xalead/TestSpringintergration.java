package test.edu.xalead;


import edu.MyConfig;
import edu.xalead.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = MyConfig.class)
@ContextConfiguration("classpath:beanFactory.xml")
public class TestSpringintergration {

    @Autowired
    private User user;
    @Autowired
    private DataSource dataSource;

    @Test
    public void test1(){
        System.out.println(user);
    }
}
