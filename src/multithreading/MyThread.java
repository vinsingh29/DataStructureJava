package multithreading;

public class MyThread extends Thread {

	public void run() {

		for (int i = 0; i < 10; i++) {

			System.out.println("Child Thread");
		}
	}


	
	public static void main(String[] args) {

	MyThread t = new MyThread();
		//t.start();
		t.run();

		for (int i = 0; i < 5; i++) {
			System.out.println("In Main Thread");
		}
		
		
		

	}

}
