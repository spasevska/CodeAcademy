package dayEleven;

public class TestBike {

	public static void main(String[] args) {
		BlueJakomoDeliveryBike b4 = new BlueJakomoDeliveryBike();
		b4.thisIsSomethingSpecial();
		
		JakomoDeliveryBike b3 = b4;
		b3.getTotalPayment(2);
		
		IDelivery b2 = b3;
		b2.getCurrentLoad();
		
		IBike b1 = b3;
		b1.ride();
		

	}

}
