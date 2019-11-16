package com.example.demo.vo;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public abstract class BaseVO {

	public String getInsertSql() {
		String sql="insert into "+this.getClass().getSimpleName()+" (";
		String param="(";
		for(Field feild:this.getClass().getDeclaredFields()) {
			sql=sql+feild.getName()+",";
			param=param+"?,";
		}
		param=param.substring(0, param.length()-1)+")";
		sql=sql.substring(0, sql.length()-1)+") value "+param;
		return sql;
	}
	public Object[] getValues(){
		Object[] a=new Object[this.getClass().getDeclaredFields().length];
		String name;
		for(int i=0;i<this.getClass().getDeclaredFields().length;i++) {
			name=this.getClass().getDeclaredFields()[i].getName();
			String first=name.substring(0,1).toUpperCase();
			try {
				Method method=this.getClass().getMethod("get"+ name.replaceFirst(name.substring(0,1), first));
				a[i]=method.invoke(this);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return a;
	}
	
	
}
