package lambdaExpression;
import java.util.*;

@FunctionalInterface
interface Interf2{
	public void sum(int x, int y);
}

public class MethodReferance {
	public static void m1() {
		System.out.println("child thread from Runnable interface");
	}
	
	public void m2(int a, int b) {
		System.out.println("sum is:" +a+b);
	}
	
	public static void main(String[] args) {
		 Interf2 k=(x, y)->System.out.println("sum is:" +(x+y));
		 k.sum(120, 30);
		 
		 //for creating a thread we are refering already implemented method m1() in place of run() method
		 Runnable r=MethodReferance::m1;
		 Thread t= new Thread(r);
		 t.start();
		 
		 for(int i=0; i<10; i++){
			 System.out.println("main thread");
		 }
		 
		 /*MethodReferance m= new MethodReferance();
		 Interf2 i1=m :: m2; //we are using already implemented method in place of Interf interface method
		 					// so there is not requird that to provide implemetation for sum method of interface
		 i1.sum(100, 400);*/
	 }
}
