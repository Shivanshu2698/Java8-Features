//In this program all the oops concept is available
//program is representin the interface methods problem till 1.7
//SIM.java
/*interface SIM{
	public abstract void call();
	public abstract void sms();
}

//Airtel.java
class Airtel implements SIM{
	public void call(){
		System.out.println("call using airtel");
	}
	public void sms(){
		System.out.println("message using airtel");
	}
}

//Mobile.java
class Mobile{
	void insertSIM(SIM sim){
		sim.call();
		sim.sms();
	}
}

//Costumer.java
class Customer{
	public static void main(String[] args){
		Mobile m=new Mobile();
		m.insertSIM(new Airtel());
	}
}
// in this program if we want to add methods in interface then all implementation class must provide implementation
//for that purpose we can implement another interface and another class to resolve that problem we should go for default methods */



//program is representing the default methode implementation in interface
//default methode implementation is optional  
//SIM.java
interface SIM{
	public abstract void call();
	public abstract void sms();
	public default void videocall()
	{
		System.out.println("calling from interface videocall method");
	}
}

//Airtel.java
class Airtel implements SIM{
	public void call(){
		System.out.println("call using airtel");
	}
	public void sms(){
		System.out.println("message using airtel");
	}
}

//Mobile.java
class Mobile{
	void insertSIM(SIM sim){
		sim.call();
		sim.sms();
		sim.videocall();
	}
}

//Costumer.java
class Customer{
	public static void main(String[] args){
		Mobile m=new Mobile();
		m.insertSIM(new Airtel());
	}
}
	