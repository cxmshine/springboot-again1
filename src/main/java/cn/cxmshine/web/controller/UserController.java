package cn.cxmshine.web.controller;

import cn.cxmshine.model.User;
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
        return user;
    }
}
