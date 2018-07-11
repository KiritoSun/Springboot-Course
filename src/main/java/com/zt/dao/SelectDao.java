package com.zt.dao;

import com.zt.pojo.select;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SelectDao {
    // 插入一条记录
    public void insert(select select);
    // 查询操作
    public select selects(@Param("s_id") String s_id,@Param("c_id") String c_id);
    // 根据学生id查询
    public List<select> selectBySid(String s_id);
    // 修改积分
    public void updatePoint(select select);
}
