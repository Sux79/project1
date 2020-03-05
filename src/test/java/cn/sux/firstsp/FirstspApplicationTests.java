package cn.sux.firstsp;

import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.ICaptcha;
import cn.hutool.captcha.LineCaptcha;
import cn.hutool.core.date.DateUtil;
import cn.hutool.json.JSONUtil;
import cn.hutool.system.HostInfo;
import cn.hutool.system.OsInfo;
import cn.hutool.system.SystemUtil;
import org.apache.commons.lang.StringUtils;

import cn.hutool.system.UserInfo;
import org.jasypt.util.text.BasicTextEncryptor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FirstspApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void pass(){
        BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
        textEncryptor.setPassword("ZeY8EkNVcB2cDolQ0M");
        String url =textEncryptor.encrypt("jdbc:oracle:thin:@106.75.2.35:1521:orcl1");
        String name = textEncryptor.encrypt("pro1");
        String pasw = textEncryptor.encrypt("pro1");
        System.out.println("url:"+url);
        System.out.println("name:"+name);
        System.out.println("pasw:"+pasw);
    }

    @Test
    public void tool(){
        Date da = org.assertj.core.util.DateUtil.now();
        int date = DateUtil.minute(da);
        System.out.println(da);
        System.out.println(date);
    }

    @Test
    public void system(){
        HostInfo info = SystemUtil.getHostInfo();
//        OsInfo info = SystemUtil.getOsInfo();
//        UserInfo info = SystemUtil.getUserInfo();

        System.out.println(info);
    }

    @Test
    public void CreatCode(){
        LineCaptcha lineCaptcha = CaptchaUtil.createLineCaptcha(102,40,4,18);
        lineCaptcha.write("d:/line.png");
        System.out.println(lineCaptcha.getCode());
        System.out.println(lineCaptcha.verify("1234"));
    }

    @Test
    public void t(){
        Map a =new HashMap();
        Map b =new HashMap();
        StringBuilder cellID = new StringBuilder();
        StringBuilder dealStaff = new StringBuilder();
        String s ="[{\"cell_id\":\"10000183\",\"name\":\"马鞍东路11号宿舍\",\"type\":\"\",\"staff_list\":[\"aa0010059\",\"lucy\"]},{\"cell_id\":\"10000184\",\"name\":\"马鞍东路12号宿舍\",\"type\":\"\",\"staff_list\":[\"zte\",\"lucy\"]}]";
        List staffCellList = JSONUtil.parseArray(s);
        for (int j = 0; j < staffCellList.size() ; j++) {
            b = (Map) staffCellList.get(j);
            if (j == staffCellList.size()-1){
                cellID.append(b.get("cell_id"));
                dealStaff.append(StringUtils.strip(b.get("staff_list").toString(),"[]"));
            }else {
                cellID.append(b.get("cell_id")).append(",");
                dealStaff.append(StringUtils.strip(StringUtils.strip(b.get("staff_list").toString(),"[]"),"''")).append(",");
            }
        }
        a.put("cell_id",cellID);
        a.put("deal_staff",dealStaff);
        System.out.println(a);
    }
}
