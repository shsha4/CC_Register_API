package com.mat.controller;

import com.google.gson.Gson;
import com.mat.model.UserVO;
import com.mat.service.RegService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RegController {

    @Autowired
    private RegService service;
    private Gson gson = new Gson();

    @PostMapping("insertUser.do")
    public int insertUserAction(@ModelAttribute UserVO user) {
        return service.insertUser(user);
    }

    @PutMapping("/updateUser.do")
    public int updateUserAction(@RequestBody UserVO user) {
        System.out.println(user.toString());
        return service.updateUser(user);
    }

    @DeleteMapping("/{user_id}/deleteUser.do")
    public int deleteUserAction(@PathVariable String user_id) {
        return service.deleteUser(user_id);
    }
}
