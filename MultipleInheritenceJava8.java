interface I1 {
	public default void add() {
		System.out.println("add in interface I1");
	}
	public static void greet() {
		System.out.println("Hello in I1");
	}
}

interface I2 {
	public default void add() {
		System.out.println("add in interface I2");
		greet();
	}
	public static void greet() {
		System.out.println("Hello in I2");
	}//purpose of static methods in java8 is to maintain related methods together and invoke them without the need
	//of creating objects. A static method can be invoked within other default and static methods
}

public class MultipleInheritenceJava8 implements I2,I1 {
	
	public void add() {
		System.out.println("add in class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInheritenceJava8 ob = new MultipleInheritenceJava8();
		ob.add();
		I1 ob1 = new MultipleInheritenceJava8();
		ob1.add();
		I2.greet();
	}

}
