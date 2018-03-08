package com.csf.service;

import com.csf.pojo.User;

import java.util.ArrayList;
import java.util.List;

public interface UserService {
    String getUserName(String id);
    List<User> getUserAll();
}