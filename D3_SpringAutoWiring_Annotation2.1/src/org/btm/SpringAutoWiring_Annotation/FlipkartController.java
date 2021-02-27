package org.btm.SpringAutoWiring_Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class FlipkartController 
{
	@Autowired
	@Qualifier(value="Any1")			//This Annotation is used to select only one Bean class among the available 2 same beans //
	private Electronics ec;
	@Autowired
	private Cosmetics cs;
	@Autowired
	private  Furnitures fr;
	public Electronics getEc() {
		return ec;
	}
	public void setEc(Electronics ec) {
		this.ec = ec;
	}
	public Cosmetics getCs() {
		return cs;
	}
	public void setCs(Cosmetics cs) {
		this.cs = cs;
	}
	public Furnitures getFr() {
		return fr;
	}
	public void setFr(Furnitures fr) {
		this.fr = fr;
	}
	
	public void purchase() 
	{
		System.out.println("Purchase is confirmes by Flipkart !!");
		ec.mobile();
		cs.lipStick();
		fr.sofa();
	}
}
