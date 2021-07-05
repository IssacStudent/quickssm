package com.wyn.info.test;

import com.wyn.info.dao.WynUserDao;
import com.wyn.info.model.WynUser;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

public class WynUserDaoTest extends BaseJunit4Test{
    @Resource
    private WynUserDao wynUserDao;

    @Test
    public void testFindAll(){
        List<WynUser> userList = wynUserDao.findAll();
        System.out.println(userList.size());
    }
}
