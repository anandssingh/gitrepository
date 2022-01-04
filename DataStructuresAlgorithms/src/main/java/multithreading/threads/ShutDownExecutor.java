package multithreading.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;



class work implements  Runnable {
		
		private int id ;
		public work(int id) {
			this.id = id;
		}

@Override
public void run() {
	
	System.out.println("Task with id "+id+"is in work - thread is "+ Thread.currentThread().getId());
	long Duration = (long) Math.random()*5;
	try {
		TimeUnit.SECONDS.sleep(Duration);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}
	
}
	
public class ShutDownExecutor {

	public static void main(String[] args) throws InterruptedException {
		
		
		ExecutorService executor = Executors.newFixedThreadPool(2);
		for(int i=0;i<5;i++)
		{
			executor.execute(new Task(i));
		}

		executor.shutdown();
		
		if(!executor.awaitTermination(1000, TimeUnit.MILLISECONDS)) {
			
			executor.shutdownNow();
			
		}
		
	}
	
	
	
	
	
	
	
	

}
