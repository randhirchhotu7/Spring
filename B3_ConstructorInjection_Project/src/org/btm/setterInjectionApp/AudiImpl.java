package org.btm.setterInjectionApp;

import java.util.List;

public class AudiImpl implements ICar
{
	public AudiImpl() 
	{
		System.out.println("AUDI IMPLIMENTATION OBJECT CREATED !!");
	}

	@Override
	public void drive() 
	{
		System.out.println("NOW I CAN DRIVE AUDI !!");
	}
}