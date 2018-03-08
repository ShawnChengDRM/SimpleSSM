package com.csf.service.impl;

import com.csf.dao.UserDao;
import com.csf.pojo.User;
import com.csf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("UserService")
public class UserServiceImpl implements UserService{

    @Autowired
    UserDao userDao;

    public String getUserName(String id) {
        return userDao.queryById(id);
    }

    public List<User> getUserAll() {
        return userDao.getAll();
    }
}
