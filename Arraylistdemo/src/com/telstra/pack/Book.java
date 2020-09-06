package com.telstra.pack;

public class Book {
	private int bid;
	private String bname;
	private int bprice;
	public Book(int bid, String bname, int bprice) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.bprice = bprice;
	}
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + ", bprice=" + bprice + "]";
	}
	
	

}
