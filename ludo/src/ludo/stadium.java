package ludo;

public class stadium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		player p1 = new player();
		player p2 = new player();
		
		int p1Score = p1.play();
		System.out.println("P1 SCORE IS :"+p1Score);
		int p2Score = p2.play();
		System.out.println("P2 SCORE IS :"+p2Score);
		
		if(p1Score>p2Score)
		{
			System.out.println("P1 won the game");
		}
		else
		{
			System.out.println("P2 won the game");
		}
		

	}

}
