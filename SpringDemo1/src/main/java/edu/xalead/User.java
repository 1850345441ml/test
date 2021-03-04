package edu.xalead;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component("user")
@Scope("prototype")
public class User {
    @Value("1806")
    private int id;
    @Value("zhangsan")
    private String name;
    @Value("22")
    private int age;
    @Value("男")
    private String sex;
    private Date birthday;
    private String[] photos;
    private List list;
    private Set set;
    private Map<String,String> map;

    @PostConstruct
    public void init(){
        System.out.println("初始化");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("销毁");
    }
}