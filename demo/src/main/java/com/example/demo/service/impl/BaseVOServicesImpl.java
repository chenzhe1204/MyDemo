package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.service.BaseVOServices;
import com.example.demo.vo.BaseVO;

@Repository
public class BaseVOServicesImpl implements BaseVOServices{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public String insert(BaseVO a) {
		String a1=a.getInsertSql();
		Object[] a2=a.getValues();
		jdbcTemplate.update(a1, a2);
		return null;
	}

	@Override
	public String update(BaseVO a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(BaseVO a) {
		// TODO Auto-generated method stub
		return null;
	}

}
