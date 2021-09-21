package dayFortheen;

public class MyThread extends Thread {
	
	private int number;

	@Override
	public void run() {
		try {
			sleep(2000);
		} catch (InterruptedException e) {
			
		}
		System.out.println("i am running in the thread" + number);
		
	}
	
	public MyThread(int number) {
		this.number = number;
	}
}
