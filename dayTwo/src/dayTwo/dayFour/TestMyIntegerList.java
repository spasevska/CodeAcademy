package dayTwo.dayFour;

public class TestMyIntegerList {

	public static void main(String[] args) {
		System.out.println("hellow");
		MyIntegerList mil = new MyIntegerList();
//		mil.printArrayHorizontally();
		mil.addLast(77);
		mil.addLast(7);
		mil.addLast(100);
		mil.addLast(13);
		mil.addLast(77);
		mil.addLast(7);
		mil.addLast(100);
		mil.addLast(13);
		mil.removeByIndex(2);
		System.out.println(mil);
		mil.removeByIndex(500);
		System.out.println(mil);
//		mil.printArrayHorizontally();
//		mil.printArrayHorizontally();
//		System.out.println(mil.removeByIndex(1));
//		mil.printArrayHorizontally();
//		System.out.println(mil.size());
		
//		mil.printArrayHorizontally();
//		mil.addFirst(2);
//		mil.printArrayHorizontally();
//		System.out.println(mil.size());

	}

}
