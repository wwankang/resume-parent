package top.wankang.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.wankang.dao.UserMapper;
import top.wankang.entity.UserEntity;
import top.wankang.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public UserEntity loadUsername(String username) {
//        return new UserEntity();
        return userMapper.loadByUsername(username);
    }
}
