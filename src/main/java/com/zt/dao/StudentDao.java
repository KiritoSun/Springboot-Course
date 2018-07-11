package com.zt.dao;

import com.zt.pojo.student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StudentDao {
    // 查询指定id的记录
    public student selectById(String s_id);
    // 修改指定id的记录
    public void updateById(@Param("s_name") String s_name,@Param("s_password") String s_password,
                           @Param("s_sex") String s_sex,@Param("s_major") String s_major,@Param("s_id") String s_id);
    // 扣除积分操作
    public void reducePoint(@Param("s_id") String s_id,@Param("s_point") int s_point);
    // 返还积分操作
    public void plusPoint(@Param("s_id") String s_id,@Param("s_point") int s_point);
}
