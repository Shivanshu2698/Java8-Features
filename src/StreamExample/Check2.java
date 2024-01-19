package StreamExample;
import java.util.*;
import java.util.stream.*;
import java.util.stream.Collectors;

public class Check2 {
	public static void main(String[] args) {
		ArrayList<Integer> ar= new ArrayList<>();
		ar.add(12);
		ar.add(34);
		ar.add(122);
		ar.add(1672);
		List<String> str=Arrays.asList("shiva", "lavi", "lavi", "shibbu", "shivam", "shiva");
	
		
		Integer[] arr= {12,67,34,56,89};
		Stream.of(arr).forEach(System.out::println);
		
		// toArray()  method to create array from stream
		Integer[] i=ar.stream().toArray(Integer[]::new);
		for(Integer in:i) {
			System.out.print(in+ " ");
		}
		
		//distinct() method use
		List<String> strname=str.stream().distinct().collect(Collectors.toList());
		System.out.println("\n"+strname);
		
		//limlit() method use
		List<String> ss=str.stream().limit(3).collect(Collectors.toList());
		System.out.println(ss);
		
		Optional<String> combinedValue= str.stream().reduce((value, combine)->{
			return value+combine;
		});
		System.out.println(combinedValue.get()); 
		
		//findAny()=it return any element from stream
		//if no element present then it gives:NoSuchElemetException
		Optional<Integer> element=ar.stream().findAny();
		System.out.println(element.get());
		
		//findFirst
		Optional<Integer> first=ar.stream().findFirst();
		System.out.println(first.get());
	}
}
