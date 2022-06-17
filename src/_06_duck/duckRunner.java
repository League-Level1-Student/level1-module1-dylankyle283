package _06_duck;

import javax.swing.JOptionPane;

public class duckRunner {
public static void main(String[] args) {
	
	String favoriteFood = JOptionPane.showInputDialog("what is your ducks favorite food");
	String friends = JOptionPane.showInputDialog("how many friends does your duck have");
	int numberOfFriends = Integer.parseInt(friends);
	
	
duck bird = new duck(favoriteFood,numberOfFriends);

bird.printFriendCount();
bird.quack();

Dog rufus = new Dog("Rufus",4);


rufus.printName();

rufus.bark();
}
}
