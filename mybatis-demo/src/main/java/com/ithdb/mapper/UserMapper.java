package com.ithdb.mapper;

import com.ithdb.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> selectAll();

    User selectById(int id);
}
