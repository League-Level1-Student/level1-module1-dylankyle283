package _05_vault;

import java.util.Random;

public class Vault {

	
	
		Random rand = new Random();
		
	public int code = rand.nextInt(1000000);
	
	public  boolean TryCode(int number) {
		if (number == code) {
			return true;
		}
		else {
			return false;
		
		}
		
	}
	
	
	
	
}
