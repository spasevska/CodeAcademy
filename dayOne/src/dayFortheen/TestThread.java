package dayFortheen;

public class TestThread {

	public static void main(String[] args) throws InterruptedException {
		MyThread t = new MyThread(1);
		t.run();
		
		new MyThread(2).start();
		new MyThread(3).start();
		new MyThread(4).start();
		new MyThread(5).start();
		Thread.sleep(10000);
		System.out.println("i am ruuning in main");

	}

}
