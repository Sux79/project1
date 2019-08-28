package cn.sux.firstsp;

import org.jasypt.util.text.BasicTextEncryptor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FirstspApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void pass(){
        BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
        textEncryptor.setPassword("");
        String url =textEncryptor.encrypt("");
        String name = textEncryptor.encrypt("");
        String pasw = textEncryptor.encrypt("");
        System.out.println("url:"+url);
        System.out.println("name:"+name);
        System.out.println("pasw:"+pasw);
    }

}
