package com.example.demo.service;

import com.example.demo.vo.BaseVO;

public interface BaseVOServices {
	public abstract String insert(BaseVO a);
	public abstract String update(BaseVO a);
	public abstract String delete(BaseVO a);
}
