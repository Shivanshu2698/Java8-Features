import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/*class Student{
	String sname;
	int sid;
	char grade;
	
	Student(String sname,int sid,char grade){
		this.sname=sname;
		this.sid=sid;
		this.grade=grade;
	}
}
public class FlatmapDemo1 {
	public static void main(String[] args)
	{
	List<Student> slist1= new ArrayList<Student>();
	slist1.add(new Student("Shivanshu", 101, 'A'));
	slist1.add(new Student("Lavi", 102, 'B'));	
	slist1.add(new Student("Shivam", 103, 'B'));	
	
	List<Student> slist2= new ArrayList<Student>();
	slist2.add(new Student("Mehul", 104, 'A'));
	slist2.add(new Student("Shivi", 105, 'B'));	
	slist2.add(new Student("Samar", 106, 'B'));	
	
	List<List<Student>> finalList=Arrays.asList(slist1, slist2);
	
	finalList.stream().flatMap(slist->slist.stream()
			.map(s->s.sname))
			.forEach(name->System.out.println(name));
	
	}
}*/
