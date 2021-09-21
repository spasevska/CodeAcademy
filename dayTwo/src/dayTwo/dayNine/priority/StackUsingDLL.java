package dayTwo.dayNine.priority;

public class StackUsingDLL {

	private DLL list = new DLL();
	
	public StackUsingDLL push(Object obj) {
		list.addLast(obj);
		return this;
	}
	
	public Object pop() {
		 return list.removeLast();
	}
	
	public Object peek() {
		return list.getEnd().value;
	}
	
	public int size() {
		return list.size();
	}
	
	@Override
	public String toString() {
		return list.toString();
	}
	
}
