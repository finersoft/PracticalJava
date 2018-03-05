/**
 * 
 */
package com.finersoft.ch02.case14.step1;

/**
 * 名称：汽车基类 说明：
 * 
 * @author Finersoft
 * @date 2018年3月5日
 */
public class Car {

	/**
	 * 生产厂商
	 */
	private String make;
	/**
	 * 出厂年份
	 */
	private int year;

	/**
	 * 驾车
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
