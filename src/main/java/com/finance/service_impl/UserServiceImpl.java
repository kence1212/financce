package com.finance.service_impl;

import com.finance.dao.AssetsMapper;
import com.finance.dao.UserMapper;
import com.finance.entity.Assets;
import com.finance.entity.User;
import com.finance.service.AssetsService;
import com.finance.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UserService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserBycode(String userCode) {
        return userMapper.selectByUsername(userCode);
    }
}
