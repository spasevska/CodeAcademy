package dayTwo.dayNine.priority;

public class Test {
	public static void main(String[] args) {
		StackUsingDLL myStack = new StackUsingDLL();
		myStack.push(1).push(2).push(3).pop();
		System.out.println(myStack);
		System.out.println(myStack.peek());
		System.out.println(myStack);
		myStack.pop();
		System.out.println(myStack);
		System.out.println(myStack.size());
		System.out.println(myStack.push(null));
	}
}
