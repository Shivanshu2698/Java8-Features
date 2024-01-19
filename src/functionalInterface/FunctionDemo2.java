package functionalInterface;
import java.util.ArrayList;
import java.util.function.*;

/*class Employee{
	int eno;
	String name;
	public Employee(int eno, String name) {
		super();
		this.eno = eno;
		this.name = name;
	}
	
}*/
public class FunctionDemo2 {
	public static void main(String[] args) {
		Function<Integer, Integer> f1=i->2*i;
		Function<Integer, Integer> f2=i->i*i*i;
		
		//2*2 then 4*4*4
		System.out.println(f1.andThen(f2).apply(2));
		
		//2*2*2 then 8*2
		System.out.println(f1.compose(f2).apply(2));
		
		//
		ArrayList<Employee> al = new ArrayList<Employee>();
		
		/*BiFunction<Integer, String, Employee> bf=(eno, name)->new Employee(eno, name);
		al.add(bf.apply(101, "Shivanshu"));
		al.add(bf.apply(1041, "labi"));
		al.add(bf.apply(131, "suman"));
		al.add(bf.apply(111, "laala"));
		
		
		for(Employee e1:al) {
			System.out.println(e1.name);
			System.out.println(e1.eno);
			System.out.println();
		}*/
	}
}
