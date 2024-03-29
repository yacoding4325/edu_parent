package com.yacoding.service.edu.controller.admin;

import com.yacoding.service.base.result.R;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author yaCoding
 * @create 2022-07-30 下午 10:39
 */

@RestController
@RequestMapping("/admin/edu/user")
@CrossOrigin
public class LoginController {

    /**
     * 登录，获取到token
     */
    @PostMapping("/login")
    public R login(){
        return R.ok().data("token","admin");
    }


    /**
     * 获取用户信息
     */
    @GetMapping("/info")
    public R getInfo(){
        Map<String,Object> map = new HashMap<>();
        map.put("roles","[admin]");
        map.put("name","admin");
        map.put("avatar","https://javaclimb-file.oss-cn-beijing.aliyuncs.com/avatar/01.jpeg");
        return R.ok().data(map);
    }
}
