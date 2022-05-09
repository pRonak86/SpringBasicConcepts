package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate4.HibernateTemplate;

import org.springframework.transaction.annotation.Transactional;

import com.bean.Emp;

public class EmpImpl {

	HibernateTemplate hibernateTemplate;
	String status;
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	@Transactional
	public void saveEmp(Emp e) {

		hibernateTemplate.save(e);
	}
	@Transactional
	public void updateEmp(Emp e) {
		hibernateTemplate.update(e);
	}
	@Transactional
	public String deleteEmp(int id) {
		Emp e = new Emp();
		e.setId(id);
		hibernateTemplate.delete(e);
		status = "Success";
		return status;
	}
	public Emp getEmp(int id) {
		Emp e = (Emp) hibernateTemplate.get(Emp.class, id);
		return e;
	}
	public List<Emp> getEmps() {
		List<Emp> list = new ArrayList<Emp>();
		list = hibernateTemplate.loadAll(Emp.class);
		
		return list;
	}

}
