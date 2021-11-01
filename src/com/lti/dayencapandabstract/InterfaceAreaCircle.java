package com.lti.dayencapandabstract;

public class InterfaceAreaCircle {

	public static void main(String[] args) {
		// Create an interface for calculating area of circle and circumference.
		//Implement that interface in the class. Const value pi=3.14f should be mentioned.
		circum c = new circum();
		area a = new area();
		circle cir;
		
		cir = c;
		System.out.println("The circumference of the circle is : "+cir.calc(2.6));
		
		cir = a;
		System.out.println("The area of the circle is : "+cir.calc(8.6));
	}

}

interface circle{
	static double pi = 3.14f;
	double calc(double r);
}

class circum implements circle{
	public double calc(double r) {
		return(2*pi*r);
	}
}

class area implements circle{
	public double calc(double r) {
		return(pi*r*r);
	}
}