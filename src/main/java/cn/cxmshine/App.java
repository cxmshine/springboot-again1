package cn.cxmshine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@EnableAutoConfiguration
@ComponentScan(basePackages = "cn.cxmshine.web.controller")
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class,args);
    }
}
