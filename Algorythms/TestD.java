package Algorythms;

public class TestD {

	public static void main(String[] args) {
		
		Treta dll =  new Treta();
		dll.addFirst(5);
		dll.addFirst(15);
		dll.addFirst(15);
		dll.addLast(20);
		dll.addLast(30);
		dll.addLast(40);
		System.out.println(dll);
		System.out.println(dll.getSize());
		dll.removeFirst();
		dll.removeLast();
		System.out.println(dll);
		

	}

}
