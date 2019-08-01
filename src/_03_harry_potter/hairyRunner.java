package _03_harry_potter;

public class hairyRunner {
public static void main(String[] args) {
	
	HarryPotter pot = new HarryPotter();
	
	pot.makeInvisible(true);
	
	pot.spyOnSnape();
	pot.makeInvisible(false);
	pot.castSpell("stupefy");
}
}
