package dayTwo.proba;

public class TestProba {
	
	public static void main(String[] args) {
		Proba mk = new Proba(5);
		mk.enqueue(1);
		mk.enqueue(2);
		mk.enqueue(3);
		System.out.println(mk.enqueue(3));
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
		System.out.println();
		
		System.out.println(mk.dequeue());
		System.out.println(mk);
		System.out.println(mk.size());
		System.out.println();
	}
}
