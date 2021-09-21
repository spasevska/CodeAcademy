package dayTwo.daySeven.newList;

public class MyNewList {

	private Node start;	
	private int size = 0;
	
	public boolean addSortedAscending(Integer value) {
		if (value == null) {
			return false;
		}
		Node nodeToInsert = new Node();
		nodeToInsert.value = value;
		
		if (start == null) {
			start = nodeToInsert;
		} else {
			if (nodeToInsert.value <= start.value) {
				nodeToInsert.next = start;
				start = nodeToInsert;
			} else {
				Node cdn = start; 
				boolean isInserted = false;
				while (cdn.next != null) {
					if (nodeToInsert.value <= cdn.next.value) {
						nodeToInsert.next = cdn.next;
						cdn.next = nodeToInsert;
						isInserted = true;
						break;
					} else {		
						cdn = cdn.next;
					}
				}
				if (isInserted == false) {
					cdn.next = nodeToInsert;
				}
			}
		}
		size++;
		return true;
	}
	
	@Override
	public String toString() {
		String result = "[";
		Node pointer = start; 
		while (pointer != null) {
			result += pointer.value + ", ";
			pointer = pointer.next;
		}
		result += "]";
		return result;
	}
	
	public int getSize() {
		return size;
	}
	
	public int getNumberOfElements() {
		int counter = 0;
		Node pointer = start;
		while (pointer != null) {
			counter++;
			pointer = pointer.next;
		}
		return counter;
	}
	
	public boolean existValue(Integer value) {
		return false;
	}
	
	public Integer removeFirstValue(Integer  value) {
		return  null;
	}
	
//	public Integer remove
	
}


