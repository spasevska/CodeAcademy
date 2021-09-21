package dayFiftheen;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("please enter you name. Name: ");
			String name = scanner.nextLine();
			System.out.print("please enter your lastname. Lastname: ");
			String lastname = scanner.nextLine();
			System.out.println("hi " + name);
			break;
//			String line = scanner.nextLine();
//			System.out.println(line);
//			if(line.trim().equalsIgnoreCase("exit")) {
//				System.out.println("app will be terminated");
//				break;
//			}
//			if(line.contains("ana")) {
//				continue;
//			}
//			System.out.println(line);
		}
		scanner.close();
	}

}
