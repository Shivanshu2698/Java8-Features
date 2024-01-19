package lambdaExpression;
import java.util.*;

/*class Sample{
	Sample(){
		System.out.println("Sample class Constructor");
	}
}
@FunctionalInterface
interface Inter {
	public Sample get();
}*/

class Student{
	String name;
	int age;
	int rollno;
	int marks;
	Student(String name, int age, int rollno, int marks){
		this.name=name;
		this.age=age;
		this.rollno=rollno;
		this.marks=marks;
	}
}

interface Interf1{
	public Student get(String name, int age, int rollno, int marks);
}

public class ConstructorReferance {
	public static void main(String[] args) {
		/*Inter i=Sample::new;  //it is constructor reference but parameter must be same of constructor and get method of interface
		Sample s1=i.get();
		Sample s2=i.get();
		Sample s3=i.get();
		Sample s4=i.get();*/
		
		Interf1 i1=Student::new;
		List<Student> l= new ArrayList<>();
		l.add(i1.get("shiva", 22, 112, 89));
		l.add(i1.get("manya", 23, 16, 34));
		l.add(i1.get("lavi", 25, 45, 78));
		l.add(i1.get("shibbu", 28, 56, 67));
		for(Student s:l) {
			System.out.println(s.name+" "+s.age+" "+s.rollno+ " "+s.marks);
		}
		
		
	}
}
