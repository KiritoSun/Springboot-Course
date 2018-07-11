package com.zt.dao;

import com.zt.pojo.course;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CourseDao {
    // 查询所有记录
    public List<course> selectAll();
    // 根据id查询记录
    public course selectById(String c_id);
}
