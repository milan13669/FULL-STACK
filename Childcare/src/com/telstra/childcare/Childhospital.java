package com.telstra.childcare;

import java.util.Scanner;

public class Childhospital {
	private String Cname;
	private float Cweight;
	
	
	Scanner sc = new Scanner(System.in);
	
	void newregistration() {
		System.out.println("Enter the Child Name:");
		Cname = sc.next();
		System.out.println("Enter the Child weight:");
		Cweight = sc.nextFloat();
		}
	void checkhealth() {
		if(Cweight<5.0)
		{
			System.out.println("Child is underweight");
		}
		else if(Cweight>5.0 && Cweight<12) 
		{
			System.out.println("Child is healthy");
		}
		else
		{
			System.out.println("Child is over weight");
		}
	     }

}
