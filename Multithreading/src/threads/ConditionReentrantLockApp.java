package threads;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Worker  {
	
	private Lock reentrantLock = new ReentrantLock();
	private Condition condition = reentrantLock.newCondition();
	
	public   void producer() throws InterruptedException	{
		
		reentrantLock.lock();			
		System.out.println("i m in producer  ");
		condition.await();
		System.out.println("i m again in producer ");
		reentrantLock.unlock();			
	}
	
	public  void consumer() throws InterruptedException	{
		
		reentrantLock.lock();			
		System.out.println("i m in consumer  ");
		condition.signal();
		reentrantLock.unlock();		
	}
	
}

 public class ConditionReentrantLockApp {
	
	
	 

	public static void main(String[] args) {
		
		Worker worker = new Worker();
		

		Thread t1 = new Thread (new Runnable() {
			@Override
			public void run() {
				try {
					worker.producer();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		Thread t2 = new Thread (new Runnable() {
			@Override
			public void run() {
				try {
					worker.consumer();
				} catch (InterruptedException e) {
					e.printStackTrace();
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
	 
		  System.out.println("i m in main method ");
		
	}

}
