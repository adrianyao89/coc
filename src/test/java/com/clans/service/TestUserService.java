package com.clans.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.clans.bean.User;
import com.clans.service.impl.UserServiceImpl;

public class TestUserService {
    public static void main(String[] args) throws Exception {  
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:WEB-INF\\spring\\applicationContext.xml");  
        UserServiceImpl userService = context.getBean("userService",UserServiceImpl.class);  
          
        User user = userService.save();
        System.out.println(user.getId());
        System.out.println(user.getName());
    }  
}
