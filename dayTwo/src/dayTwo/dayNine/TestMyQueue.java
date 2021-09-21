package dayTwo.dayNine;

public class TestMyQueue {

	public static void main(String[] args) {
		MyQueue mk = new MyQueue(5);
		mk.enqueue(1);
		mk.enqueue(2);
		mk.enqueue(3);
		mk.enqueue(1);
		mk.enqueue(2);
		mk.enqueue(3);
		mk.enqueue(1);
		mk.enqueue(2);
		mk.enqueue(3);
		mk.enqueue(1);
		mk.enqueue(2);
		mk.enqueue(3);
		System.out.println(mk);
		System.out.println(mk.size());
		System.out.println();
		
		System.out.println(mk.dequeue());
		System.out.println(mk);
		System.out.println(mk.size());
		System.out.println();
		
		System.out.println(mk.dequeue());
		System.out.println(mk);
		System.out.println(mk.size());
		System.out.println();

		
		System.out.println(mk.dequeue());
		System.out.println(mk);
		System.out.println(mk.size());


	}

}
