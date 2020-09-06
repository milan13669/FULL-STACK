package com.telstra.tour;

import java.util.Scanner;

public class state {
    private String Sname;
    private String Cname1;
    private String Cname2;
    private String Cname3;
    
    Scanner sc = new Scanner(System.in);
    
    void Addstate() {
        System.out.print("Enter State Name: ");
        Sname = sc.next();
        System.out.print("Enter city one Name: ");
        Cname1 = sc.next();
        System.out.print("Enter city Two Name: ");
        Cname2 = sc.next();
        System.out.print("Enter city Three Name: ");
        Cname3 = sc.next();
        
    }
    
    void showCity() {
        System.out.println(Sname + ":" + Cname1 + "," + Cname2 + "," + Cname3);
    }
    boolean search(String acn) {
        if (Sname.equals(acn)) {
            showCity();
            return (true);
        }
        return (false);
    }

}
