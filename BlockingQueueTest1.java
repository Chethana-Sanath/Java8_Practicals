/**
 * Below is a test class to verify the behavior of a blocking queue
 */
public class BlockingQueueTest1 {
	public static void main(String[] args) throws Exception {
		BlockingQueue<String> bQueue = new BlockingQueue<String>(10);
		Thread.currentThread().interrupt();
		push(bQueue,"chethana");
		push(bQueue,"chiranth");
		push(bQueue,"guru");
		push(bQueue,"ram");
		push(bQueue,"sham");
		push(bQueue,"giri");
		push(bQueue,"deepak");
		push(bQueue,"shiva");
		push(bQueue,"raja");
		push(bQueue,"rani");
		//push(bQueue,"abdul");
		
		pull(bQueue);
		pull(bQueue);
		pull(bQueue);
		pull(bQueue);
		pull(bQueue);
		pull(bQueue);
		pull(bQueue);
		pull(bQueue);
		pull(bQueue);
		pull(bQueue);
		pull(bQueue);
	}
	
	public static void push(BlockingQueue<String> mal,String element) {
		try {
			System.out.println("pushing element "+element);
			mal.push(element);	
		}
		catch(InterruptedException ie) {
			System.out.println("InterrupedException thrown "+ie.getStackTrace());
		} 
	}
	
	public static void pull(BlockingQueue<String> mal) {
		try {
			System.out.println("removing element "+mal.pull());
		}	
		catch(InterruptedException ie) {
			System.out.println("InterrupedException thrown "+ie.getStackTrace());
		}
	}
	
}
