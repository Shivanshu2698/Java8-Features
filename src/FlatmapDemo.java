import java.util.List;
import java.util.Arrays;

public class FlatmapDemo {
	public static void main(String[] args) {
		
		//map
		List<Integer> l1= Arrays.asList(12,34,56,132,89,35);
		l1.stream().map(a-> a+5).forEach(a-> System.out.println(a));
		
		//flatmap
		List<String> s1=Arrays.asList("A", "B", "C");
		List<String> s2=Arrays.asList("A", "E", "F");
		List<String> s3=Arrays.asList("G", "H", "I");
		
		List<List<String>> sfinal=Arrays.asList(s1,s2,s3);
		
		//using filter inside flatmap
		sfinal.stream().flatMap(str-> str.stream()
				.filter(name->name.equals("A")))
				.forEach(nn->System.out.println(nn));
		
		//using map inside flatmap
		sfinal.stream().flatMap(str-> str.stream()
				.map(name->name.toLowerCase()))
				.forEach(nn->System.out.println(nn));
		
		//***************************BEFORE JAVA 8
		/*List<String> l1= Arrays.asList("A", "B");
		List<String> l2= Arrays.asList("C", "D");
		List<String> l3= Arrays.asList("E", "F");
		
		List<List<String>> sfinal=Arrays.asList(l1, l2, l3);
		
		for(List<String>group: sfinal) {
			for(String name: group) {
				System.out.println(name);
			}
		}
		System.out.println("\n");
		//using stream
		sfinal.stream().flatMap(str-> str.stream()
				.map(name->name.toLowerCase())).forEach(name-> System.out.println(name));*/
	}
}
