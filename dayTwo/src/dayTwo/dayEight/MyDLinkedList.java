package dayTwo.dayEight;

public class MyDLinkedList {
  private DNode start;
  private DNode end;
  private int size = 0;
  
  public int getSize() {
    return this.size;
  }
  
  public boolean addFirst(int value) {
    DNode newNode = new DNode(value);
    if (start == null && end == null) {
      start = newNode;
      end = newNode;
    } else {
      //TAKE ONE
//      newNode.next = start;
//      start = newNode;
//      newNode.next.previous = newNode;
      
      //TAKE TWO
//      start.previous = newNode;
//      start.previous.next = start;
//      start = newNode;
      
      //TAKE THREE
      DNode second = start;
      DNode first = newNode;
      first.next = second;
      second.previous = first;
      start = first;
    }
    size++;
    return true;
  }
  
  
  public boolean addLast(int value) {
    DNode newNode = new DNode(value);
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
  
  public boolean containsValue(int val) {
	  DNode node = start;
	  while (node != null) {
		if (node.value == val) {			
			return true;
		} else {			
			node = node.next;
		}
	}
    return false;
  }
  
  @Override
  public String toString() {
    String tmpString = "[";
    DNode s = start;
    while (s != null) {
      tmpString+= s.value + ", ";
      s = s.next;
    }
    tmpString += "]";
    return tmpString;
  }
  
  
  public String toStringReverse() {
	  String tmpString = "[";
	  DNode s = end;
	  while (s != null) {
		  tmpString+= s.value + ", ";
		  s = s.previous;
	  }
	  tmpString += "]";
	  return tmpString;
  }
  
  //TODO this is for homework 
  public boolean removeValue(int vfr) {
	  return false;
  }
  
}
