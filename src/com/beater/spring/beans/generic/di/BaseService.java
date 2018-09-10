package com.beater.spring.beans.generic.di;

import org.springframework.beans.factory.annotation.Autowired;

public class BaseService<T> {

	/**
	 * 在使用@Autowired时，首先在容器中查询对应类型的bean
	 * 
	 * 如果查询结果刚好为一个，就将该bean装配给@Autowired指定的数据
	 * 
	 * 如果查询的结果不止一个，那么@Autowired会根据名称来查找。
	 * 
	 * 如果查询的结果为空，那么会抛出异常。解决方法时，使用required=false
	 */
	@Autowired
	protected BaseRepository<T> repository;

	public void add() {
		System.out.println("add...");
		System.out.println(repository);
	}
}
