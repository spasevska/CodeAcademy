package daySix.instaceof;

public class TestDrink {

	public static void main(String[] args) {
		
		Wuiskey  w1 = new Wuiskey();
		System.out.println(w1.isAlocoholic());
		
		Drink d1 = w1;
		System.out.println(d1.price);
		testObject(d1);
		
		Object o1 = w1;
		System.out.println(o1.hashCode());
		System.out.println(d1.hashCode());
		System.out.println(w1.hashCode());
		testObject(o1);
		
		
//		AlcoholicDrink a1 = new AlcoholicDrink();
//		a1.letsDrink();
//		testObject(a1);
//		
//		AlcoholicDrink a2 = new Wuiskey();
//		
//		testObject(a2);
//		System.out.println(a2.isAlocoholic());
//		
//		Wuiskey w1 = new Wuiskey();
//		
//		Drink d2 = a1;
//		Object o3 = d2;
//		
//		testObject(a1);
//		testObject(a2);
//		testObject(d2);
//		testObject(o3);
	}
	
	public static void testObject(Object o) {
//		System.out.println(o instanceof AlcoholicDrink);
//		System.out.println(o instanceof Drink);
//		System.out.println(o instanceof Object);
		
//		System.out.println(o instanceof Wuiskey);
	
		if (o instanceof Wuiskey) {
			Wuiskey wx = (Wuiskey) o;
			boolean isAlcoh = wx.isAlocoholic();
			System.out.println(isAlcoh);
			System.out.println(wx.price);
			System.out.println(wx.brand);
			System.out.println(wx.hashCode());
		}
	
	}

}
