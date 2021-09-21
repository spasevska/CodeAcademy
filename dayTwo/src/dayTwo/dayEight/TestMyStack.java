package dayTwo.dayEight;

public class TestMyStack {

	public static void main(String[] args) {
		MyStack s = new MyStack(10);
		s.push(10);
		s.printStack();
		s.push(2);
		s.push(55);
		s.push(77);
		s.printStack();
		s.pop();
		s.printStack();
		System.out.println(s.size());

	}

}
