package edu.xalead;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class UserServlet {
//    @Qualifier("userDao2")
//    @Autowired
    @Resource(name = "userDao1")
    private UserDao userDao;
    public void findUser(){
        System.out.println("spring工厂实例");
        System.out.println(userDao.findUser());
    }
}
