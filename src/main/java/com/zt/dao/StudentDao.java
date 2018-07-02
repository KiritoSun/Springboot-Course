package com.zt.dao;

import com.zt.pojo.student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentDao {
    // 查询指定id的记录
    public student selectById(String s_id);
}
