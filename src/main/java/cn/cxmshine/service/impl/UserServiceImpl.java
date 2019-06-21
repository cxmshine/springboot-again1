//package cn.cxmshine.service.impl;
//
//import cn.cxmshine.mapper.UserMapper;
//import cn.cxmshine.model.User;
//import cn.cxmshine.service.IUserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//@Service
//@Transactional
//public class UserServiceImpl implements IUserService {
//
////    @Autowired
////    private JdbcTemplate jdbcTemplate;
//
//    @Autowired
//    private UserMapper userMapper;
//
//    @Override
//    public void register(String username, String password) {
//        //int i=10/0;
//        String sql = "insert into t_user(username,password) values(?,?)";
//        userMapper.save(username,password);
//    }
//
//    @Override
//    public User findByUsername(String username) {
//        return userMapper.findByUsername(username);
//    }
//}
