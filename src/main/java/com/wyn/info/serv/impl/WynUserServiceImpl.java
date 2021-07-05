package com.wyn.info.serv.impl;

import com.wyn.info.dao.WynUserDao;
import com.wyn.info.model.WynUser;
import com.wyn.info.serv.WynUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class WynUserServiceImpl implements WynUserService {
    @Resource
    private WynUserDao wynUserDao;

    @Override
    public List<WynUser> findAll() {
        return wynUserDao.findAll();
    }
}
