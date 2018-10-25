//This is a Doubly checked singleton implementn
public class Singleton {
	private static Singleton singleton = null;
	
	private Singleton() {}
	//there needs 2 be checks for !=null and one synchronized
	public static Singleton getInstance() {
		if(singleton==null) {
			synchronized(singleton) {
				if(singleton==null) {
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}
	
	
}
