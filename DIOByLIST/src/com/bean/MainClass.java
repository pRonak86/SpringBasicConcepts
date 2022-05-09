package com.bean;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class MainClass {

	public static void main(String[] args) {
		
		XmlBeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("applicationConfiguration.xml"));
		Student s=(Student)beanFactory.getBean("stu");
		s.display();
			

	}

}
