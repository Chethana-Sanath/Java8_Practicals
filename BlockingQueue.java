import java.util.Queue;
import java.util.LinkedList;

/**
* Below class is an blockingqueue that supports pushing of elements,
* until the buffer is not full and pulling the elements as long as 
* buffer is not empty
*/
public class BlockingQueue<E> {
     
	private Queue<E> queue;	
	private int  limit = 10;
	 
    public BlockingQueue(int limit) {
    	this.limit = limit;
		this.queue=new LinkedList<E>();
    }

    /**
     * Inserts the specified element into the underlying queue, waiting if
     * necessary for the underlying queue to be ready to accept new elements.
     * @param e the element to insert.
     */
    public synchronized void push(E e) throws InterruptedException {
   
		 while(this.queue.size() == this.limit) {
			System.out.println("calling wait in push");
			wait();
		}
		if(this.queue.size() == 0) {
			notifyAll();
		}
		this.queue.add(e);
		
    }

    /**
     * Retrieves and removes the head of the underlying queue, waiting if
     * necessary until it is capable of providing an element.
     * @return the retrieved element
     */
    public synchronized E pull() throws InterruptedException {
   		while(this.queue.size() == 0){
   			System.out.println("calling wait in pull");
   			wait();
		}
		if(this.queue.size() == this.limit){
			notifyAll();
		}
		return this.queue.remove();
		
    }
    
  
}
