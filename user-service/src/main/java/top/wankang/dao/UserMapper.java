package top.wankang.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import top.wankang.entity.UserInfo;

/**
 * @author wankang
 * @version 1.0
 * @date 2020/5/28 9:48
 */
@Repository
public interface UserMapper {
    UserInfo getUserInfoByName(@Param("username") String username);
}
