package com.tydic.seckill.controller;

import com.tydic.seckill.bean.User;
import com.tydic.seckill.redis.RedisService;
import com.tydic.seckill.result.Result;
import com.tydic.seckill.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by jiangyunxiong on 2018/5/23.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    RedisService redisService;

    @RequestMapping("/info")
    @ResponseBody
    public Result<User> info(Model model, User user) {
        return Result.success(user);
    }
}