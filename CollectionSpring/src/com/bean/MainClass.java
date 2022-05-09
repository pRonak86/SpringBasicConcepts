package com.bean;

import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class MainClass 
{
	public static void main(String[] args) {
		XmlBeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		ListExample le=(ListExample)beanFactory.getBean("li");
		le.display();
	}
}
