import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ExecutorWithMultipleWorkerThreads {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(2);//It returns a thread pool with 2 threads
		
		Runnable task1 = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Started task1");
				try {
					Thread.sleep(1000);
				}
				catch(InterruptedException e) {}
				System.out.println("Ends task1");
			}
		};
		
		Runnable task2 = ()->{
			System.out.println("Started task2");
			try {
			Thread.sleep(1000);
			}
			catch(InterruptedException e) {}
			System.out.println("Ends task2");
		};

		Runnable task3 = ()->{
			System.out.println("Started task3");
			try {
			Thread.sleep(1000);
			}
			catch(InterruptedException e) {}
			System.out.println("Ends task3");
		};
		
		executorService.submit(task1);
		executorService.submit(task2);//tasks 1 and 2 are executed by 2 worker threads created above. Once the job is done for task1 and task2, one
		//of these worker threads is reused for performing task3
		executorService.submit(task3);
		executorService.shutdown();
	}

}
