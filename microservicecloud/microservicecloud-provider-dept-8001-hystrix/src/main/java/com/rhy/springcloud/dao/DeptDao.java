package com.rhy.springcloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.rhy.springcloud.entities.Dept;

@Mapper
public interface DeptDao {
	public boolean addDept(Dept dept);

	public Dept findById(Long id);

	public List<Dept> findAll();
}
