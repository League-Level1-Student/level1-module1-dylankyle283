package _06_duck;

public class Dog {

	
	public int numberOfFriends;
	public String Name;



	public Dog(String Name, int numberOfFriends) {
      	this.Name = Name;
      	this.numberOfFriends = numberOfFriends;
if (numberOfFriends == 0) {
	System.out.println("you dont have friends");
}
	
	}
	
	
	public void printName() {
		System.out.println(this.Name);
	}
	
	public void bark() {
		System.out.println("woof");
	}









}
