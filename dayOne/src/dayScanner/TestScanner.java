package dayScanner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestScanner {
	public static void main(String[] args) throws FileNotFoundException {
		//		File file = new File("");
		//		Scanner scanner = new Scanner(System.in);
		//		System.out.print("please enter integer number a: ");
		//		
		//		String line = scanner.nextLine();
		//		Integer a = 0;
		//		
		//		while (true) {
		//			System.out.println("please enter integer number a: ");
		//			String line = scanner.nextLine();
		//			
		//			try {
		//			a = Integer.parseInt(line);
		//			break;
		//		} catch (Exception e) {
		//			System.out.println(line + "is not a valid integer number");
		//			System.out.println("please try again or type exit to close");
		//		}
		//		}
		//		System.out.println("you have extered a: " + a);

		//		try {
		//			Integer a = Integer.parseInt(line);
		//		} catch (Exception e) {
		//			
		//			System.out.println();
		//			System.err.println();
		//			e.printStackTrace();
		//			throw new RuntimeException("man this is not a number", e);
		//		} finally {
		//			System.out.println("this will be performed in any case");
		//			scanner.close();
		//		}


		//		String line = scanner.nextLine();
		//		Integer a = Integer.parseInt(line);
		//		System.out.println(line);
		//		scanner.close();
		
		calculator();
//		try {
//			FileInputStream fis = new FileInputStream(new File("C:\\Users\\User\\Desktop\\CodeAcademy"));
//		} catch (FileNotFoundException e1) {
////			FileInputStream fis = new FileInputStream(new File("C:\\Users\\User\\Desktop\\CodeAcademy"));
//		}
	}


	public static void calculator() {
		

		Scanner scanner = new Scanner(System.in);
		Integer a = 0;

		while (true) {
			System.out.println("please enter integer number a: ");
			String line = scanner.nextLine().trim();

			try {
				a = Integer.parseInt(line);
				break;
			} catch (Exception e) {
				System.out.println(line + "is not a valid integer number");
				System.out.println("please try again or type exit to close");
				throw new RuntimeException(line + " is not a number");
			}
		}
		System.out.println("you have extered a: " + a);
	}


}
