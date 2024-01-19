import java.util.List;
import java.util.Optional;
import java.util.Arrays;
import java.util.stream.Collectors;

public class MethodsDemo {
	public static void main(String[] args) {
		List<String> str=Arrays.asList("shiva", "lavi","shiva", "shivam", "suman", "megha", "lavi");
		List<Integer> num=Arrays.asList(12,56,23,45,89,765,34,870);
		List<String> s=Arrays.asList("A", "B", "C", "1", "2", "3");
		
		//distinct() method use
		List<String> strname=str.stream().distinct().collect(Collectors.toList());
		System.out.println(strname);
		
		//count() method use
		long count=str.stream().distinct().count();
		System.out.println(count);
		
		//limlit() method use
		List<String> ss=str.stream().limit(3).collect(Collectors.toList());
		System.out.println(ss);
		
		
		long totalcount=num.stream().filter(n-> n%2==0).count();
		System.out.println(totalcount);
		
		//********min() method use
		Optional<Integer> min=num.stream().min((val1, val2)-> {
			return val1.compareTo(val2);
		}
		);
		System.out.println(min.get());
		
		//********max() method use
		Optional<Integer> max=num.stream().max((val1, val2)-> {
			return val1.compareTo(val2);  }
		);
		System.out.println(max.get());
		
		//******reduce() method use
		Optional<String> combinedValue= s.stream().reduce((value, combine)->{
			return value+combine;
		});
		//System.out.println(combinedValue);   //result will= Optional[ABC123]
		System.out.println(combinedValue.get());  
		
		//toArray() method use
		List<String> s1=Arrays.asList("A", "B", "C", "1", "2", "3");
		Object[] arr=s1.stream().toArray();
		System.out.println(arr.length);
		System.out.println("the array elements are:");
		for(Object o:arr) {
			System.out.println(o);
		}
	}
		
}
