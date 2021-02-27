package org.btm.Spring_App;

import java.io.IOException;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.*;

public class Test 
{
	public static void main(String[] args) throws IOException 
	{
		ApplicationContext   context = new ClassPathXmlApplicationContext("Spring.xml");   
		HelloWorld hw = (HelloWorld) context.getBean("hello");
		hw.displayMessage();
		
	}

}
