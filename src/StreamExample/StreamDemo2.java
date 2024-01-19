package StreamExample;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo2 {
	public static void main(String[] args) {
		
		List<Integer> list =new ArrayList<Integer>();
		list.add(347);
		list.add(235);
		list.add(384);
		list.add(179);
		list.add(17);
		
		List<String> stringList= Arrays.asList("shiva", "kaka", "lavi", "lavi", "prateek", "geeta");
		
		//Stream.of() to perform stream concept on arrays
		Integer []ar= {23,45,78,13,69,324,78,4789,436};
		Stream.of(ar).forEach(System.out::println);
		
		System.out.println();
		
		//toArray() to create array from stream
		Integer[] intArray=list.stream().toArray(Integer[]::new);
		for(Integer num:intArray) {
			System.out.print(num+" ");
		}
		
		//distinct() method for unique element
		List<String> l2= stringList.stream().distinct().collect(Collectors.toList());
		System.out.println("\n"+ l2);
		
		//findAny()=it return any element from stream
		//if no element present then it gives:NoSuchElemetException
		Optional<Integer> anyElement=list.stream().findAny();
		System.out.println(anyElement.get());
				
		//findFirst
		Optional<Integer> firstElement=list.stream().findFirst();
		System.out.println(firstElement.get());
		
		//limlit() method used to limit the collection Exa: 4 give only 4 object of collection
		List<String> ss=stringList.stream().limit(4).collect(Collectors.toList());
		System.out.println(ss);
		Optional<String> combinedValue= stringList.stream().reduce((value, combine)->{
			return value+combine;
		});
		System.out.println(combinedValue.get()); 
		
	}
	
	

}
