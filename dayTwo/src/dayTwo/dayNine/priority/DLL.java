package dayTwo.dayNine.priority;


public class DLL {
	private Node start = null;
	private Node end = null;
	private Integer size = 0;

	public Node getStart() {
		return start;
	}
	public Node getEnd() {
		return end;
	}

	public Integer size() {
		return this.size;
	}
	public boolean contains(Object e) {
		if(size == 0)
			return false;

		for(Node ptr = start; ptr != null; ptr = ptr.next) {
			if(ptr.value.equals(e))
				return true;
		}
		return false;
	}

	public boolean addFirst(Object e){
		return addFirst(e, 1);
	}
	public boolean addFirst(Object e, int priority){
		if(e.equals(null))
			return false;

		Node newNode = new Node(e, priority);
		if(start == null && end == null) {
			start = newNode;
			end = newNode;
		}else {
			newNode.next = start;
			start.previous = newNode;
			start = newNode;

		}
		size++;
		return true;
	}
	public boolean addLast(Object e) {
		return addLast(e, 1);
	}

	public boolean addLast(Object e, int priority) {
		if(e == null)
			return false;

		Node newNode = new Node(e, priority);
		if(start == null && end == null) {
			start = newNode;
			end = newNode;
		}
		else {
			newNode.previous = end;
			end.next = newNode;
			end = newNode;
		}
		size++;
		return true;

	}
	public Object removeFirst() {
		Object value = null;
		if(size < 1) {
			value = null;
		} else if(size == 1) {
			value = start.value;
			end = null;
			start = null;
		} else {
			value = start.value;
			start.next.previous = null;
			start = start.next;
		}
		size--;
		return value;
	}

	public Object removeLast() {
		Object value = null;
		if(size < 1) {
			value = null;
		} else if(size == 1) {
			value = end.value;
			end = null;
			start = null;
		}else {
			value = end.value;
			end.previous.next = null;
			end = end.previous;
		}
		size--;
		return value;
	}
	public boolean remove(Object e) {
		if(!contains(e))
			return false;

		if(size < 1 || e.equals(null))
			return false;

		if(size == 1) {
			end = null;
			start = null;
		}else {
			for(Node ptr = start; ptr != null; ptr = ptr.next) {
				if(ptr.value.equals(e)) {
					if(ptr.equals(start)) {
						removeFirst();
					}else if(ptr.equals(end)) {
						removeLast();
					}else {
						ptr.previous.next = ptr.next;
						ptr.next.previous = null;
					}
				}
			}
		}
		size--;
		return true;
	}

	public boolean addLastWithPriority(Object e, int priority) {
		if (e == null) {
			return false;
		}
		Node newNode = new Node(e, priority);
		if(start == null && end == null) {
			start = newNode;
			end = newNode;
		} else {
			if (priority >= end.priority) {
				addLast(e, priority);
			} else if (priority < start.priority) {
				addFirst(e, priority);
			} else {
				Node pointer = end.previous;
				while (true) {
					if (priority >= pointer.priority) {
						newNode.previous = pointer;
						newNode.next = pointer.next;
						pointer.next.previous = newNode;
						pointer.next = newNode;
						break;
					} else {
						pointer = pointer.previous;
					}
				}
			}	
		}
		size++;
		return true;
	}

	@Override
	public
	String toString() {
		String s = "[";
		for(Node ptr = this.start; ptr != null; ptr =  ptr.next) {
			if(ptr.next == null) {
				s += ptr.value;
			}else{
				s += (ptr.value + ", ");

			}
		}return s += "]";
	}
}
