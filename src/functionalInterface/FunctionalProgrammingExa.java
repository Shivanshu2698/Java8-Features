package functionalInterface;

import java.util.List;

public class FunctionalProgrammingExa {
	public static void print(int number) {
		System.out.println(number);
	}
	public static void printAllNumbersInList(List<Integer> numbers) {
		
		//numbers.stream().forEach(FunctionalProgrammingExa :: print);
		
		numbers.stream().filter(num->num%2==0).forEach(System.out::println);
		
		/*for(int number:numbers) {
			System.out.println(number);
		}*/
	}
	//this is traditional approach
	public static void main(String[] args) {
		printAllNumbersInList(List.of(12, 9, 45, 34 ,78,12,78));
	}
}
