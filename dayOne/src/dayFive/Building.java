package dayFive;

public class Building {
	private int numOfApartments;
	private int numOfRentedApartments;
	
	/**
	 * 
	 * @param numOfApartments, min value 10, max value 20. If less then 10 value is set to 10.
	 * @param numOfRentedApartments, min 0, max total number of apartments
	 */
	public Building(int numOfApartments, int numOfRentedApartments) {
		super();
		if (numOfApartments < 10) {
			this.numOfApartments = 10;
		}
		this.numOfApartments = numOfApartments;
		this.numOfRentedApartments = numOfRentedApartments;
	}
	
	/**
	 * It accepts no arguments
	 * @return true if there is no apartment available, false otherwise
	 */
	public boolean areAllApartmentsOcupied() {
		if (numOfApartments == numOfRentedApartments) {
			return true;
		} else {
			return false;
		}
	}

	public int getNumOfApartments() {
		return numOfApartments;
	}

	/*
	public void setNumOfApartments(int numOfApartments) {
		this.numOfApartments = numOfApartments;
	}
	*/

	public int getNumOfRentedApartments() {
		return numOfRentedApartments; // ova mi vrakja broj na iznajmeni stanovi
	}

//	public void setNumOfRentedApartments(int numOfRentedApartments) {
//		this.numOfRentedApartments = numOfRentedApartments;
//	}


	
	
}
