package _06_duck;

public class duck {

	
	public int numberOfFriends;
	public String favoriteFood;

	public duck(String favoriteFood, int numberOfFriends) {
      	this.favoriteFood = favoriteFood;
      	this.numberOfFriends = numberOfFriends;
if (numberOfFriends == 0) {
	System.out.println("you dont have friends");
}
	
	}
	
	
	
	public void printFriendCount() {
		System.out.println(this.numberOfFriends);
	}
	
	public void quack() {
		System.out.println("Quack!");
	}
	
	
}
