package _04_popcorn;

import javax.swing.JOptionPane;

public class popcornMaker {
public static void main(String[] args) {
	
	String flavor = JOptionPane.showInputDialog("what flavor would you like?");
	String cookTime = JOptionPane.showInputDialog("How long do you want to cook it?");
	int cook = Integer.parseInt(cookTime);
	
	Microwave micro = new Microwave();
	Popcorn popcorn = new Popcorn(flavor);

	
	micro.putInMicrowave(popcorn);
	micro.setTime(cook);
	micro.startMicrowave();
}
}
