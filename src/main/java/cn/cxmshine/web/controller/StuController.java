package cn.cxmshine.web.controller;

import cn.cxmshine.model.Student;
import cn.cxmshine.model.User;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @RestController 常用于写接口API,提供数据
 * @Controller 常用于写后台,涉及到页面跳转
 */
@Controller
@RequestMapping("stu")
public class StuController {

    /**
     * 方法返回值是String,指向将要进行数据展示的页面.也就是templates/stu/list.ftl
     * 在templates/stu/list.ftl将数据取出,进行页面展示
     * @param model
     * @return
     */
    @RequestMapping("/list")
    public String list(Model model){
        model.addAttribute("user","陈旭明");
        model.addAttribute("age",18);
        Student stu1 = new Student(1000,"zhangsan","男");
        Student stu2 = new Student(1001,"lisi","男");
        Student stu3 = new Student(1002,"wangwu","男");
        List<Student> stuList = new ArrayList<>();
        stuList.add(stu1);
        stuList.add(stu2);
        stuList.add(stu3);
        model.addAttribute("stuList",stuList);

        Student student = new Student(1003,"tianqi","男");
        model.addAttribute("student",student);
        return "stu/list";
    }

    /**
     * 返回值是json
     * @return
     */
    @RequestMapping("/list1")
    @ResponseBody
    public List<Student> list(){
        Student stu1 = new Student(1000,"zhangsan","男");
        Student stu2 = new Student(1001,"lisi","男");
        Student stu3 = new Student(1002,"wangwu","男");
        List<Student> stuList = new ArrayList<>();
        stuList.add(stu1);
        stuList.add(stu2);
        stuList.add(stu3);
        return stuList;
    }
}
