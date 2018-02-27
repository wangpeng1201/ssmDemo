/**
 * 
 */
package com.atguigu.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.atguigu.crud.bean.City;
import com.atguigu.crud.dao.CityMapper;

/**
 * @author Administrator
 * 2018年2月27日 上午10:49:12
 */
public interface CityService {
	public List<City> getAllCitys();
}
