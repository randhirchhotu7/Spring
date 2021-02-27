package org.btm.StereoTypeAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		FlipkartController controller = (FlipkartController) context.getBean(FlipkartController.class);
		controller.purchase();
	}
}
