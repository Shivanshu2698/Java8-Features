package lambdaExpression;
import java.util.*;

/*class A implements Runnable{
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("i am child thread from implementation class");
		}
	}
}*/

public class Test1 {
	public static void main(String []args) {
		
		//we arer creating lambda expression for Runnable no need to create implementation class
		Runnable r=()->{
			for(int i=0; i<10; i++ ) {
				System.out.println("i am child from Runnable lambda ");
			}
		};
		
		//A a= new A();
		Thread t= new Thread(r);
		t.start();
		for(int i=0; i<10; i++) {
			System.out.println("i am main thread");
		}
		
	}
}
