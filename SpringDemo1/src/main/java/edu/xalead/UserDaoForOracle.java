package edu.xalead;

import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository("userDao2")
public class UserDaoForOracle implements UserDao {
    public User findUser(){
        User u = new User(1000,"李四",22,"男",new Date(),null,null,null,null);
        return u;
    }
}
