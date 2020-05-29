package top.wankang.service;


import top.wankang.entity.UserInfo;

/**
 * @author wankang
 * @version 1.0
 * @date 2020/5/28 9:47
 */
public interface UserService {
    UserInfo getUserInfoByName(String username);
}
