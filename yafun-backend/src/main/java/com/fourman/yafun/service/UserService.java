package com.fourman.yafun.service;

import com.fourman.yafun.entity.User;

import java.util.List;

/**
 * Created by fisbii on 18-8-18.
 */
public interface UserService {

    int addUser(User user);

    List<User> findAllUser(int pageNum, int pageSize);
}
