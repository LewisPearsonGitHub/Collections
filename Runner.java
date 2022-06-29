import java.util.HashSet;
import java.util.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Employee> list = new LinkedList<Employee>();
		list.add(new Employee(1, "Lewis"));
		list.add(new Employee(2, "Bill"));
		list.add(new Employee(3, "James"));
		
		Iterator<Employee> itr = null;
		itr=list.listIterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Set<Employee> hashSet = new HashSet<>();
		hashSet.add(new Employee(1, "Employee1"));
		hashSet.add(new Employee(2, "Employee2"));
		hashSet.add(new Employee(3, "Employee3"));
		
		System.out.println(hashSet);
		System.out.println(hashSet.size());
		
		Map<Integer, Employee> employees = new HashMap<>();
		employees.put(1, new Employee("Paul"));
		employees.put(2, new Employee("George"));
		employees.put(3, new Employee("John"));
		employees.put(4, new Employee("Ringo"));
		
		System.out.println(employees);
	}

}
