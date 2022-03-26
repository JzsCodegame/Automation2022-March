package Sprint1;

import PracticeClass.Student;
import PracticeClass.Vehicle;

public class Day3 extends Vehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj;
		obj = new Student(); // Compile time error because class Student has been defined with default access modifier and cannot be instantiated from outside the package. But, if it is declared as public then we can instantiate from outside the package. 
	     obj.name(); // Compile time error because of the default access modifier
	     Vehicle BMW = new Vehicle();
	     
	     System.out.println(BMW.BrandName);
	}

}
