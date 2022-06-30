package com.yacoding.service.edu.controller;

import com.yacoding.service.base.result.R;
import com.yacoding.service.edu.entity.Teacher;
import com.yacoding.service.edu.service.TeacherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author yaCoding
 * @create 2022-06-26 下午 9:39
 * * 讲师 前端控制器
 *
 */

@Api(description = "讲师管理")
@RestController
@RequestMapping("/edu/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    //查询讲师的所有数据
    @ApiOperation(value = "所有讲师列表")
    @GetMapping("findAll")
    public R findAllTeacher() {
        List<Teacher> list = teacherService.list();
        return R.ok().data("items",list);
    }

    //根据id获取讲师信息
    @ApiOperation(value = "根据id获取讲师信息")
    @GetMapping("get/{id}")
    public R getTeacherById(@ApiParam("讲师ID")@PathVariable String id){
        Teacher teacher = teacherService.getById(id);
        if(teacher!=null){
            return R.ok().data("item",teacher);
        }
        return R.error().message("数据不存在");
    }

}