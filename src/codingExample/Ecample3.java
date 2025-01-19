package codingExample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Ecample3 {
	public static void main(String[] args) {
		String inputArray[]= {"shiva", "kaka", "kaka", "prateek", "geeta"};
		
	    ////WE CAN NOT USE THE SAME STTREAM AGAIN AND AGAIN
	    //// It will cause IllegalThreadStateException
		/*
		Stream<String> inputStream = Arrays.asList(inputArray).stream();
		inputStream.forEach(input->System.out.println(input));
		
		long count=inputStream.filter(x->x.equals("kaka")).count();
		System.out.println("kaka count is "+count);*/
		
		Supplier<Stream<String>> inputStream=()->Stream.of(inputArray);
		long count=inputStream.get().filter(x->x.equals("kaka")).count();
		System.out.println("count is "+count);
	}

}
