import com.zt.Application;
import com.zt.pojo.course;
import com.zt.service.CourseService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class PageTest {
    @Resource
    private CourseService courseService;

    @Test
    public void fun1(){
        List<course> list = courseService.sortPage(3);
        list.forEach(e->{
            System.out.println(e);
        });
    }
}
