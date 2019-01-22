package com.yafun.service;

import com.yafun.entity.User;

import java.util.List;

/**
 * Created by fisbii on 18-8-18.
 */
public interface UserService {

    int addUser(User user);

    List<User> findAllUser(int pageNum, int pageSize);
}
