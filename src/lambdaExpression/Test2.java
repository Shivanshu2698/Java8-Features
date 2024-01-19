package lambdaExpression;

interface Interf{
	public void m1(int p);
}

class Demo{
	public void m1(int p) {
		System.out.println(p);
	}
}

public class Test2 {
	public static void main(String[] args) {
		Demo d = new Demo();
		d.m1(78);
		
		
		Interf i=p-> System.out.println(p);
		i.m1(70);
		//System.out.println(i.m1(4));
	}
}
