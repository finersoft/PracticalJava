package com.finersoft.ch01.case07;

/**
 * 名称：测试Customers 说明：
 * 
 * @author Finersoft
 * @date 2018年3月1日
 */
public class Foo {

	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		long mem = rt.freeMemory();
		System.out.println("Free Memory is begin: " + mem);
		Customers cust = new Customers("SomeDataBase");
		mem = rt.freeMemory();
		System.out.println("Free Memory is then:  " + mem);
		// Use our Customers object to prime fields in a GUI.
		// ...
		// Customers object no longer needed.
		// ...
		// The rest of the app...
		cust.unrefCust();
		System.gc();
		mem = rt.freeMemory();
		System.out.println("Free Memory is then2: " + mem);
		cust = null;
		System.gc();
		mem = rt.freeMemory();
		System.out.println("Free Memory is now:   " + mem);

		// output result:
		// 			Free Memory is begin: 122830120
		// 			Free Memory is then:  123354400
		// 			Free Memory is then2: 258876640
		// 			Free Memory is now:   258878128

	}

}
