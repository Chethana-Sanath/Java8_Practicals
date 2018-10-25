/**
 * Below is a test class that fills in MyArrayList with a list of elements and
 * returns them, as specified by their index
 */
public class MyArrayListTest {	
	
	public static void main(String[] args) {
		MyArrayList mal = new MyArrayList();
		addElements(mal,0);
		addElements(mal,1);
		addElements(mal,2);
		addElements(mal,3);
		addElements(mal,4);
		addElements(mal,5);
		addElements(mal,6);
		addElements(mal,7);
		addElements(mal,8);
		
		getElement(mal, 0);
		getElement(mal, 1);
		getElement(mal, 2);
		getElement(mal, 3);
		getElement(mal, 10);
		getElement(mal, -4);
		removeElements(mal,0);
		removeElements(mal,5);
		removeElements(mal,9);
	
	}
	
	public static void addElements(MyArrayList mal,int index) {
		mal.add(index);		
	}
	
	public static void getElement(MyArrayList mal,int index) {
		try {
			System.out.println("Element at given index is: "+mal.get(index));
		
		}
		catch(Error e) {
			System.out.println("Unable to find the element and exception thrown: "+e.getMessage());
		}
		
	}
	
	public static void removeElements(MyArrayList mal,int index) {
		try {
			mal.remove(index);
			
			}
			catch(Exception e) {
				System.out.println("Unable to remove the element and exception thrown: "+e.getMessage());
			}
	}

}
