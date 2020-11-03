package com.mat.service;

import com.mat.dao.RegDAO;
import com.mat.model.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class RegServiceImpl implements RegService{

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private RegDAO dao;

    @Override
    public int insertUser(UserVO user) {
        System.out.println(user.toString());
        int result = 0;
        try {
            user.setUser_pw(passwordEncoder.encode(user.getUser_pw()));
            result = dao.insertUser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int updateUser(UserVO user) {
        System.out.println(user.toString());
        int result = 0;
        try {
            user.setUser_pw(passwordEncoder.encode(user.getUser_pw()));
            result = dao.updateUser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int deleteUser(String user_id) {
        System.out.println(user_id);
        int result = 0;
        try {
            result = dao.deleteUser(user_id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
