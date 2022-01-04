package multithreading.threads;

import java.util.ArrayList;

public class ProducerConsumer {
	
	
	 private ArrayList<Integer> arrayBox = new ArrayList<Integer> (); 
	 private int upperLimit = 5;
	 private int lowerLimit = 0;
	 private int value = 0;
	 
	 private Object lock = new Object();
	
	
	
	
	
	public   void producer() throws InterruptedException	{
		
		synchronized(lock) {
			
			while(true) {
				Thread.sleep(500);
				if(arrayBox.size()<=upperLimit) {
					System.out.println("produce adding " + value);
					arrayBox.add(++value);
					//lock.notify();
				}
				else {
					//whilevalue = false;
					//System.out.println("produce else ");
					//System.out.println("produce adding " + arrayBox.toString());
					lock.notify();
					lock.wait();
				}
			}
			
		}
	}
	
	
	
	
	public  void consumer() throws InterruptedException	{
		
		synchronized(lock) {
			
			while(true) {
				Thread.sleep(500);
				if(arrayBox.size()!=lowerLimit) {
					arrayBox.remove(--value);
					System.out.println("consumer removing " + value);
					//lock.notify();
				}
				else {
					//System.out.println("consumer else ");
					//System.out.println("produce adding " + arrayBox.toString());
					lock.notify();
					lock.wait();
				}
			}
		}
	}
	
	

	public static void main(String[] args) {
		
		ProducerConsumer wt1 = new ProducerConsumer();

		Thread t1 = new Thread (new Runnable() {
			@Override
			public void run() {
				
					try {
						wt1.producer();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				
			}
		});
		
		Thread t2 = new Thread (new Runnable() {
			@Override
			public void run() {
			
					try {
						wt1.consumer();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				
			}
		});
		
		t1.start();
		t2.start();
		
		
	}

}
