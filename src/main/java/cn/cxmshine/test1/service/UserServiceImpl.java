//package cn.cxmshine.test1.service;
//
//import cn.cxmshine.test1.mapper.UserMapper;
//import cn.cxmshine.test2.mapper.CustomerMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//@Service
//@Transactional
//public class UserServiceImpl {
//
//    @Autowired
//    private UserMapper userMapper;
//
//    @Autowired
//    private CustomerMapper customerMapper;
//
//    public void save(String username,String password){
//        customerMapper.save(username,"1234");
//        //int i=10/0;
//        userMapper.save(username,password);
//    }
//}
