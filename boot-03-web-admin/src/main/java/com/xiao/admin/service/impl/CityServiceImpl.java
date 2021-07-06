package com.xiao.admin.service.impl;

import com.xiao.admin.bean.City;
import com.xiao.admin.mapper.CityMapper;
import com.xiao.admin.service.CityService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    CityMapper cityMapper;

//    Counter counter;

//    public CityServiceImpl(MeterRegistry meterRegistry){
//        counter = meterRegistry.counter("cityService.saveCity.count");
//    }


    public City getById(Long id){
        return cityMapper.getById(id);
    }


    public void saveCity(City city) {
//        counter.increment();
        cityMapper.insert(city);

    }
}
