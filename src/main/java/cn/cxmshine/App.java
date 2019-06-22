package cn.cxmshine;

import cn.cxmshine.dbconfig.DBConfig1;
import cn.cxmshine.dbconfig.DBConfig2;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@EnableAutoConfiguration
//@MapperScan(basePackages = "cn.cxmshine.mapper")    //扫描mybatis的mapper包
@ComponentScan(basePackages = "cn.cxmshine")
@EnableConfigurationProperties(value = {DBConfig1.class, DBConfig2.class})
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class,args);
    }
}
