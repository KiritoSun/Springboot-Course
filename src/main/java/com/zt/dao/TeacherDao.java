package com.zt.dao;

import com.zt.pojo.teacher;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TeacherDao {
    // 查询指定id记录
    public teacher selectById(String t_id);
}
