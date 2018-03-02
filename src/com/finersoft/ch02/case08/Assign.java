package com.finersoft.ch02.case08;

import java.awt.Point;

/**
 * 名称：引用类型和值类型比较
 * 说明：
 * @author Finersoft
 * @date 2018年3月1日
 */
public class Assign {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		Point x = new Point(0, 0);
		//key  1
		Point y = new Point(1, 1); 

		Integer i = new Integer(1);
		Integer j = new Integer(2);

		Integer m = new Integer(0xFFF0);
		Integer n = new Integer(0xFFF1);

		System.out.println("a is " + a);
		System.out.println("b is " + b);
		System.out.println("x is " + x);
		System.out.println("y is " + y);
		System.out.println("i is " + i);
		System.out.println("j is " + j);
		System.out.println("m is " + m);
		System.out.println("n is " + n);
		System.out.println("Performing assignment and " + "setLocation...");
		a = b;
		a++;
		 //key 2
		x = y;
		//key  3
		x.setLocation(5, 5); 

		i = j;
		i++;

		m = n;
		m++;

		System.out.println("a is " + a);
		System.out.println("b is " + b);
		System.out.println("x is " + x);
		System.out.println("y is " + y);
		System.out.println("i is " + i);
		System.out.println("j is " + j);
		System.out.println("m is " + m);
		System.out.println("n is " + n);

	}

}
