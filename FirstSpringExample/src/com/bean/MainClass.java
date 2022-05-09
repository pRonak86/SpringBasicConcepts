//Main IOC class -- which use to combile both your pojo and xml file


package com.bean;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class MainClass {

	public static void main(String[] args) {
		
	
		XmlBeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("applitionContext.xml"));
	
		Student s=(Student)beanFactory.getBean("stu"); //looesly couple
		s.display();

	}

}
