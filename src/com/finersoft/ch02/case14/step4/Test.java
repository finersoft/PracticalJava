/**
 * 
 */
package com.finersoft.ch02.case14.step4;

/**
 * ���ƣ� ˵����
 * 
 * @author Finersoft
 * @date 2018��3��5��
 */
public class Test {
	public static void main(String args[]) {
		Base b = new Base();
		Derived d = new Derived();
		
		System.out.println("Q:Are Base object equals to Derived object?");
		System.out.println("A:"+b.equals(d));
		
		System.out.println("Q:Are Derived object equals to Base object?");
		System.out.println("A:"+d.equals(b));
		
		// Q:Are Base object equals to Derived object?
		// A:true
		// Q:Are Derived object equals to Base object?
		// A:false



	}

}
