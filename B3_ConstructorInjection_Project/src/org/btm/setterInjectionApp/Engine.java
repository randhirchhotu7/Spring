package org.btm.setterInjectionApp;
public class Engine 			//DEPENDENCY CLASS//
{
	private int engine_number;
	private int engine_power;
	private String engine_type;
	
	public Engine(int engine_number, int engine_power, String engine_type) 
	{
		super();
		this.engine_number = engine_number;
		this.engine_power = engine_power;
		this.engine_type = engine_type;
	}

	@Override
	public String toString() 
	{
		return "Engine [engine_name=" + engine_number + ", engine_power=" + engine_power + ", engine_type=" + engine_type
				+ "]";
	}
}
