package dayTwo;

public class TestAnimal {
	Member member;
	public TestAnimal(Member member) {
		this.member = member;
	};
	
	public static void main(String[] args) {
		Member myMember = new Member("Dijana", "light", 10, 1);
		TestAnimal myTestAnimal = new TestAnimal(myMember);
		System.out.println(myTestAnimal.member.getName());
		System.out.println(myTestAnimal.member.getType());
		System.out.println(myTestAnimal.member.getLevel());
		System.out.println(myTestAnimal.member.getRank());
	}
}

class Member {
	private String name;
	private String type;
	private int level;
	private int rank;
	
	public Member(String name, String type, int level, int rank) {
		this.name = name;
		this.type = type;
		this.level = level;
		this.rank = rank;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getType() {
		return this.type;
	}
	
	public int getLevel() {
		return this.level;
	}
	
	public int getRank() {
		return this.rank;
	}
}