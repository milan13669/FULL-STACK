package com.telstra.emppack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee p1 = new Programmer(678, "Milan", 10000, 2, "reactjs" );
		  Employee m1 = new Manager(909, "akash", 15000, "HR",8 );
		  int a, b;
		  String pg,mg;
		  a = (int) p1.calcNetSal();
		  b = (int) m1.calcNetSal();
		  pg=p1.getDetails();
		  mg=m1.getDetails();
		  
		  System.out.println("Programmer Details:"+pg);
		  System.out.println("Manager Details:"+mg);
		  System.out.println("Salary of programmer : " + a);
		  System.out.println("Salary of manager : " + b);

	}

}
