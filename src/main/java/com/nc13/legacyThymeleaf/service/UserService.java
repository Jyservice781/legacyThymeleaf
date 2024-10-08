package com.nc13.legacyThymeleaf.service;

import com.nc13.legacyThymeleaf.model.UserDTO;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final SqlSession SESSION;
    private final String NAMESPACE = "mappers.UserMapper";

    public UserDTO selectOne(String username) {
        return SESSION.selectOne(NAMESPACE + ".selectOne", username);
    }

    public void insert(UserDTO userDTO){
        SESSION.insert(NAMESPACE + ".register", userDTO);
    }
}
