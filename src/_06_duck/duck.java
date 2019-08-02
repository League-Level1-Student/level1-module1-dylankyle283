package _06_duck;

public class duck {

	
	public int numberOfFriends;
	public String favoriteFood;

	public void Duck(String favoriteFood, int numberOfFriends) {
      	this.favoriteFood = favoriteFood;
      	this.numberOfFriends = numberOfFriends;
if (numberOfFriends == 0) {
	System.out.println("you dont have friends");
}
	
	}
}
