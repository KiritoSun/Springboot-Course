package com.zt.service;

import com.zt.pojo.course;
import com.zt.pojo.select;
import com.zt.pojo.vcourse;

import java.util.List;

public interface SelectService {
    // 处理选课业务
    public String selectCourse(select select);
    // 处理课程查询业务
    public List<vcourse> selectCourse2(String s_id);
    // 修改积分业务
    public boolean updatePoint(select select);
    // 退课业务
    public boolean removeCourse(String s_id,String c_id);
}
