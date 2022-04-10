package PracticeClass;

public class Vehicle{

	
	
	
	
	   //KeyWord //Data Type     //variable name     //variable Value
public static int           numberOfwheels =       4;                 //Static variable
                            // x = 4

public static String BrandName = "BMW", Color;  //Static Variable can be accessed internally and outside the class


double price = 50756.50;//Global variable can accessed everywhere in the same class not outside.
	

	
void start() { //Instance Methods
		String keytype = "Button";//Local Variable only access inside method body.
		System.out.println("Car is Ready to Start--" + keytype + numberOfwheels + price );
	}


void changeGear()  {      //Instance Methods
		String geartype = "AutomaticTransmission"; // Local variable
		System.out.println("Shift from Parking To Drive" + geartype + price);
	}
	
	
static int accelerate() {    //Static Method
		int speed = 100;
		return speed;
				
	}
	
	


public static void main(String[] args)  {//Static method
		// TODO Auto-generated method stub

	
	Vehicle BMW = new Vehicle();//Vehicle() is Constructor of Class Vehicle
	BMW.start();   // Cannot be accesses directly from the class.
	BMW.changeGear();
	System.out.println("Car speed is " + Vehicle.accelerate() + "mph");  //Vehicle.accelerate()Can be directly be accessed from the class 
	System.out.println("the price of the wheel is " + BMW.price / numberOfwheels);
	}

}
