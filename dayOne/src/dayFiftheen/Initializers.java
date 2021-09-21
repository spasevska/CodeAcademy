package dayFiftheen;

public class Initializers {
	{
		this.name = "magi";
	}
	static {
		counter = 500;
	}

	private static int counter;
	private String name;
	
	private boolean initializers;

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		Initializers.counter = counter;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isInitializers() {
		return initializers;
	}

	public void setInitializers(boolean initializers) {
		this.initializers = initializers;
	}
	
}
