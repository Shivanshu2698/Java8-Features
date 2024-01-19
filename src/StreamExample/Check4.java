package StreamExample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*class Employee{
	int id;
	String name;
	double salary;
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public String toString() {
		return id+" "+name+" "+salary;
	}
}
public class Check4 {
	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(101, "Shiva", 6000));
		al.add(new Employee(102, "lavi", 4000));
		al.add(new Employee(103, "shivam", 6700));
		al.add(new Employee(104, "prateek", 1900));
		al.add(new Employee(105, "ram", 5000));
		
		System.out.println(al+" \n");
		
		//find employee whose is having salary greater then 5000
		List<Employee> list1=al.stream().filter(emp->(emp.salary>=5000)).collect(Collectors.toList());
		System.out.println(list1);
		
		//to retrieve the employee details having id=101
		List<Employee> list2=al.stream().filter(emp->(emp.id==101)).collect(Collectors.toList());
		System.out.println(list2);
		
		//increasing 5000 salary of 104 employee
		List<Double> list3=al.stream().filter(emp->(emp.id==104)).map(e->e.salary+5000).collect(Collectors.toList());
		System.out.println(list3);
	}

}*/
