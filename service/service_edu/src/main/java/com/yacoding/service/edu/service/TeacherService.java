package com.yacoding.service.edu.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yacoding.service.edu.entity.Teacher;
import com.yacoding.service.edu.entity.TeacherQueryVo;

/**
 * @Author yaCoding
 * @create 2022-06-26 下午 9:40
 */

public interface TeacherService extends IService<Teacher> {


    /**
     * 带查询条件的分页查询
     * @param pageParam       分页对象
     * @param teacherQueryVo  查询条件
     */
    IPage<Teacher> selectPage(Page<Teacher> pageParam, TeacherQueryVo teacherQueryVo);

}
