package com.example.security.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.security.util.CityUtil;
import com.example.security.vo.City;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by kobe on 2019/1/19.
 */
@RestController
@RequestMapping("/test")
@Api(tags = "test",description = "test")
public class TestDemo {

    private static Logger logger = LoggerFactory.getLogger(TestDemo.class);
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    @ApiOperation("测试")
    public String testDemo(){
        List<City> cities = CityUtil.test();
        logger.info(JSONObject.toJSONString(cities));
        return "test";
    }
}
