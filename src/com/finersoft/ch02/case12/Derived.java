/**
 * 
 */
package com.finersoft.ch02.case12;

import com.finersoft.ch02.case12.Base;

/**
 * 名称： 说明：
 * 
 * @author Finersoft
 * @date 2018年3月2日
 */
public class Derived extends Base {

	public static void main(String[] args) {
		Derived d1 = new Derived();
		Derived d2 = new Derived();

		Base b1 = new Base();
		Base b2 = new Base();

		if (b1.equals(b2)) {
			//可能会进这个，只要属性完全一样
			System.out.println(" b1 equals b2 ");
		} else {
			System.out.println(" b1 not equals b2 ");
		}
		if (b1.equals(d1)) {
			System.out.println(" b1 equals d1 ");
		} else {
			//一直会进这个，因为getClass不相同
			System.out.println(" b1 not equals d1 ");
		}
		if (d1.equals(b1)) {
			System.out.println(" d1 equals b1 ");
		} else {
			//一直会进这个，因为getClass不相同
			System.out.println(" d1 not equals b1 ");
		}
		if (d1.equals(d2)) {
			//可能会进这个，只要属性完全一样
			System.out.println(" d1 equals d2 ");
		} else {
			System.out.println(" d1 not equals d2 ");
		}
	}
}
