package dayNine;

public class TestIntegerArray {

	public static void main(String[] args) {
		Integer[] integers1 = new Integer[5];
		integers1[0] = 1;
		integers1[1] = 2;
		integers1[2] = 3;
		integers1[3] = 4;
		integers1[4] = 5;
		Integer[] integers2 = new Integer[] {new Integer(1), 2, 3};
		String[] name = new String[] {"ane", "pero", "goce"};
		
		Integer[] ints = new Integer[5];
		
		System.out.println(ints[0]);
//		System.out.println(ints[6]);
//		System.out.println(ints[-1]);
		
		System.out.println(name[1].toUpperCase());
		name[1] = null;
//		System.out.println(name[1].toUpperCase());
		
		Car[] cars = new Car[3];
		int[] smallInts = new int[10];
		
	}

}
