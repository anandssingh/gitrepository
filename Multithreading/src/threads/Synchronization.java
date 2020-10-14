package threads;

public class Synchronization {
	
	static int counter = 0;
	public static synchronized void counteincrement()
	{
		++counter;
	}
	
	
	

	public static void main(String[] args) {

		Thread t1 = new Thread (new Runnable() {
			@Override
			public void run() {
				
				for (int i = 0; i < 10; i++) {
					counteincrement ();
					System.out.println("i m in thread 1 " );
				}
			}
		});
		
		Thread t2 = new Thread (new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					counteincrement ();
					System.out.println("i m in thread 2 " );
				}
			}
		});
		
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("counter is " + counter);
		
	}

}
