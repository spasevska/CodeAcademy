package Algorythms;

public class Treta {
	private Node start;
	private Node end;
	private int size = 0;

	public int getSize() {
		return this.size;
	}
	

	public boolean addFirst(int value) {
		Node newNode = new Node(value);
		if (start == null && end == null) {
			start = newNode;
			end = newNode;
		} else {
			Node second = start;
			Node first = newNode;
			first.next = second;
			second.previous = first;
			start = first;
		}
		size++;
		return true;
	}


	public boolean addLast(int value) {
		Node newNode = new Node(value);
		if (start == null && end == null) {
			start = newNode;
			end = newNode;
		} else {
			end.next = newNode;
			newNode.previous = end;
			end = newNode;
		}
		size++;
		return true;
	}
	
	public void removeFirst(){
        start = start.next;
        start.previous = null;
    }

    public void removeLast(){
        end.previous.next = null;
    }

	@Override
	public String toString() {
		String tmpString = "[";
		Node s = start;
		while (s != null) {
			tmpString+= s.value + ", ";
			s = s.next;
		}
		tmpString += "]";
		return tmpString;
	}


	public String toStringReverse() {
		String tmpString = "[";
		Node s = end;
		while (s != null) {
			tmpString+= s.value + ", ";
			s = s.previous;
		}
		tmpString += "]";
		return tmpString;


	}
	
}
