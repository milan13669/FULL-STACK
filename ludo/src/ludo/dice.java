package ludo;

import java.util.Random;

public class dice {

	public int roll() {
		Random rand = new Random();
		return((int)rand.nextInt(5)+1);
		
	}

}
