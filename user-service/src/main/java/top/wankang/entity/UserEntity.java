package top.wankang.entity;

import lombok.Data;
import org.springframework.stereotype.Service;

@Data
public class UserEntity {
    private int id;
    private String username;
    private String password;
}
