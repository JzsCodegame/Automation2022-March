package PracticeClass;

public class Constructors {

	String name;
	
		 //This is a default constructor
		/* Constructors() {
		 
		}*/
		 
	/*Constructors() {
			 System.out.println("No-Argument Constructor called"); //It has an argument or code.
			 }*/
	
	Constructors (String name) { //String name is our parameter because we have created inside the method()
		this.name = name; //This is the name parameter which is our container.
		}
		 
		 
	
	public static void main(String[] args) {
		Constructors C = new Constructors("Keya");/*We have instantiated our object of class which is C, 
		and using the Constructor we are manipulating date*/
		System.out.println(C.name);
	}
	
}
