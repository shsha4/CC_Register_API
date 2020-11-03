package com.mat.service;

import com.mat.model.UserVO;

public interface RegService {
    int insertUser(UserVO user);
    int updateUser(UserVO user);
    int deleteUser(String user_id);
}
