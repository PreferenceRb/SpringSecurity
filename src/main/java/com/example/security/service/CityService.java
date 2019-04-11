package com.example.security.service;

import com.example.security.dao.cluster.CityDao;
import com.example.security.vo.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by kobe on 2019/3/27.
 */
@Service
public class CityService implements ICityService {
    @Autowired
    private CityDao cityDao;
    @Override
    public List<City> queryCity() {
        return cityDao.queryCity();
    }
}
