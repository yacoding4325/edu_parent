package com.yacoding.service.edu.controller.admin;

import com.yacoding.service.base.result.R;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author yaCoding
 * @create 2022-07-30 下午 10:39
 */
@RestController
@RequestMapping("/user")
@CrossOrigin
public class LoginController {

    /**
     * 登录，获取到token
     */
    @PostMapping("/login")
    public R getInfo() {
        Map<String,Object> map = new HashMap<>();
        map.put("roles","[admin]");
        map.put("name","admin");
        map.put("avatar","[admin]");
        return R.ok().data(map);
    }
}
