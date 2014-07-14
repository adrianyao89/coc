package com.clans.dao;

import org.springframework.data.repository.Repository;

import com.clans.bean.User;

public interface UserDao extends Repository<User, Integer> {
    public User save(User user);
    

}
