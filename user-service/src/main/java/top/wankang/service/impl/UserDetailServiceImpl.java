package top.wankang.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import top.wankang.entity.UserEntity;
import top.wankang.service.UserService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wankang
 * @version 1.0
 * @date 2020/5/27 9:32
 */
@Service
@Slf4j
public class UserDetailServiceImpl implements UserDetailsService {


    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private UserService userService;

    //    @Resource
//    private UserRoleMapper userRoleMapper ;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       /* // 这里可以捕获异常，使用异常映射，抛出指定的提示信息
        // 用户校验的操作
        // 假设密码是数据库查询的 123
        String password = "$2a$10$XcigeMfToGQ2bqRToFtUi.sG1V.HhrJV6RBjji1yncXReSNNIPl1K";
        // 假设角色是数据库查询的
        List<String> roleList = userRoleMapper.selectByUserName(username) ;
        List<GrantedAuthority> grantedAuthorityList = new ArrayList<>() ;
        *//*
         * Spring Boot 2.0 版本踩坑
         * 必须要 ROLE_ 前缀， 因为 hasRole("LEVEL1")判断时会自动加上ROLE_前缀变成 ROLE_LEVEL1 ,
         * 如果不加前缀一般就会出现403错误
         * 在给用户赋权限时,数据库存储必须是完整的权限标识ROLE_LEVEL1
         *//*
        if (roleList != null && roleList.size()>0){
            for (String role : roleList){
                grantedAuthorityList.add(new SimpleGrantedAuthority(role)) ;
            }
        }
        return new User(username,password,grantedAuthorityList);*/
        UserEntity userEntity = userService.loadUsername(username);
        if (userEntity == null) {
            throw new UsernameNotFoundException("账号不存在");
        }
        String password = passwordEncoder.encode(userEntity.getPassword());
        log.info("登录账号：{}，密码：{}", username, password);
        return new User(username, password, AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
    }
}
