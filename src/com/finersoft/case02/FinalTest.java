package com.finersoft.case02;
/**
 * 
 * @author Finersoft
 *
 */
class Circle{
	/**
	 * radius
	 */
	private double rad ;
	public Circle(double rad )
	{
		this.rad= rad ; 
	}
	public double getRad() {
		return rad;
	}
	public void setRad(double rad) {
		this.rad = rad;
	}
	
	
}
/**
 * 
 * @author Finersoft
 *
 */
public class FinalTest {
	
	private static final Circle WHEEL =  new Circle(5.0);

	public static void main(String[] args) {
		System.out.println("Radius of WHEEL is "+WHEEL.getRad());
		WHEEL.setRad(7.4);
		//if cancel comments,you will get compiler info :"The final field FinalTest.WHEEL cannot be assigned"
		//WHEEL= new Circle(7.4);
		System.out.println("Radius of WHEEL is now "+WHEEL.getRad());

	}

}
