package com.bean;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class MainClass {
	public static void main(String[] args) {
			XmlBeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
			Test t=(Test)beanFactory.getBean("t");
			t.msg();
			t.msg1();
			t.msg2();
	}
}
