package StreamExample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	int id;
	String name;
	double salary;
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}

public class StreamDemo4 {
	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(101, "shiva", 5000.0));
		al.add(new Employee(141, "lavi", 8000.0));
		al.add(new Employee(231, "geeta", 3000.0));
		al.add(new Employee(211, "prateek", 4000.0));
		al.add(new Employee(171, "ankul", 6000.0));
		al.add(new Employee(191, "sunny", 7000.0));
		
		System.out.println(al+" ");
		System.out.println(" ");
		
		//Filtering the employee who is having salary >=5000
		List<Employee> list1=al.stream().filter(emp->emp.salary>=5000).collect(Collectors.toList());
		System.out.println("Employee details having salary>=5000:");
		System.out.println(list1);
		
		System.out.println();
		
		// retrieving records of employee whose id=231 or id=141
		List<Employee> list2 = al.stream().filter(emp->(emp.id==141) || (emp.id==231)).collect(Collectors.toList());
		System.out.println("141 and 231: ");
		System.out.println(list2);
		
		System.out.println();
		//increasing the salary of employee id=101
		List<Double> list3=al.stream().filter(emp->emp.id==101).map(e->e.salary+5000).collect(Collectors.toList());
		System.out.println(list3);
			
	}
}
