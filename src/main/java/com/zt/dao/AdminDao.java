package com.zt.dao;

import com.zt.pojo.admin;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminDao {
    // 查询指定id的记录
    public admin selectById(String a_id);
}
