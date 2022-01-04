package multithreading.threads;

import com.sun.jdi.event.ThreadDeathEvent;


 class Runner1 implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("runner1 "+i);
			
		}
		
	}
	
}

 class Runner2 implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("runner2 "+i);
			
		}
		
	}
	
}

/*

 class Runner1 extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("runner1 "+i);
			
		}
		
	}
	
}

 class Runner2 extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("runner2 "+i);
			
		}
		
	}
	
}
 */

public class App {
	

	public static void main(String[] args) {
		
		/*

		Thread t1 = new Thread(new Runner1());
		Thread t2 = new Thread(new Runner2());
		
		t1.start();
		t2.start();
		*/
		
		/*
		
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("runner1 "+i);
					
				}
				
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("runner2 "+i);
					
				}
				
			}
		});
		
		
		
		t1.start();
		t2.start();
		
		*/
		
		Thread t1 = new Thread(new Runner1());
		Thread t2 = new Thread(new Runner2());
		
		t1.start();
		t2.start();
		
		
		  
			  try {
				t1.join();
				t2.join(); 
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		 
		
		System.out.println("hello world 1 ");
		
		
	}

}
