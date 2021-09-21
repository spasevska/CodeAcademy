package dayTwo.dayNine.priority;

public class PriorityQueueUsingDLL {
	private DLL list = new DLL();
	
	public int size( ) {
		return list.size();
	}
	
	public boolean enqueue(Object obj, int priority) {
		return list.addLastWithPriority(obj, priority);
	}
	
	public Object dequeue() {
		return list.removeFirst();
	}
}
