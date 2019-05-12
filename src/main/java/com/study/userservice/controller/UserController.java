package com.study.userservice.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RequestMapping("/api/user")
@RestController
public class UserController {

    @RequestMapping("/queryUserInfoById")
    public Map<String,Object> queryUserInfoById(String id){

        Map<String,Object> userInfoMap=new HashMap<>();
        userInfoMap.put("id",id);
        userInfoMap.put("name","张三");
        return  userInfoMap;
    }


}
