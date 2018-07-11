package com.zt.service.Impl;

import com.zt.dao.CourseDao;
import com.zt.dao.SelectDao;
import com.zt.dao.StudentDao;
import com.zt.pojo.course;
import com.zt.pojo.select;
import com.zt.pojo.student;
import com.zt.pojo.vcourse;
import com.zt.service.SelectService;
import com.zt.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class SelectServiceImpl implements SelectService {
    @Resource
    private CourseDao courseDao;
    @Resource
    private StudentDao studentDao;
    @Resource
    private SelectDao selectDao;

    @Override
    public String selectCourse(select select) {
        try{
            student student = studentDao.selectById(select.getS_id());
            if(select.getPoint()>student.getS_point()) return "npoint";
            if(selectDao.selects(select.getS_id(),select.getC_id())!=null) return "no";
            studentDao.reducePoint(select.getS_id(),select.getPoint());
            selectDao.insert(select);
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
        return "success";
    }

    @Override
    public List<vcourse> selectCourse2(String s_id) {
        List<select> list = null;
        List<vcourse> list2 = null;
        try{
            list = selectDao.selectBySid(s_id);
            list2 = new ArrayList<>();
            vcourse p = null;
            for(select e : list){
                p = new vcourse(courseDao.selectById(e.getC_id()),e.getPoint());
                list2.add(p);
            }
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }finally {}
        return list2;
    }
}
