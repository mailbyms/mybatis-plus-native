package com.gyjian.test.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gyjian.test.entity.User;
import com.gyjian.test.mapper.UserMapper;
import org.springframework.stereotype.Service;

@Service
public class UserService extends ServiceImpl<UserMapper, User> {
}
