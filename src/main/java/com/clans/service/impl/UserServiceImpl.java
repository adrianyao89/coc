package com.clans.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clans.bean.User;
import com.clans.dao.UserDao;
import com.clans.service.UserService;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    
    public User save() {
        User user = new User();
        user.setName("francis");
        return userDao.save(user);
    }
}
