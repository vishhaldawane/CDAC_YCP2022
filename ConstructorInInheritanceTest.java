
public class ConstructorInInheritanceTest {
	public static void main(String[] args) {

		Child ch = new Child("Python");
		ch.coding(); //explicit
		ch.farming(); //inherited
		ch.banking(); //inherited
		
		
		
	}
}
class GrandFather // extends Object  | Object() { }
{
	//yes it has a default constructor
	int age;
	String name;
	
	//you can have either default or explicit
	//but not both at the same time
	
	//explicit ctor..../programmer has defined
	public GrandFather(int age, String name) {
		super();
		this.age = age;
		this.name = name;
		System.out.println("GrandFather constructor...");
	}
	void freedomFighting() {
		System.out.println("Grandfather is fighting for freedom..");
	}
	void farming() {
		System.out.println("Grandfather is farming....");
	}
}
class Father extends GrandFather // Father is the child of grandfather
{
	Father(String profession) {
		//hidden first line of any constructor
		super(89,"Shyam"); // <-- this is that hidden line
		//implicit or explicit
		//parameterized or non-parameterized...
		System.out.println("\tFather constructor....");
	}
	void banking() {
		System.out.println("Father is banking.....");
	}
}

class Child extends Father
{
	String tech;
	
	Child(String tech) {
		super("Job");
		this.tech = tech;
		System.out.println("\t\tChild constructor....");
	}
	void coding() {
		System.out.println("Child is coding...in..."+tech);
	}
	void banking() {
		System.out.println("banking via internet...");
	}
	void farming() {
		System.out.println("robotic farming....");
	}
}
/*
 
  	super() -- invoke the nearest super class ctor
  	
  
 
 */


