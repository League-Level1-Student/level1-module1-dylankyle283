package _05_vault;

import java.util.Random;

public class Vault {

	
	
	
		Random rand = new Random();
		
	int code = rand.nextInt(1000000);
	
	public  boolean TryCode(int number) {
		if (number == code) {
			return true;
		}
		else {
			return false;
		
		}
		
	}
	
	
	
	public class JamesBond {
		public int findCode() {
			
			for (int i = 0; i < 1000000; i++) {
				if (i == code) {
					return i;
				}
				
			
			}
		;
		return code;
			
			
			

		}
		}
}
