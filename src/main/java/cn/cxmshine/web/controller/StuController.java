package cn.cxmshine.web.controller;

import cn.cxmshine.model.Student;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @RestController 常用于写接口API,提供数据
 * @Controller 常用于写后台,涉及到页面跳转
 */
@Controller
@RequestMapping("stu")
public class StuController {

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
        return "stu/list";
    }
}
