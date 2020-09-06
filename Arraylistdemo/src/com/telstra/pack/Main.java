package com.telstra.pack;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList a1 = new ArrayList();
       a1.add(10);
       a1.add(15.7985);
       a1.add('c');
       a1.add("java");
       System.out.println(a1);
       
       List<String> a2 = new ArrayList<String>();
       a2.add("meer");
       a2.add("johouhou");
       System.out.println(a2);
       //works based as arrays
       a2.add(1,"milan");
       System.out.println(a2);
       a2.remove(2);
       System.out.println(a2);
       ArrayList<String> subarr = new ArrayList<String>();
       subarr.add("one");
       subarr.add("two");
       a2.addAll(1, subarr);
       System.out.println(a2);
       System.out.println(a2.get(2));
       
       for (String str:a2)
       {
    	   System.out.println(str+" ");
       }
       
       
       
       List<Book> blist = new ArrayList<Book>();
       blist.add(new Book(10,"java",300));
       blist.add(new Book(104,"jtytava",3600));
       blist.add(new Book(1078,"jahtva",3000));
       Iterator<Book> it1 = blist.iterator();
       
       while(it1.hasNext())
       {
       
       
	}

}
