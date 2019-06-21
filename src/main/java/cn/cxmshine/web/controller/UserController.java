package cn.cxmshine.web.controller;

import cn.cxmshine.model.User;
import cn.cxmshine.service.IUserService;
import cn.cxmshine.test1.service.UserServiceImpl;
import cn.cxmshine.test2.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @RequestMapping("info/{id}")
    public User userInfo(@PathVariable("id") Integer id){
        User user = new User("chenxuming","123456");
        user.setId(id);
        //int i = 10/0;
        return user;
    }


//    @Autowired
//    private IUserService userService;
//    @RequestMapping("register")
//    public String register(String username,String password){
//        userService.register(username,password);
//        return "success";
//    }

    //多数据源的练习,往两张表中插入数据
    @Autowired
    private UserServiceImpl userService1;

    @Autowired
    private CustomerServiceImpl customerService;

    @RequestMapping("register")
    public String register(String username,String password,String tel){
        //向test1表插入数据
        userService1.save(username,password);
        //向test2表插入数据
        customerService.save(username,tel);
        return "success";
    }


//    @RequestMapping("findUser")
//    public User findByUsername(String username){
//        return userService.findByUsername(username);
//    }
}
