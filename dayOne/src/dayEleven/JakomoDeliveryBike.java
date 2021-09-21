package dayEleven;

public abstract class JakomoDeliveryBike implements IDelivery, IBike {

	public abstract int ride();

	@Override
	public int currentConsumption() {
		// TODO Auto-generated method stub
		return 0;
	}

	public abstract String getTotalPayment(int numberOfPicas);

}
