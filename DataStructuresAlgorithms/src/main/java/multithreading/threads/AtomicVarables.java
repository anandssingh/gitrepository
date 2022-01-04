package multithreading.threads;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicVarables {
	
	
	//private int counter = 0;
	
	private AtomicInteger counter = new AtomicInteger(0);
	
	public void increment()
	{
		for(int i=0;i<10;i++)
		{
			counter.incrementAndGet();
		}
		
	}

	public static void main(String[] args) throws InterruptedException {
		
		
		AtomicVarables av = new AtomicVarables();
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				av.increment();
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				av.increment();
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("counter "+av.counter);
	}

}
