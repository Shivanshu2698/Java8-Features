package lambdaExpression;
import java.util.*;
 class Employee{
	 String ename;
	 int eno;
	public Employee(String ename, int eno) {
		super();
		this.ename = ename;
		this.eno = eno;
	}
	public String toString() {
		return  ename+":"+eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
 }
 
public class Test3 {
	
	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee("Shiva", 201));
		al.add(new Employee("Durga", 107));
		al.add(new Employee("Megha", 230));
		al.add(new Employee("Lavi", 718));
		al.add(new Employee("Shivam", 455));
		
		System.out.println(al);
		
		// sorting according to comparator by using lambda expression
		
		// sorting based on Descending order of eno
		Comparator<Employee> c = (o1, o2)-> (o1.eno>o2.eno)?-1 : (o1.eno<o2.eno)?1:0 ;
		Collections.sort(al , c);
		//Collections.sort(al , (o1, o2)-> (o1.eno>o2.eno)?-1 : (o1.eno<o2.eno)?1:0);
		
		System.out.println(al);
		
		// sorting based on alphabetical order of ename
		Comparator<Employee> cm = (o1, o2)-> o1.ename.compareTo(o2.ename) ;
		Collections.sort(al, cm);
		//Collections.sort(al , (o1, o2)-> o1.ename.compareTo(o2.ename));
		
		
		System.out.println(al);
		
		
	}
}
