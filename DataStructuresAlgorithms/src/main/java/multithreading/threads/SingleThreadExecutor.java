package multithreading.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Task implements  Runnable {
		
		private int id ;

		public Task(int id) {
			super();
			this.id = id;
		}


@Override
public void run() {
	
	System.out.println("Task with id "+id+"is in work - thread is "+ Thread.currentThread().getName());
	long Duration = (long) Math.random()*5;
	try {
		TimeUnit.SECONDS.sleep(Duration);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}
	
}





public class SingleThreadExecutor {
	

	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newSingleThreadExecutor();
		
		
		for(int i=0;i<5;i++)
		{
			executor.execute(new Task(i));
			
			
			
			executor.execute(new Runnable() {
				
				@Override
				public void run() {
					System.out.println("Task with id is in work -Anand thread is "+ Thread.currentThread().getName());
					long Duration = (long) Math.random()*5;
					try {
						TimeUnit.SECONDS.sleep(Duration);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			});
			
			
			
		
			
			
		}
		
		

	}

}
