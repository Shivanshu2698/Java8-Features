import java.util.*;
import java.util.stream.Collectors;

class Employee {
	int id;
	String name;
	int age;
	String city;

	public Employee(int id, String name, int age, String city) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", city=" + city + "]";
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}

public class Test {
	public static void main(String[] args) {
		List<Employee> empList= new ArrayList<Employee>();
		empList.add(new Employee(101, "shiva", 23, "jabalpur"));
		empList.add(new Employee(131, "anuj", 33, "satna"));
		empList.add(new Employee(151, "kaka", 43, "rewa"));
		empList.add(new Employee(111, "lala", 22, "katni"));
		empList.add(new Employee(191, "manu", 19, "panna"));
		
		List<Employee> result=empList.stream().filter(emp->emp.age>60).collect(Collectors.toList());
		result.forEach(emp->System.out.println(emp));
		System.out.println(result);   // Empty list
		
		
		//to get the list of names only
		//List<String> nameList = empList.stream().map(emp->emp.getName()).collect(Collectors.toList());
		List<String> nameList = empList.stream().map(Employee::getName).collect(Collectors.toList());  //using method reference
		System.out.println(nameList);

	}

}
