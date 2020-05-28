package top.wankang.service;

import top.wankang.entity.UserEntity;

/**
 * @author wankang
 * @version 1.0
 * @date 2020/5/28 9:47
 */
public interface UserService {
    UserEntity loadUsername(String username);
}
