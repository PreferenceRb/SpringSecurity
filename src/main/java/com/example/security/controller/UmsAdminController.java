package com.example.security.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.security.dao.cluster.CityDao;
import com.example.security.dao.master.UmsAdminDao;
import com.example.security.vo.City;
import com.example.security.vo.UmsAdmin;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by kobe on 2019/1/22.
 */
@RestController
@Api(tags = "UmsAdminController",description = "用户管理")
@RequestMapping("/admin")
public class UmsAdminController {
    @Autowired
    private UmsAdminDao umsAdminDao;
    @Autowired
    private CityDao cityDao;

    final private Logger logger = LoggerFactory.getLogger(UmsAdminController.class);

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    @ApiOperation(value = "测试",notes = "测试")
    public void umsAdminList(){
        List<UmsAdmin> admins = umsAdminDao.queryAdmin();
        logger.info("admin info >>>"+JSONObject.toJSONString(admins));
        List<City> cities = cityDao.queryCity();
        logger.info("city info"+JSONObject.toJSONString(cities));
        Map<String,String> test = new HashMap<String,String>();
        for(Map.Entry vo:test.entrySet()){

        }
        //ThreadLocal
    }
}
