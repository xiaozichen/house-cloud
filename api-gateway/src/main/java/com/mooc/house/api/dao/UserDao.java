package com.mooc.house.api.dao;

import com.mooc.house.api.common.RestResponse;
import com.mooc.house.api.config.GenericRest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2018/9/2.
 */
@Repository
public class UserDao {

    @Autowired
    private GenericRest genericRest;

    public  RestResponse getUserName(long id){
        String url = "http://user/getTestUserName?id="+id;
        RestResponse<String> response = genericRest.get(url, new ParameterizedTypeReference<RestResponse<String>>() {
        }).getBody();
        return response;
    }
}
