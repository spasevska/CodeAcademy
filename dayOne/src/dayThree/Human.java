package dayThree;

public class Human {
	String color = "white";
	int age;
	
	public Human(String c, int a) {
		color = c;
		age = a;
	}

	Human() {
	}
	
	int eat(int initCalores) {
		int maxCalories = 1000;
		int remainCalories = 0;
		System.out.println("initial calories: " + initCalores);
		
		if (initCalores <= maxCalories) {
			System.out.println("I have itten calories: " + initCalores);
		} else {
			System.out.println("I have itten calories: " + maxCalories);
			remainCalories = initCalores - maxCalories;
		}
		return remainCalories;
	}
	
	int eat(String vegableType) {
		return 22;
	}
	double eat() {
		return 22;
	}
}
