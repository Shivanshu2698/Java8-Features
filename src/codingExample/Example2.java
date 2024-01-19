package codingExample;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Example2 {
	public static void main(String[] args) {
		Integer[] arr = { 3, 5, 6, 9, 5, 7, 9, 4 };

		System.out.println("Array elements are: ");
		for (int i : arr) {
			System.out.print(i + " ");
		}

		List<Integer> numList = Arrays.asList(arr);

		// to multiply 5 on each object
		// numList.stream().map(i->i*5).forEach(num->System.out.println(num));

		// to multiply all array elements using stream
		Optional<Integer> result = numList.stream().reduce((a, b) -> a * b); // to resolve NoSuchElementsException
		if (result.isPresent()) {
			System.out.println("\nThe sum of multiplication is: " + result);
		} else {
			System.out.println("Emplty Array!/List!");
		}
		
		//to multiply all array elements using normal approach
		if(numList.size()>0) {
			Integer multiResult=1;
			
			for(Integer num :numList) {
				multiResult *=num;
			}
			System.out.println("The sum of multiplication is: "+multiResult);
		}

	}

}
