package cn.sux.firstsp.service;


import cn.sux.firstsp.dao.loginDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class LoginService {
    @Autowired
    private loginDao lgdao;

    public List queryList(HashMap s) {
        List a= lgdao.queryList(s);
        return a;
    }

}
