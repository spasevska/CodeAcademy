package dayEleven.practice;

public class TestHuman {

	public static void main(String[] args) {
		
		Makedonec[] mak = new Makedonec[5];
		Makedonec m1 = new Makedonec();
		IHuman h1 = m1;
		mak[0] = mak[1] = mak[2] = mak[3] = mak[4] = m1;
		
		for (Makedonec makedonec : mak) {
			System.out.println(" can see in dark: " + makedonec.seeInDark());
			makedonec.curse(3, "politics");
		}
		
		IHuman[] humans = new IHuman[5];
		for (int i = 0; i < mak.length; i++) {
			humans[i] = mak[i];
		}
		

	}

}
