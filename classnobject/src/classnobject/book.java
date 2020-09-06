package classnobject;

public class book {
	int bid;
	String bname;
	int bprice;
	public book(int bid, String bname, int bprice) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.bprice = bprice;
	}
	@Override
	public String toString() {
		return "book [bid=" + bid + ", bname=" + bname + ", bprice=" + bprice + "]";
	}

}
