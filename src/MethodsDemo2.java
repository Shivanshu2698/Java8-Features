import java.util.*;

public class MethodsDemo2 {
	public static void main(String[] args) {
		List<Integer> l1= Arrays.asList(2,4,1,8,5,10);
		List<String> l2= Arrays.asList("shiva", "megha", "lavi", "chhaya");
		
		//*************Sorted method
		l1.stream().sorted().forEach(n-> System.out.println(n));  //default=ascending
		System.out.println(" ");
		l1.stream().sorted(Comparator.reverseOrder()).forEach(n-> System.out.println(n));   //reverse order
		l2.stream().sorted().forEach(n-> System.out.println(n));
		
		//findAny()=it return any elemet from stream
		//if no element present then it gives:  NoSuchElemetException
		Optional<Integer> element=l1.stream().findAny();
		System.out.println(element.get());
		
		//findFirst
		element=l1.stream().findFirst();
		System.out.println(element.get());
		
		Set<String> fruits=new HashSet<String>();
		fruits.add("one apple");
		fruits.add("two mango");
		fruits.add("one banana");
		fruits.add("two graps");
		fruits.add("two orange");
		
	
		//	anyMatch()=takes predicate as a parameter
		//	allMatch()=takes predicate as a parameter
		//	noneMatch()=takes predicate as a parameter
		
		//anyMatch()= return true if any one match available as per given condition
		boolean rs=fruits.stream().anyMatch(value->{return value.startsWith("one");});
		System.out.println(rs);
		//allmatch()=return true if all match available as per given condition
		rs=fruits.stream().allMatch(value->{return value.startsWith("one");});
		System.out.println(rs);
		
		//noneMatch()=it return true ony if none elements match with given condition
		rs=fruits.stream().noneMatch(value->{return value.startsWith("one");});
		System.out.println(rs);
		
	}
}
