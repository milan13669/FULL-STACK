package com.telstra.tour;

import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("How Many State you want to enter: : ");
	    int n = sc.nextInt();
	    state C[] = new state[n];
	    for (int i = 0; i < C.length; i++) {
	        C[i] = new state();
	        C[i].Addstate();
	    }
	    System.out.println("Enter name of state to be searched: ");
	    
        String acn = sc.next();
        boolean found = false;
        for (int i = 0; i < C.length; i++) {
            found = C[i].search(acn);
            if (found) {
                break;
            }
        }
        if (!found) {
            System.out.println("Search Failed..State Not Exist..");
        }
        

	}

}
