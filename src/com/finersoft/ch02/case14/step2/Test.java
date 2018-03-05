/**
 * 
 */
package com.finersoft.ch02.case14.step2;

/**
 * 名称： 说明：
 * 
 * @author Finersoft
 * @date 2018年3月5日
 */
public class Test {
	public static void main(String args[]) {
		Base b = new Base();
		Derived d = new Derived();
		
		System.out.println("Q:Are Base object equals to Derived object?");
		System.out.println("A:"+b.equals(d));

		// if (d.equals(b)) //Potentially true if Base attributes are equal
		// if (b.equals(d)) //Potentially true if Base attributes are equal
		// ...
	}

}
