/**
 * 
 */
package com.finersoft.ch02.case14.step1;

/**
 * 名称：汽车派生类 说明：
 * 
 * @author Finersoft
 * @date 2018年3月5日
 */
public class MyCar extends Car {
	/**
	 * 驾车
	 * 子类中又有一些其他的驾车方法
	 */
	@Override
	public void drive() {
		// code to drive the car differently than base class
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car a = new Car();
		MyCar b = new MyCar();
		
		System.out.println("Q:Are Car object equals to MyCar object?");
		System.out.println("A:"+a.equals(b));

	}

}
