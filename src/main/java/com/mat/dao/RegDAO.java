package com.mat.dao;

import com.mat.model.UserVO;

public interface RegDAO {
    int insertUser(UserVO user);
    int updateUser(UserVO user);
    int deleteUser(String user_id);
}
