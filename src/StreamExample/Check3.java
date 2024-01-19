package StreamExample;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Check3 {
	public static void main(String[] args) {
		ArrayList<Integer> ar= new ArrayList<Integer>();
		ar.add(10);
		ar.add(20);
		ar.add(0);
		ar.add(39);
		ar.add(4);
		
		
		// to Array()   copy stream elements to array
		Integer[] i = ar.stream().toArray(Integer[] :: new);
		for(Integer i1: i) {
			System.out.print(i1+" ");
		}
		
		Stream<Integer> s=Stream.of(9,99,999,9999,99999);
		s.forEach(System.out::println);
		
		Integer[] arr= {10, 20, 30 ,40, 67};
		int num=Stream.of(arr).findAny().get();
		System.out.println(num);
			
	}
}
