package OsnoviVoJavaTest;

public class Programmer implements IPerson {
	
	public String name, lastname;
	public int years;
	
	public Programmer(String name, String lastname, int years) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.years = years;
	}
	
	
	public void personInfo() {
		System.out.println("My full name is: " + name + "\s" + lastname + " and I am " + years + " years old");
		
	}
	
	public static void main(String[] args) {
		Programmer info = new Programmer("Dijana", "Spasevska", 32);
		info.personInfo();
	}
	
}
