package com.ecommerceapp;

abstract class Applications {
	String Amazon;
	String Flipchart;
	String Myntra;
	

public void showApplications()
{

	System.out.println("Choose Application: ");	
}

public void showVersion()
{
System.out.println("Application Version:  ");
}

	public void showPrice()
	{
		System.out.println("The Price is...");
		
	}
	
	Applications(String appversion, String Flipchart, String Myntra, String Amazon)
	{
		this.Amazon=Amazon;
		this.Flipchart=Flipchart;
		this.Myntra=Myntra;
	System.out.print("Show Application.. " +Amazon);
	System.out.print("Show Application.. " +Flipchart);
	System.out.print("Show Application.. " +Myntra);
	}

abstract void ProductServices();
abstract void ProductPrice();


public static void main(String [] args) {
	
	return;
	
	
	
}

}
