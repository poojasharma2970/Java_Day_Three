package com.lti.dayencapandabstract;

public class AbstractDemo {

	public static void main(String[] args) {
		System.out.println("Flat 1: ");
		Flat1 f1 = new Flat1();
		f1.kitchen();
		f1.bedroom();
		f1.balcony();
		f1.bathroom();
		f1.hall();
		f1.amentites();
		System.out.println("Flat 2: ");
		Flat2 f2 = new Flat2();
		f2.kitchen();
		f2.bedroom();
		f2.bathroom();
		f2.hall();
		f2.amentites();
	}

}

abstract class Apartment{
	abstract void kitchen();
	abstract void bedroom();
	abstract void bathroom();
	abstract void hall();
	
	void amentites() {
		System.out.println("Park");
		System.out.println("Gym");
	}
}

class Flat1 extends Apartment{
	void kitchen() {
		System.out.println("8*6");
	}
	void bedroom() {
		System.out.println("12*14");
	}
	void bathroom() {
		System.out.println("16*14");
	}
	void hall() {
		System.out.println("12*4");
	}
	void balcony() {
		System.out.println("4*8");
	}
}

class Flat2 extends Apartment{
	void kitchen() {
		System.out.println("8*8");
	}
	void bedroom() {
		System.out.println("16*16");
	}
	void bathroom() {
		System.out.println("6*6");
	}
	void hall() {
		System.out.println("12*12");
	}
}