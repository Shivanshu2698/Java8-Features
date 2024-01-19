import java.util.*;
import java.util.stream.*;

public class ConcatStramDemo {
	public static void main(String[] args) {
		List<String> str1=Arrays.asList("dog", "cat", "elephant");
		List<String> str2=Arrays.asList("parrot", "peackock", "crow");
		
		Stream<String> sm1=str1.stream();
		Stream<String> sm2=str2.stream();
		
		List<String> st=Stream.concat(sm1, sm2).collect(Collectors.toList());
		System.out.println(st);
	}
}
