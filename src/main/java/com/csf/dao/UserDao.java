package com.csf.dao;

import com.csf.pojo.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface UserDao {
    String queryById(String id);

    List<User> getAll();
}