package cn.cxmshine.web.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController   //这个注解能够代替@Controller + @ResponseBody
@EnableAutoConfiguration    //自动配置,不需要再写大量的配置文件
public class HelloController {

    @RequestMapping("hello/{name}")
    public String hello(@PathVariable("name") String name){
        return "Hello,"+name;
    }

    public static void main(String[] args){
        SpringApplication.run(HelloController.class,args);
    }
}
