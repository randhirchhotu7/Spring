package org.btm.setterInjectionApp;

import java.util.List;

public class AudiImpl implements ICar
{
	private int id;                      //PRIMITIVE DATA//
	private String colour;
	private Engine engine;             //CLASS TYPE//
	private List<String> wheel;       //COLLECTION TYPE//
	
	public AudiImpl() 
	{
		System.out.println("Audi Implimentation gets created !!");
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public List<String> getWheel() {
		return wheel;
	}
	public void setWheel(List<String> wheel) {
		this.wheel = wheel;
	}
	@Override
	public void drive() 
	{
		System.out.println("AUDI CAR DETAILS BELOW !!");

		System.out.println("AUDI ID "+getId());
		System.out.println("BMW COLOUR "+getColour());
		System.out.println("BMW ENGINE "+getEngine());
		System.out.println("BMW WHEEL "+getWheel());

		System.out.println("NOW FINALLY I CAN DRIVE BMW !!");
	}
}