package org.btm.setterInjectionApp;
public class Engine 			//DEPENDENCY CLASS//
{
	private int engine_number;
	private int engine_power;
	private String engine_type;
	public int getEngine_name() {
		return engine_number;
	}
	
	public int getEngine_number() {
		return engine_number;
	}

	public void setEngine_number(int engine_number) {
		this.engine_number = engine_number;
	}

	public int getEngine_power() {
		return engine_power;
	}

	public void setEngine_power(int engine_power) {
		this.engine_power = engine_power;
	}

	public String getEngine_type() {
		return engine_type;
	}

	public void setEngine_type(String engine_type) {
		this.engine_type = engine_type;
	}

	@Override
	public String toString() 
	{
		return "Engine [engine_name=" + engine_number + ", engine_power=" + engine_power + ", engine_type=" + engine_type
				+ "]";
	}
}
