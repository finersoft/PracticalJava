package com.finersoft.ch01.case02;
/**
 * 名称：圆形
 * 说明：
 * @author Finersoft
 * @date 2018年3月1日
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
 * 名称：Final关键字作用于引用类型的测试
 * 说明：测试引用类型的地址不可以改变，但是该地址指向的对象中的属性是可以变化的
 * 即，不能new一个对象重新赋值给该final引用对象，但是可以调用对象方法来修改对象的内容
 * @author Finersoft
 * @date 2018年3月1日
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
