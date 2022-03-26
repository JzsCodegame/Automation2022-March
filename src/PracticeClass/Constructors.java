package PracticeClass;

public class Constructors {

	String name;
	
		 //This is a default constructor
		/* Constructors() {
		 
		}*/
		 
	/*Constructors() {
			 System.out.println("No-Argument Constructor called"); //It has an argument or code.
			 }*/
	
	Constructors (String name) { 
		this.name = name;
		}
		 
		 
	
	public static void main(String[] args) {
		Constructors C = new Constructors("Keya");
		System.out.println(C.name);
	}
	
}
