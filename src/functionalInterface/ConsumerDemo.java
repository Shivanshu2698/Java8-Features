package functionalInterface;
import java.util.function.*;

class Movie{
	String name;

	public Movie(String name) {
		super();
		this.name = name;
	}
}
public interface ConsumerDemo {
	public static void main(String[] args) {

		Consumer<String> c= con->System.out.println(con);
		c.accept("shivanshu");
		c.accept("shukla");
		
		Consumer<Movie> m1=mn->System.out.println(mn.name+" is realeased");
		Consumer<Movie> m2=mn->System.out.println(mn.name+" is realeased and got flopped");
		Consumer<Movie> m3=mn->System.out.println(mn.name+" is realeased and Hit");
		m1.accept(new Movie("Ramaiya Vastavaiya"));
		m2.accept(new Movie("Mahayudha"));
		m3.accept(new Movie("Bahubali"));
		
	}
}
