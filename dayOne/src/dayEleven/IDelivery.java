package dayEleven;

public interface IDelivery extends IBike{	
	public abstract int getCurrentLoad();
	int getNumberOfEmptySlotsBasket();
	
	@Override
	default int currentConsumption() {
		// TODO Auto-generated method stub
		return 10;
	}
	
}
