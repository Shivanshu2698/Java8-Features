import java.util.function.*;

public class PredicateDemo {
	public static void main(String[] args) {
		String s[]= {"shivanshu", "bala", "lavi", "shivam", "ramkumar"};
		
		
		Predicate<Integer> p1=s1->s1%2==0;
		System.out.println(p1.test(67));
		System.out.println(p1.test(50));
		System.out.println(p1.test(24));
		
		Predicate<String> p2=s1->s1.length()>5;
		for(String ss:s) {
			if(p2.test(ss)) {
				System.out.println(ss);
			}
		}
	}

}
