package codingExample;

import java.util.*;
import java.util.stream.Collectors;


class Employee {
	int id;
	String name;
	int age;
	
	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

public class Example1 {
	
	public static void main(String[] args) {
		//creating employee objects
		List<Employee> listEmp = new ArrayList<Employee>();
		listEmp.add(new Employee(1, "shiva", 23));
		listEmp.add(new Employee(1, "lavi", 26));
		listEmp.add(new Employee(1, "parteek", 24));
		listEmp.add(new Employee(1, "kaka", 17));
		listEmp.add(new Employee(1, "geeta", 24));
		listEmp.add(new Employee(1, "manu", 17));
		listEmp.add(new Employee(1, "lala", 23));
		listEmp.add(new Employee(1, "kamal", 23));
		listEmp.add(new Employee(1, "prabhu", 28));
		
		System.out.println(listEmp);
		
		//Converting List to map object
		//performing groupingBy
		//GroupingBy is used to group the object based on same age/any aspects
		Map<Integer , List<Employee>> mapEmp = listEmp.stream().collect(Collectors.groupingBy(Employee::getAge));
		
		
		//to print the details by grouping it
		mapEmp.forEach((key, value)->System.out.println("age"+" "+key+" "+"value"+" "+value));
		
		//sorting using Stream api////
		
		//to sort the employee by there name
		listEmp.sort(Comparator.comparing(Employee::getName));
		System.out.println("\nAfter sorting ListEmp by there name:  ");
		listEmp.forEach(emp->System.out.println(emp));
		
		//to sort the employee by there name in reverse
		listEmp.sort(Comparator.comparing(Employee::getName).reversed());
		System.out.println("\nAfter sorting ListEmp by there name in reverse:  ");
		listEmp.forEach(emp->System.out.println(emp));
		
		//to sort the employee by there name in reverse
		listEmp.sort(Comparator.comparing(Employee::getAge));
		System.out.println("\nAfter sorting ListEmp by there age:  ");
		listEmp.forEach(emp->System.out.println(emp));
		
		
		
	}

}
