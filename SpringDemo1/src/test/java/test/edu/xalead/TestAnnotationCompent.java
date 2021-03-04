package test.edu.xalead;

import edu.MyConfig;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import edu.xalead.User;
import edu.xalead.UserDao;
import edu.xalead.UserServlet;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class TestAnnotationCompent {

    @Test
    public void test1(){
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("beanFactory.xml");
        User user = (User)beanFactory.getBean("user");
//        User user = beanFactory.getBean(User.class);

        System.out.println(user);

    }

    @Test
    public void test2(){
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("beanFactory.xml");
        User u = beanFactory.getBean(User.class);
        Object user1 = beanFactory.getBean("user1");
//        User user = beanFactory.getBean(User.class);

        System.out.println(u == user1);
        System.out.println(user1);
    }

    @Test
    public void test3(){
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("beanFactory.xml");
        UserServlet userServlet = beanFactory.getBean(UserServlet.class);
        System.out.println(userServlet);
        userServlet.findUser();
    }

    @Test
    public void test4(){
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("beanFactory.xml");
        UserDao userDao1 = (UserDao) beanFactory.getBean("userDao1");
        UserDao userDao2 = (UserDao) beanFactory.getBean("userDao2");
        System.out.println(userDao1.findUser());
        System.out.println(userDao2.findUser());
    }

    @Test
    public void test5(){
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("beanFactory.xml");
        DataSource dataSource = beanFactory.getBean(DataSource.class);
        Connection connection = null;
        try {
           connection = dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
        }
    }

    @Test
    public void test6(){
        BeanFactory beanFactory = new AnnotationConfigApplicationContext(MyConfig.class);
        User bean = beanFactory.getBean(User.class);
        System.out.println(bean);
    }

    @Test
    public void test7(){
        BeanFactory beanFactory = new AnnotationConfigApplicationContext(MyConfig.class);
//        DataSource dataSource = beanFactory.getBean(DataSource.class);
        DataSource dataSource = (DataSource)beanFactory.getBean("dataSource");
        Connection connection = null;
        try {
            connection = dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
        }
    }
}
