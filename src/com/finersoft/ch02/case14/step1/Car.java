/**
 * 
 */
package com.finersoft.ch02.case14.step1;

/**
 * ���ƣ��������� ˵����
 * 
 * @author Finersoft
 * @date 2018��3��5��
 */
public class Car {

	/**
	 * ��������
	 */
	private String make;
	/**
	 * �������
	 */
	private int year;

	/**
	 * �ݳ�
	 */
	public void drive() {
		// code to drive the car
	}

	/** (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		// Compare make and year for equality
		return true;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
