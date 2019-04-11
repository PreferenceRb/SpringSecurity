package com.example.security.util;

import com.example.security.service.CityService;
import com.example.security.service.ICityService;
import com.example.security.vo.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by kobe on 2019/3/27.
 */
@Component
public class CityUtil {
    private static ICityService cityService;

    @Autowired
    public void setCityService(CityService cityService) {
        CityUtil.cityService = cityService;
    }

    public static List<City> test(){
        return cityService.queryCity();
    }
}
