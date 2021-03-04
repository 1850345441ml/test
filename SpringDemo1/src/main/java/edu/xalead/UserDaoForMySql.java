package edu.xalead;

import org.springframework.stereotype.Component;

import java.util.Date;
@Component("userDao1")
public class UserDaoForMySql implements UserDao {
    public User findUser(){
        User u = new User(1000,"张三",22,"男",new Date(),null,null,null,null);
        return u;
    }
}
