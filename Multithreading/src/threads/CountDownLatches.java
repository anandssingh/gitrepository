package threads;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Workers implements Runnable {

	private int id;
	private CountDownLatch latch;
	private Random random;
	
	public Workers(int id, CountDownLatch latch) {
		this.latch = latch;
		this.id = id;
		this.random = new Random();
	}

	public void run() {
		doWork();
		latch.countDown();
	}

	public void doWork() {
		try {
			System.out.println("Thread with ID "+this.id+" starts working...");
			Thread.sleep(this.random.nextInt(1000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}




public class CountDownLatches {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newSingleThreadExecutor();
		CountDownLatch latch = new CountDownLatch(5);

		for (int i = 0; i < 5; i++)
			executorService.execute(new Workers(i,latch));
	
		try {
			latch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("All the prerequisites are done...");
		
		executorService.shutdown(); 
		
		
	}
}
