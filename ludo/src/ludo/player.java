package ludo;

public class player {
	private dice d1;
	private dice d2;
	
	public player() {
		super();
		d1=new dice();
		d2=new dice();
	}
	public int play() {
		return(d1.roll() + d2.roll());
	}
	public dice getD1() {
		return d1;
	}
	public dice getD2() {
		return d2;
	}
	
	

}
