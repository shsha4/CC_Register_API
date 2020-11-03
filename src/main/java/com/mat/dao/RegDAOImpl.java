package com.mat.dao;

import com.mat.model.UserVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RegDAOImpl implements RegDAO{

    @Autowired
    private SqlSession sqlSession;

    @Override
    public int insertUser(UserVO user) {
        return sqlSession.insert("insertUser", user);
    }

    @Override
    public int updateUser(UserVO user) {
        return sqlSession.update("updateUser", user);
    }

    @Override
    public int deleteUser(String user_id) {
        return sqlSession.delete("deleteUser", user_id);
    }
}
