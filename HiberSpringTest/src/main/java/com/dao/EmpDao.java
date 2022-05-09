package com.dao;

import java.util.List;

import com.bean.Emp;

public interface EmpDao {
	public void saveEmp(Emp e);
	public void updateEmp(Emp e);
	public String deleteEmp(int id);
	public Emp getEmp(int id);
	//public List<Emp> getEmps();

}
