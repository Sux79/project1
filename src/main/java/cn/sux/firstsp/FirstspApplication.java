package cn.sux.firstsp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

//@Controller
@SpringBootApplication
@MapperScan("com.sux.crm.dao")

public class FirstspApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(FirstspApplication.class, args);
    }
//    测试用于看启动类内编写内容能不能直接用于启动项目(可以不用EnableAutoConfiguration)
//    @RequestMapping(value = "/index")
//    public String indexLogin() {
//        return "login";
//    }
        @Override
        protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
            return application.sources(FirstspApplication.class);
        }
}
