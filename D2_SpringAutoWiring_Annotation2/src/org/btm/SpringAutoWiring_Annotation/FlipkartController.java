package org.btm.SpringAutoWiring_Annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class FlipkartController 
{
	@Autowired
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
