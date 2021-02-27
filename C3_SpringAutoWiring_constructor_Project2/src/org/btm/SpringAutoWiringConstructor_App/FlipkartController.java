package org.btm.SpringAutoWiringConstructor_App;

public class FlipkartController 
{
	private Electronics ec;
	private Cosmetics cs;
	private Furnitures fr;

	public FlipkartController(Electronics ec, Cosmetics cs, Furnitures fr) 
	{
		super();
		this.ec = ec;
		this.cs = cs;
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
