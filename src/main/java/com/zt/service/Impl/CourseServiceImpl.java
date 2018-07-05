package com.zt.service.Impl;

import com.zt.dao.CourseDao;
import com.zt.pojo.course;
import com.zt.service.CourseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    @Resource
    private CourseDao courseDao;

    @Override
    public List<course> sortPage(int page) {
        List<course> list = null;
        List<course> newlist = new ArrayList<>();
        try{
            list = courseDao.selectAll();
            int start = (page-1)*4;
            for(int i=start;i<start+4;i++){
                if(i>=list.size()) break;
                newlist.add(list.get(i));
            }
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }finally {}
        return newlist;
    }

    @Override
    public int getNumber() {
        List<course> list = null;
        try{
            list = courseDao.selectAll();
        }catch (Exception e){
            e.printStackTrace();
            return 0;
        }
        return (list.size()/4);
    }
}
