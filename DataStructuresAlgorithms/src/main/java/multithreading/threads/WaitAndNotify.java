package multithreading.threads;

public class WaitAndNotify {
	
	
	
	public   void produce() throws InterruptedException	{
		synchronized(this) {
			System.out.println("we are in produce");
			wait();
			System.out.println("finished execution in  produce");
		}
	}
	
	public  void consume() throws InterruptedException	{
		synchronized(this) {
			Thread.sleep(1000);
			System.out.println("we are in consume");
			notify();
			Thread.sleep(2000);
			System.out.println("we are in consume last line");
		}
	}
	
	

	public static void main(String[] args) {
		
		WaitAndNotify wt1 = new WaitAndNotify();

		Thread t1 = new Thread (new Runnable() {
			@Override
			public void run() {
				
					try {
						wt1.produce();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				
			}
		});
		
		Thread t2 = new Thread (new Runnable() {
			@Override
			public void run() {
			
					try {
						wt1.consume();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				
			}
		});
		
		t1.start();
		t2.start();
		
	}

}
