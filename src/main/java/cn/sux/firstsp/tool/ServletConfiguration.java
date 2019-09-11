package cn.sux.firstsp.tool;

import cn.sux.firstsp.tool.servlet.TestServlet;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author sux
 * 用于装配servlet的bean（有2种方法）
 * 一：@bean注解 并实现手动装配
 * 二：使用@ServletComponentScan注解，自动装配(但是要在servlet配置webservlet)
 */
@Configuration
@ServletComponentScan
public class ServletConfiguration {

//    @Bean
//    public ServletRegistrationBean servletRegistrationBean(){
//        return new ServletRegistrationBean(new TestServlet(),"/test");
//    }
}
