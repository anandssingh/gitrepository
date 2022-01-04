package multithreading.threads;

public class SynchronizationCustomeObject {
	
	static int counter1 = 0;
	static int counter2 = 0;
	
	public static Object lock1 =new Object();
	public static Object lock2 =new Object();
	
	public static  void counteincrement1()	{
		synchronized(lock1) {
			++counter1;
		}
	}
	public static  void counteincrement2()	{
		synchronized(lock2) {
			++counter2;
		}
	}
	
	

	public static void main(String[] args) {

		Thread t1 = new Thread (new Runnable() {
			@Override
			public void run() {
				
				for (int i = 0; i < 10; i++) {
					counteincrement1 ();
					//System.out.println("i m in thread 1 " );
				}
			}
		});
		
		Thread t2 = new Thread (new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					counteincrement2 ();
					//System.out.println("i m in thread 2 " );
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
		
		System.out.println("counter is " + counter1);
		System.out.println("counter is " + counter2);
	}

}
