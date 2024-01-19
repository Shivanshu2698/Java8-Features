package functionalInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

class Employee{
	int eid;
	String eName;
	double salary;
	
	public Employee(int eid, String eName, double salary) {
		super();
		this.eid = eid;
		this.eName = eName;
		this.salary = salary;
	}
	
	public String toString() {
		return eid+" "+eName+" "+salary;
	}
}

public class PredicateDemo {
	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(101, "shiva", 5000.0));
		al.add(new Employee(231, "lavi", 6000.0));
		al.add(new Employee(131, "kamal", 3500.0));
		al.add(new Employee(161, "churan", 7000.0));
		al.add(new Employee(401, "maya", 4000.0));
		al.add(new Employee(11, "zebra", 2000.0));
		
		System.out.println(al);
		
		Comparator<Employee> c = (e1, e2)-> (e1.eid<e2.eid)?-1 : (e1.eid>e2.eid)?1 :0;
		Collections.sort(al, c);
		System.out.println(al);
		
		Predicate<Employee> p = e->e.salary>5000;
		for(Employee e : al) {
			if(p.test(e)) 
				System.out.println(e);
		}
		
		System.out.println();
		Predicate<Employee> p2 = e->e.salary>4000 && e.eName=="lavi";
		for(Employee e :al) {
			if(p2.test(e)) {
				System.out.println(e);
			}
		}
		/* we can write it like this
		 * if(e.salary>5000):
		 * sopln(e);
		 * 
		 * but if there are 10 conditions are there then predicate is best choice like this 
		 * 
		 * Predicate<Employee> p=o1->o1.salary>5000 && o1.name=="shivam" && 10 coditions;
		 * for(Employee e:l) {
			if(p.test(e)) {
				System.out.println(e.id);
			}
			} 
		 */
		
		//join AND & OR operation of predicate
		int[] x= {23,45,67,78,38,9,96,56,89};
		Predicate<Integer> p3 = num->num%2==0;
		Predicate<Integer> p4 = num->num>40;
		
		//System.out.println("The numbers which are even and >40");
		for(int a :x) {
			/*if(p3.and(p4).test(a)) {
				System.out.print(a+" ");
			}*/
			
			//"The numbers which are not even"
			/*if(p3.negate().test(a)) {
				System.out.print(a+" ");
			}*/
			
			//"The numbers which either even or greater then 40 "
			if(p3.or(p4).test(a)) {
				System.out.print(a+" ");
			}
		}
		System.out.println();
		
		/*
		 * BiPredicate
		 * 
		 * When our programming requirement is to take two argument and perform some conditional check
		 */
		BiPredicate<Integer, Integer> bp=(a, b)->(a+b)%2==0;
		System.out.println(bp.test(34, 57));
		System.out.println(bp.test(33, 57));
		
	}
}
