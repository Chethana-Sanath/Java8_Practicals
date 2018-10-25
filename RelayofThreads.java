
public class RelayofThreads {

	int i = 2;
	int j=1;
	Thread task1 = new Thread() {
		
		@Override
		public void run() {
			//Prints all even no.s
			System.out.println(i);
			//i=i+2;
		}
	};
	
	Thread task2 = new Thread() {
		
		@Override
		public void run() {
			//Prints all even no.s
			System.out.println(j);
			//j=j+2;
			
		}
	};
		
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		RelayofThreads object = new RelayofThreads();
		try {
			//while(true) {
			for(int i=0;i<10;i++) {
				if(!object.task1.isAlive())
					object.task1.start();
				else
					object.task1.run();
				//object.task1.join();
				if(!object.task2.isAlive())
					object.task2.start();
				else
					object.task2.run();
				//object.task2.join();
			}
		}
		catch(IllegalThreadStateException itse) {
			System.out.println("The thread has already been started.");
		}
	}

}
