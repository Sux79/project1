package cn.sux.firstsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@Controller
@SpringBootApplication
public class FirstspApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstspApplication.class, args);
    }
//    测试用于看启动类内编写内容能不能直接用于启动项目(可以不用EnableAutoConfiguration)
//    @RequestMapping(value = "/index")
//    public String indexLogin() {
//        return "login";
//    }
}
