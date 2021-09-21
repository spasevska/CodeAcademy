package dayTwo.daySeven.newList;

public class TestMyNewLIst {
	public static void main(String[] args) {
		MyNewList all = new MyNewList();
		all.addSortedAscending(100);
		all.addSortedAscending(200);
		all.addSortedAscending(17);
		all.addSortedAscending(150);
		all.addSortedAscending(-150);
		System.out.println(all);
		System.out.println();
	}
}
