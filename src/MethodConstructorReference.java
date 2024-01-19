import java.util.function.*;

class Sample{
	Sample(){
		System.out.println("Sample class constructor execution...");
	}
}
interface Interf{
	public Sample get();
}

public class MethodConstructorReference {
	public static void main(String[] args) {
		Interf i=Sample :: new;
		Sample s1=i.get();
		Sample s2=i.get();
		Sample s3=i.get();
		Sample s4=i.get();
	}
}
