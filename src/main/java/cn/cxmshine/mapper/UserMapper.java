//package cn.cxmshine.mapper;
//
//import cn.cxmshine.model.User;
//import org.apache.ibatis.annotations.Insert;
//import org.apache.ibatis.annotations.Param;
//import org.apache.ibatis.annotations.Select;
//
//public interface UserMapper {
////    /**
////     * mybatis多个参数时,记得加@Param注解
////     * @param username
////     * @param password
////     */
////    @Insert("insert into t_user(username,password) values(#{username},#{password})")
////    public void save(@Param("username") String username,@Param("password") String password);
////
////    @Select("select * from t_user where username=#{username}")
////    public User findByUsername(@Param("username") String username);
//
//    public void save(@Param("username") String username,@Param("password") String password);
//
//    public User findByUsername(@Param("username") String username);
//}
