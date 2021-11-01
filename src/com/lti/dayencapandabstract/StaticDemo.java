package com.lti.dayencapandabstract;

public class StaticDemo {

	public static void main(String[] args) {
		System.out.println("Main Method");
		A a = new A();
		a.display();
		A.show();
		check();
	}
	static void check() {
		System.out.println("Static Method in Main Class.");
	}
	static{
		System.out.println("Static Blocked");
	}


}

class A{
	A(){
		System.out.println("Constructor");
	}
	
	void display() {
		System.out.println("Non-Static method in class A");
	}
	
	static void show() {
		System.out.println("Static method in class A");
	}
	{
		System.out.println("Anonymous block");
	}
}