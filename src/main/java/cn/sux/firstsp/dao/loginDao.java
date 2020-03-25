package cn.sux.firstsp.dao;

import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;

public interface loginDao {
    @Transactional(rollbackFor = Exception.class)
    List queryList();
}
