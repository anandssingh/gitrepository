package multithreading.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SemaphoreApp {
	
	
	
	
	Semaphore semaphore =new Semaphore(3,true);
	
	public void downloadData() throws InterruptedException
	{
		
			semaphore.acquire();
			download();
			semaphore.release();
	
	}
	
	public void download() throws InterruptedException
	{
		Thread.sleep(3000);
		System.out.println("i m in semaphore");
	}
	

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newCachedThreadPool();
		SemaphoreApp semaphoreApp = new SemaphoreApp();
		
		for(int i=0;i<12;i++) {
			executorService.execute(new Runnable() {
				public void run() {
					try {
						semaphoreApp.downloadData();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			});
		}
		
	
		
	}

}
