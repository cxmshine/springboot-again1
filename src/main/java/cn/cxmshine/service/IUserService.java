package cn.cxmshine.service;

import cn.cxmshine.model.User;

public interface IUserService {
    //用户注册
    public void register(String username,String password);

    public User findByUsername(String username);
}
