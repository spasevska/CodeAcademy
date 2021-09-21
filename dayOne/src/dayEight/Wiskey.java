package dayEight;

public class Wiskey {
	public boolean isAlcoholic = true;

	public boolean isLegalAge(int years) {
		if (years >= 18) {
			return true;
		} else {
			return false;
		}
	}
}
