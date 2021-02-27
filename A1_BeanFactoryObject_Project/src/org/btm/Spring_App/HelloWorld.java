
package org.btm.Spring_App;

public class HelloWorld    //POJO CLASS//
{
	public HelloWorld() 
	{
		System.out.println("HelloWorld Object is created !!");
	}
	private String message = "It's My First Spring Program !!";

	public void displayMessage()
	{
		System.out.println("Message is :  "+message);
	}
}
