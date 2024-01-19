package StreamExample;
import java.util.stream.*;
import java.util.*;
public class Check1 {
	public static void main(String[] args) {
		List<Integer> l1= Arrays.asList(23,12,56,89,35,678,32);
		List<String> s=Arrays.asList("shiva", "lavi", "shivam", "umakant", "suman");
		
		//forEach()
		l1.stream().forEach(System.out::println);
		l1.stream().forEach(a->System.out.print(a+" ")); //to print directly
		
		//filter()
		List<Integer> even=l1.stream().filter(a->a%2==0).collect(Collectors.toList());
		System.out.println("after filtering even object: "+ even);
		
		//count()     method to count value
		long countNo=l1.stream().filter(k->k<35).count();
		System.out.println("<35 is: "+countNo);
		
		//map()   to perfom some operation on each object
		l1.stream().map(val->val+5).forEach(k->System.out.print(k+" "));
		List<Integer> update=l1.stream().map(val->val+5).collect(Collectors.toList());
		System.out.println("\nafter adding 5 using map() :"+update);
		
		
		//sorted()    - meant for natural sorting order
		List<Integer> sortedEle=l1.stream().sorted((i1, i2)->(i1.compareTo(i2))).collect(Collectors.toList());
		//List<Integer> sortedEle=l1.stream().sorted().collect(Collectors.toList());
		System.out.println("after sorting by default sorted() "+sortedEle);
		
		//sorted()        sorting on String object
		List<String> sssort=s.stream().sorted((s1, s2)->(s2.compareTo(s1))).collect(Collectors.toList());
		System.out.println("String objects sorting "+sssort);
		
		//sorted(c)   - coustumized sorting by comparator object
		Comparator<Integer> c=(i1, i2)->(i1<i2)?1:(i1>i2)?-1:0;
		List<Integer> deSort1=l1.stream().sorted(c).collect(Collectors.toList());
		List<Integer> deSort2=l1.stream().sorted((i1, i2)->(i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toList());
		System.out.println("sorting by comparator: " +deSort2);
		
		//min() max()
		// Ascending order => min= first element & max=last element
		//Descending Order => min= first element & max = last element
		Integer min=l1.stream().min((i1, i2)-> (i1.compareTo(i2))).get();    //min=12
		Integer max=l1.stream().max((i1, i2)-> (i1.compareTo(i2))).get();    
		//Integer min=l1.stream().min((i1, i2)-> (-i1.compareTo(i2))).get();  //min=678
		System.out.println("min value is: "+min);
		System.out.println("max value is: "+max);
		}
	
}
