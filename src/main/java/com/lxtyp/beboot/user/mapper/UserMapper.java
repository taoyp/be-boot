package com.lxtyp.beboot.user.mapper;

import com.lxtyp.beboot.user.entity.UserVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    public UserVO getUserById();
}
