package lambdaExpression;

interface A{
	public default void m2() {
		System.out.println("Interface default method from A");
	}
}
interface B{
	public default void m2() {
		System.out.println("Interface default method from B");
	}
}

public class LamdaDemo implements A, B {
	public void m2() {
		//A.super.m2();
		B.super.m2();
		//System.out.println("Interface default overridden  method");
	}
	public static void main(String[] args) {
		LamdaDemo d = new LamdaDemo();
		d.m2();
	}

	
	
}
