package multithreading.threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockApp {
	
	
private int counter;
private static boolean fairness = false;

private static Lock reentrantLock = new ReentrantLock(fairness);


public void increment()
{
	reentrantLock.lock();
	counter++;
	System.out.println("counter "+counter);
	reentrantLock.unlock();	
	
}
	
	
public void print()
{
	System.out.println("counter "+counter);
	reentrantLock.unlock();
}	
	
	

	public static void main(String[] args) {
		
		ReentrantLockApp wt1 = new ReentrantLockApp();

		Thread t1 = new Thread (new Runnable() {
			@Override
			public void run() {
						wt1.increment();
						wt1.print();
			}
		});
		
		Thread t2 = new Thread (new Runnable() {
			@Override
			public void run() {
						wt1.increment();
						wt1.print();
			}
		});
		
		t1.start();
		t2.start();
		
		
	}

}
