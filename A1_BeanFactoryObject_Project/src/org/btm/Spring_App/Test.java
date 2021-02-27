package org.btm.Spring_App;

import java.io.IOException;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;

public class Test 
{
	public static void main(String[] args) throws IOException 
	{
		Resource res = new ClassPathResource("Spring.xml");
		System.out.println(res.getFile());
		BeanFactory bef = new XmlBeanFactory(res);
		HelloWorld hw = (HelloWorld) bef.getBean("hello");
		hw.displayMessage();
		
	}

}
