/**
 * 
 */
package com.atguigu.crud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.crud.bean.City;
import com.atguigu.crud.bean.CityExample;
import com.atguigu.crud.bean.CityExample.Criteria;
import com.atguigu.crud.dao.CityMapper;
import com.atguigu.crud.service.CityService;

/**
 * @author Administrator
 * 2018年2月27日 上午10:54:31
 */
@Service
public class CityServiceImpl implements CityService {

	@Autowired 
	private CityMapper cityMapper;
	public List<City> getAllCitys() {
		return cityMapper.selectAll();
	}
}
