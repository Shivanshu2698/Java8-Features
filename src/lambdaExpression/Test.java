package lambdaExpression;
import java.util.*;

class MyComparator implements Comparator<Integer>{
	public int compare(Integer i1, Integer i2) {
		return -i1.compareTo(i2);
	}
}

public class Test {
	public static void main(String[] args) {
		ArrayList<Integer> l= new ArrayList<>();
		l.add(23);
		l.add(12);
		l.add(45);
		l.add(25);
		l.add(112);
		l.add(78);
		
		// we can create lambda expression for comparator interface 
		// then there is no need to create MyComparator class and implements run method
		Comparator<Integer> c=(i1, i2)->(i1>i2)?-1 :(i1<i2)?1:0;   //ternary operator we are using
		
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
		Collections.sort(l, new MyComparator());
		//Collections.sort(l, c);
		System.out.println(l);
		
	}
}
