package _02_cat;

public class catRunner {
public static void main(String[] args) {
	
	Cat cat = new Cat("ugly");
cat.meow();
cat.printName();
for (int i = 0; i < 89; i++) {
	cat.kill();
}

}
}
