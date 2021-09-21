package dayTwo.dayNine.priority;

public class QueueUsingDLL {

	private DLL list = new DLL();
	
	public int size( ) {
		return list.size();
	}
	
	public QueueUsingDLL enqueue(Object obj) {
		list.addLast(obj);
		return this;
	}
	
	public Object dequeue() {
		return list.removeFirst();
	}
}
