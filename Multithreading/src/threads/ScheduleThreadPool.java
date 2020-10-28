package threads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class StockMarketUpdater implements Runnable{
	
	public void run()
	{
		System.out.println("downloading stock from the web");
	}
	
	
}

public class ScheduleThreadPool {

	public static void main(String[] args) {

		ScheduledExecutorService  scheExecutorService = Executors.newScheduledThreadPool(1);
		
		scheExecutorService.scheduleAtFixedRate(new StockMarketUpdater(), 1000, 2000, TimeUnit.MILLISECONDS);
		
		
		
	}

}
