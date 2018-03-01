package com.finersoft.case01;

import java.awt.Point;
/**
 * 
 * 名称：按值传递测试
 * 说明：本例旨在说明，所有的方法调用都是传递的参数值，引用传递是传递的对象地址（姑且这么认为吧）
 * @author Finersoft
 * @date 2018年3月1日
 */
public class PassByValue {

	/**
	 * 参数传递测试，用来说明参数传递是值传递
	 * @param pt 点对象，引用类型
	 * @param j 整形，基本类型
	 */
	public static void modifyPoint(Point pt, int j) {
		// 1st Position
		pt.setLocation(5, 5);
		j = 15;
		System.out.println("During modifyPoint pt = " + pt + " and j = " + j);
	}

	public static void main(String[] args) {
		// 2nd Position 
		Point p = new Point(0, 0);
		int i = 10;
		System.out.println("Before modifyPoint p = " + p + " and i = " + i);
		// 3rd Position
		modifyPoint(p, i);
		System.out.println("Before modifyPoint p = " + p + " and i = " + i);
	}

}
