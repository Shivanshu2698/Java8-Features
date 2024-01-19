import java.util.*;

class Student
{
	String name;
	int score;
	
	Student(String name, int score){
		this.name=name;
		this.score=score;
	}
	
	public String getName() {
		return this.name;
	}
	public int getScore() {
		return this.score;
	}
}
public class ParallelStreamDemo {

	public static void main(String[] args) {
		List<Student> slist= new ArrayList<Student> ();
		slist.add(new Student("shiva", 98));
		slist.add(new Student("lavi", 76));
		slist.add(new Student("sibbu", 87));
		slist.add(new Student("megha", 89));
		slist.add(new Student("anil", 67));
				
		//using normal Stream
		/*slist.stream().filter(s-> s.getScore()>=80)
		.limit(3)
		.forEach(n-> System.out.println(n.getName()+" "+n.getScore()));*/
				
		//using Parallel Stream
		/*slist.parallelStream().filter(s-> s.getScore()>=80)
		.limit(3)
		.forEach(n-> System.out.println(n.getName()+" "+n.getScore()));  */
		
		//convert normal stream --> parallel Stream
		//method===== parallel()
		slist.stream().parallel().filter(s-> s.getScore()>=80)
		.limit(3)
		.forEach(n-> System.out.println(n.getName()+" "+n.getScore()));
	}
}
