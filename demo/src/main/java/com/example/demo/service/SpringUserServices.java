package com.example.demo.service;

import com.example.demo.vo.SpringUser;

public interface SpringUserServices extends BaseVOServices{
	public abstract Integer verify(SpringUser user);
}
