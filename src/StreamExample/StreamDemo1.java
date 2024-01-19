package StreamExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo1 {
	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(34,23,45,67,89,46,789,8);
		List<String> s = Arrays.asList("shiva", "lavi", "prateek", "may", "kaka", "ravi");
		
		//forEach()
		//l1.stream().forEach(System.out::println);  //.printing by method reference
		l1.stream().forEach(l->System.out.print(l+" "));  //printing directly
		
		//filter()
		List<Integer> l2=l1.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println("\n"+ l2);
		
		//count()
		long countNumber1=l1.stream().filter(a->a<40).count();  //count based on some condition
		long countNumber2=l1.stream().count();  //directly count
		System.out.println("The total number in L1 collection is: "+countNumber2);
		
		//map()  to perform some operation  on each object
		l1.stream().map(a->a+5).forEach(a->System.out.print(a+" "));  //printing directly
		List<Integer> l3 = l1.stream().map(a->a+10).collect(Collectors.toList());
		System.out.println("\nAfter adding 10 ion each object: "+l3);
		
		//sorted()  meant for natural sorting by comparable
		List<Integer> l4= l1.stream().sorted((i1, i2)-> -i1.compareTo(i2)).collect(Collectors.toList());  //by performing logic for comparable method
		//List<Integer> l4= l1.stream().sorted().collect(Collectors.toList());  // by default it used comparable
		System.out.println("After sorting the elements by sorted() method: "+l4);
		
		List<String> s1= s.stream().sorted().collect(Collectors.toList());
		System.out.println(s1);
		
		//sorted(c)  customized sorting by comparator
		//List<String> s2 = s.stream().sorted((str1, str2)->-str1.compareTo(str2)).collect(Collectors.toList());
		List<Integer> i5 = l1.stream().sorted((i1, i2)->(i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toList());
		System.out.println("After sorting by Comparotor: "+ i5);
		
		//min() and max()
		long minByAscending = l1.stream().min((i1, i2)->i1.compareTo(i2)).get();
		long minByDescending = l1.stream().min((i1, i2)->-i1.compareTo(i2)).get();
		System.out.println("Min element after ascending order sorting: "+minByAscending);
		System.out.println("Min element after ascending order sorting: "+minByDescending);
		
		long maxByAscending = l1.stream().max((i1, i2)->i1.compareTo(i2)).get();
		long maxByDescending = l1.stream().max((i1, i2)->-i1.compareTo(i2)).get();
		System.out.println("Min element after ascending order sorting: "+maxByAscending);
		System.out.println("Min element after ascending order sorting: "+maxByDescending);
		
		
	}
	

}
