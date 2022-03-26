package PracticeClass;

public class ClassB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Main method.
		 
		// Create an object of class A and call members of class A using reference variable 'a'. 
		  ClassA a = new ClassA(); // a is a reference variable of class A and pointing to the objects of class A. 
		  System.out.println(a.data); // Compile time error will occur because we cannot call private members of any class from outside the class. 
		  a.msg(); // Compile time error. So we cannot call the private method of any class because this is accessible within the class only. 
		     
	}

}
