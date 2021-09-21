package dayEleven.homework;

public class TestDisplay {

	public static void main(String[] args) {
		
		CurvedDisplay[] display = new CurvedDisplay[] {
				new CurvedDisplay(),
				new CurvedDisplay(),
				new CurvedDisplay(),
				new CurvedDisplay(),
				new CurvedDisplay()
		};
		
		for (CurvedDisplay curvedDisplay : display) {
			curvedDisplay.turnOn();
			curvedDisplay.setBrightness(5);;
			curvedDisplay.adjustDisplaySize(33.33);
		}

	}

}
