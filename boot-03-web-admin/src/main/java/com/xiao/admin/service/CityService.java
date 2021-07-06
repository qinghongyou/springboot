package com.xiao.admin.service;

import com.xiao.admin.bean.City;


public interface CityService {

     City getById(Long id);

     void saveCity(City city);

}
