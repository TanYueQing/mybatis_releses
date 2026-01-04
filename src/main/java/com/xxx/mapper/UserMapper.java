package com.xxx.mapper;

import com.xxx.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    @Insert("insert into user values(#{id},#{username},#{pwd},#{email})")
    boolean insert(User user);
}
