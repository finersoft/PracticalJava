/**
 * 
 */
package com.finersoft.ch02.case14.step1;

/**
 * ���ƣ����������� ˵����
 * 
 * @author Finersoft
 * @date 2018��3��5��
 */
public class MyCar extends Car {
	/**
	 * �ݳ�
	 * ����������һЩ�����ļݳ�����
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
