package com.mooc.house.api.service;

import com.mooc.house.api.common.RestResponse;
import com.mooc.house.api.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/9/2.
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public RestResponse getTestUerName(long id){
        return  userDao.getUserName(id);
    }
}
