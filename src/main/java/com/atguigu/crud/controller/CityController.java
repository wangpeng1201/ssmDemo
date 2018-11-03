/**
 * 
 */
package com.atguigu.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.crud.bean.City;
import com.atguigu.crud.service.CityService;

/**
 * @author Administrator
 * 2018年2月27日 上午10:45:14
 */
@RestController
public class CityController {
	@Autowired
	private CityService cityService;
	@GetMapping("/citys")
	public List<City> allCitys(){
		List<City> citys=new ArrayList<City>();
		City a=new City();
		a.setName("武汉");
		a.setAddress("湖北省");
		citys.add(a);
		return cityService.getAllCitys();
	}
}
