package functionalInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student{
	String name;
	int marks;
	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
}
public class FunctionDemo {
	public static void main(String[] args) {
		Function<Student, String> f=s->{
			int marks=s.marks;
			String grade="";
			if(marks>=80) grade="A[First class]";
			else if(marks>=60) grade="B[Second Class]";
			else if(marks>=50) grade="C[third class]";
			else if(marks>=35) grade="D[fourth class]";
			else grade="Failed";
			return grade;
		};
		
		Student []s= {new Student("Shiva", 89),
				new Student("lavi", 75), 
				new Student("shivam", 49), 
				new Student("suman", 39),
				new Student("Ram", 69), 
				new Student("prateek", 20)}; 
		
		Predicate<Student> p=pf->pf.marks>60;
		
		Consumer<Student> cn=st->{
			System.out.println("Student Name:"+st.name);
			System.out.println("Student marks:"+st.marks);
			System.out.println("Student grade:"+f.apply(st));
			System.out.println(" ");
		};
		
		for(Student s1:s) {
			if(p.test(s1)){
				cn.accept(s1);
			}
		}
		
		//without using Consumer
		/*for(Student s1 :s) {
			if(p.test(s1))
			System.out.println(s1.name+" "+s1.marks+" "+f.apply(s1));
		}*/
		
	}
}
