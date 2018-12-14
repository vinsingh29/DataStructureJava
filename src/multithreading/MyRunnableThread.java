package multithreading;

public class MyRunnableThread implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {

			System.out.println("Child Thread");
		}

	}

	public static void main(String[] args) {

		// Test Runnable Interface
		MyRunnableThread r = new MyRunnableThread();
		Thread t = new Thread(r);
		t.start();

		for (int i = 0; i < 10; i++) {

			System.out.println("main Thread");
		}
	}

}
