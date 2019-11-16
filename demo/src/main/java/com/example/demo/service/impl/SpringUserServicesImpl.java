package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.service.SpringUserServices;
import com.example.demo.vo.SpringUser;
@Service
public class SpringUserServicesImpl extends BaseVOServicesImpl implements SpringUserServices{
	
	public  Integer verify(SpringUser user) {
		return null;
	}
}
