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

    public List queryList() throws Exception {
        List a= lgdao.queryList();
        return a;
    }

}
