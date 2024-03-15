package com.lxtyp.beboot.user.service.impl;

import com.lxtyp.beboot.user.entity.UserVO;
import com.lxtyp.beboot.user.mapper.UserMapper;
import com.lxtyp.beboot.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserVO getUserVoById(String userId) {
        return userMapper.getUserById();
    }
}
