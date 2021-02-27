package org.btm.SpringAutoWiringByName_App;

public class FlipkartController 
{
	private Electronics ec;
	private Cosmetics cs;
	private Furnitures fr;
	
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
		System.out.println("Purchase confirmed by Flipkart : ");
		ec.mobile();
		cs.lipStick();
		fr.sofa();
	}
}
