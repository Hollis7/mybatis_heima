package com.hdb.boot3mybatis.mapper;

import com.hdb.boot3mybatis.bean.TUser;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    TUser getUserById(@Param("id") Long id);
}
