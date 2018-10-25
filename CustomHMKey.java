import java.util.HashMap;
import java.util.Map;


public class CustomHMKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee(1);
		Employee emp2 = new Employee(1);
		Map<Employee, Integer> map = new HashMap<Employee, Integer>();
		map.put(emp1,1);
		map.put(emp2, 1);
		System.out.println(map.size());//size=2
		//However size should be 1 as both employees have same emp ID
		//Thus, we need to override hashcode and equals in employee class, so that in above case,
		//hashmap size is 1. 
		//Once overriden what happens is in this case hashcode value would be same for both emp1 and emp2 and thus
		//case equals method will be invoked. Since equals returns same value as in emp1, second entry (emp2) is rejected.
	}

}

class Employee {
	int id;
	public Employee(int id) {
		this.id = id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
}
