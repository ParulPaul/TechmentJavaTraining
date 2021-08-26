package com.techment.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.techment.model.Employee1;

public class Test1 {

	public static void main(String[] args) {
		
		 Resource r=new ClassPathResource("object.xml");  
		    BeanFactory factory=new XmlBeanFactory(r);  
		      
		    Employee1 e=(Employee1)factory.getBean("object");  
		    e.displayInfo();  
		      
		
	}

}
