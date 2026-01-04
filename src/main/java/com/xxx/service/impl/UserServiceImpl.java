package com.xxx.service.impl;

import com.xxx.mapper.UserMapper;
import com.xxx.pojo.User;
import com.xxx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired(required=true)
    private UserMapper userMapper;

    public boolean add(User user){
        return userMapper.insert(user);
    }
}
