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
		
		System.out.println("Using a LinkedList\n--------------------");
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("\nUsing Hashsets\n--------------------");
		
		Set<Employee> hashSet = new HashSet<>();
		hashSet.add(new Employee(1, "Employee1"));
		hashSet.add(new Employee(2, "Employee2"));
		hashSet.add(new Employee(3, "Employee3"));
		
		System.out.println(hashSet);
		System.out.println(hashSet.size());
		
		System.out.println("\nUsing Hashmaps\n--------------------");
		
		Map<Integer, Employee> employees = new HashMap<>();
		employees.put(1, new Employee(1, "Paul"));
		employees.put(2, new Employee(2, "George"));
		employees.put(3, new Employee(3, "John"));
		employees.put(4, new Employee(4, "Ringo"));
		
		System.out.println(employees);
	}

}
