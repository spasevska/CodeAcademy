package daySeven;

public class TestSwitch {

	public static void main(String[] args) {
		int counter = 1;
		
		switch (counter) {
		case 1:
			System.out.println("the counter has value 1");
			int a = 55;
			System.out.println(a);
			break;
		case 2:
			System.out.println("the counter has value 2");
			break;
		case 3:
			System.out.println("the counter has value 3");
			break;
		default:
			System.out.println("the counter has value different than 1 or 2");
			break;
		}
		
		
		
		
//		if (counter == 1) {
//			System.out.println("the counter has value 1");
//		} else if (counter == 2) {
//			System.out.println("the counter has value different than 2");
//		} else {
//			System.out.println("the counter has value different than 1 or 2");
//		}

	}

}
