package cn.cxmshine.web.controller;

import cn.cxmshine.model.User;
import cn.cxmshine.service.UserServiceImpl;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
public class UserController {

    //Logger logger = Logger.getLogger(UserController.class);

    @RequestMapping("info/{id}")
    @ResponseBody
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
    private UserServiceImpl userService;

    @RequestMapping("register")
    @ResponseBody
    public String register(String username,String password){
        //logger.info("====="+"username:"+username+"password:"+password);
        //向test1表插入数据
        userService.register(username,password);
        return "success";
    }


//    @RequestMapping("findUser")
//    @ResponseBody
//    public User findByUsername(String username){
//        return userService.findByUsername(username);
//    }

    @RequestMapping("/login")
    public String login(String username,String password){
        return "user/list";
    }
}
