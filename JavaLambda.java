//Lambda expressions in java is the closest way to get functions used as objects.
//Lambda expression is an anonymous function - a function without a name,
//access modifier and return type

public class JavaLambda {
	
	public static void main(String ar[]) {
		JavaLambda obj = new JavaLambda();
		obj.add(3,3,6);			
	}
	
	public int add(int x, int y,int z) {
		System.out.println("sum in typical method "+(x*+z));
		return x*y+z;
	}
	
		//Below is lambda exp that is instantiating functionalinterface, myLambda.
	//Lambda exp provides a sleeking way of instantiating an interface, when compared to legacy way of
	//instantiating using anonymous class
	myLambda lambdaFunction=(int a,int b) -> {
		System.out.println("sum in lambda exp "+a+b);
		return a+b;
	};
	
}

//This is a functional interface, that has exactly one abstract method
//Used annotation @FunctionalInterface to tell compiler that there has to be exactly one abstract method
@FunctionalInterface
interface myLambda {
	public int add1(int x,int y);//this has exactly same signature as 
	//lambda expn (takes 2 int args, returns int)
	
	//In Functional interfaces we can have default and static methods, with method body
	public default String getName() {
		return "Chethana";
	}
	
	public static String getAge() {
		return "37";
	}
	//Note - interfaces are not allowed to have Object class's default methods	
}

class MyClass implements myLambda {
	public int add1(int x,int y) {
		return x+y;
	}
}

