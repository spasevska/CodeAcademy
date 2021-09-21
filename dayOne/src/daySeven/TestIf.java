package daySeven;

public class TestIf {
	public static void main(String[] args) {

		String name = "ivana";
		
//		if (name.contains("ana")) {
//			System.out.println("the name is some sort of ana");
//		} else if (name.contains("iva")) {
//			System.out.println("this name is some sort of iva");
//		}
		
		
//		if (name.contains("va")) {
//			System.out.println("va");
//		}
//		
//		if (name.contains("banana")) {
//			System.out.println("this is fruit");
//		} else {
//			System.out.println("this is not fruit");
//		}
		
		
		if (name.contains("dijana")) {
			System.out.println("the name is some sort of ana");
		} else if (name.contains("iva")) {
			System.out.println("this name is some sort of iva");
		} else if (name.contains("ivan")) {
			System.out.println("it is a boy");
		} else {
			System.out.println("this is strange");
		}
		
		
	}
}
