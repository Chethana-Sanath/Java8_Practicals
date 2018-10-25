import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ExecutorWithSingleWorkerThreadExample {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		//It returns a thread pool with single worker thread. Single thread is used for executing * tasks.
		//So, We are using Executor F/W to return single thread instance for our purpose, we need not
		//worry about creating and managing the thread here. We still have to write logic for the task to be performed
			
		//Let us write task1
		Runnable task1 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("task1");
				try {
					Thread.sleep(10000);
				}
				catch(InterruptedException ie) {}
			}
		};
		
		//Let us write one more task using Lambda
		Runnable task2 = () -> System.out.println("task2"); 
		
		//Two tasks are created above and we further need to submit them for them to execute
		executorService.submit(task1);
		executorService.submit(task2);
		executorService.shutdown();//this does not accept any new submission of tasks and waits for currently executing
		//threads to complete
	}
	
		
	
}
