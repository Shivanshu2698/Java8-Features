import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.*;


@FunctionalInterface
interface Check{
	public abstract void m1(int a);
	//public abstract void m2(int a);
}
public class Test1 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(53);
		al.add(95);
		al.add(64);
		al.add(27);
		al.add(25);
		
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("shivanshu");
		al2.add("lavi");
		al2.add("prateek");
		al2.add("pavan");
		al2.add("ankul");
		
		System.out.println(al);
		
		//List<Integer> l1=al.stream().filter(a->a%2==0).collect(Collectors.toList());
		//System.out.println(l1);
		
		//List<Integer> l2=al.stream().map(a->a+5).collect(Collectors.toList());
		//System.out.println(l2);
		
		long count=al.stream().filter(m->m<35).count();
		System.out.println(count);
		
		System.out.println(al2);
		
		//Comparator<String> c=(i1, i2)->i1.compareTo(i2);
		Comparator<String> c=(i1, i2)->{
			int l1=i1.length();
			int l2=i2.length();
			if(l1<l2) return -1;
			else if(l1>l2) return 1;
			else return i1.compareTo(i2);
		};
		List<String> al2Sort=al2.stream().sorted(c).collect(Collectors.toList());
		System.out.println(al2Sort);
		al2.stream().sorted(c).forEach(n->System.out.print(n+" "));
		
		
		//min() max()
		//for Ascending Order
		Integer min=al.stream().min((i1, i2)-> i1.compareTo(i2)).get();
		Integer max=al.stream().max((i1, i2)-> i1.compareTo(i2)).get();
		System.out.println("\n"+min+" "+max);
		//for descending order
		Integer min1=al.stream().min((i1, i2)-> -i1.compareTo(i2)).get();
		Integer max1=al.stream().max((i1, i2)-> -i1.compareTo(i2)).get();
		System.out.println("\n"+min1+" "+max1);
	}
}
