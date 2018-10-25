//Create dead lock by creating 2 threads and run them. Have nested synchronized in each of the thread
//where each thread is trying to obtain lock on 2 string objects s1 and s2
//Two threads task1,task2 would try to access a shared resource within nested synchronized block, where each thread
//trying to acquire lock on two string objects, s1 and s2
public class CreateDeadlocks {

	String s1 = "guru";
	String s2="rugu";
	Thread task1 = new Thread() {
		public void run() {
			while(true) {
				synchronized(s1) {//let us synchronize on 2 string objs
					synchronized(s2) {
						System.out.println("task1");
					}
				}
			}
		}
	};
	Thread task2 = new Thread() {
		public void run() {
			while(true) {
				synchronized(s2) {//let us synchronize on 2 string objs
					synchronized(s1) {
						System.out.println("task12");
					}
				}
			}
		}
	};
	
	
	
	public static void main(String[] args) {
		CreateDeadlocks deadLock = new CreateDeadlocks();
		deadLock.task1.start();
		deadLock.task2.start();
	}

}
