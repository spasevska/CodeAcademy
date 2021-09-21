package dayThirteen.enums;

public enum MusicNotes {
	DO("prva", 1),
	RE("vtora", 2),
	MI("treta", 3),
	FA("cetvrta", 4),
	SO("peta", 5),
	LA("sesta", 6),
	SI("sedma", 7);


	private String skala;
	private int red;
	public static final int brojNoti = 7;

	private MusicNotes(String skala, int red) {
		this.skala = skala;
		this.red = red;
	}

	public static void setBrojNotiSite() {
		for (MusicNotes note : MusicNotes.values()) {
			System.out.println(note);
		}
	}

	public String getSkala() {
		return skala;
	}

	public void setSkala(String skala) {
		this.skala = skala;
	}

	public int getRed() {
		return red;
	}

	public void setRed(int red) {
		this.red = red;
	}

	public static String setBrojNoti() {
		return "7";
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[Muzicki Noti: " + skala + ", reden broj: " + red + "]";
	}


}
