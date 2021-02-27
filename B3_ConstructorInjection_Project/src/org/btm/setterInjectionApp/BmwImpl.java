package org.btm.setterInjectionApp;

import java.util.List;

public class BmwImpl implements ICar 
{
	private int id;                      //PRIMITIVE DATA//
	private String colour;
	private Engine engine;             //CLASS TYPE//
	private List<String> wheel;       //COLLECTION TYPE//

	public BmwImpl() 
	{
		System.out.println("BMW implementation object created !!");
	}
	public BmwImpl(int id, String colour, Engine engine, List<String> wheel) 
	{
		super();
		this.id = id;
		this.colour = colour;
		this.engine = engine;
		this.wheel = wheel;
	}
	

	@Override
	public void drive() 
	{
		System.out.println("BMW CAR DETAILS BELOW !!");
		
		System.out.println("BMW ID "+id);
		System.out.println("BMW COLOUR "+colour);
		System.out.println("BMW ENGINE "+engine);
		System.out.println("BMW WHEEL "+wheel);
		
		System.out.println("NOW FINALLY I CAN DRIVE BMW !!");
	}
}
