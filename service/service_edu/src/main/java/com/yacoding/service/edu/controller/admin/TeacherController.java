package com.yacoding.service.edu.controller.admin;

/**
 * @Author yaCoding
 * @create 2022-07-30 下午 10:44
 */

import com.yacoding.service.edu.service.TeacherService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 讲师 前端控制器
 */
@Api(description = "讲师管理")
@RestController
@RequestMapping("/edu/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;


}
