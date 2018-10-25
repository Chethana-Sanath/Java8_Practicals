//Static overriding example
class Parent{
	 static void run() {
		 System.out.println("run in parent");
	 }
	 void display() {
		 System.out.println("display in Parent");
	 }
	 
}


 public class B extends Parent{

	static void run(){
		System.out.println("run in B");
	}
	void display() {
		System.out.println("display in B");
	}
	public static void main(String[] args) {
		B poly = new B();
		poly.run();
		poly.display();
		new Parent().run();
		new Parent().display();
		Parent parent = new B();
		parent.run();
		parent.display();
	}
	

}

 

	

