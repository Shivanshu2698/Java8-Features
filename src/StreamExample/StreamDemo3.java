package StreamExample;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo3 {
	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<>();
		ar.add(10);
		ar.add(20);
		ar.add(0);
		ar.add(39);
		ar.add(4);
		
		
		//toArray()
		Integer[] arr = ar.stream().toArray(Integer[]::new);
		for(Integer in :arr) {
			System.out.print(in+" ");
		}
		
		Stream<Integer> s =Stream.of(23,78,45,90,35,79);
		s.forEach(System.out::println);
		
		System.out.println();
		Integer[] arr1= {10, 20, 30 ,40, 67};
		int num=Stream.of(arr).findAny().get();
		System.out.println(num);
		
	}

}
