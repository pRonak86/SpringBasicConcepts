package com.main;


import java.util.List;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Emp;
import com.dao.EmpImpl;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmpImpl empImpl = (EmpImpl) context.getBean("emp");
		// Insert
		/*
		 * Emp e = new Emp(); e.setId(5); e.setName("Nikul"); e.setContact(955655);
		 * e.setSalary(6000); empImpl.saveEmp(e);
		 */

		// Search record by id
		/*
		 * Emp e=empImpl.getEmp(3); if(e!=null) { System.out.println("available");
		 * System.out.println("Id--"+e.getId());
		 * System.out.println("Name--"+e.getName());
		 * System.out.println("Contact--"+e.getContact());
		 * System.out.println("Salary---"+e.getSalary()); } else {
		 * System.out.println("Not available"); }
		 */
		// Update Operations
		/*
		 * Emp e=new Emp(); e.setId(3); e.setName("Rakesh"); e.setContact(8787884);
		 * e.setSalary(20000); empImpl.updateEmp(e);
		 */

		// Delete Operations
		/*
		 * String status=empImpl.deleteEmp(104); System.out.println(status);
		 */

		// Get All Data

		List<Emp> l = empImpl.getEmps();
		for (Emp em : l) {

			System.out.println(em.getId() + " " + em.getName() + " " + em.getContact() + " " + em.getSalary());
		}

	}

}
