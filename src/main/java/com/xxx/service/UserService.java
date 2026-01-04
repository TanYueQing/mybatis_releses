package com.xxx.service;

import com.xxx.pojo.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


public interface UserService {
    boolean add(User user);
}
