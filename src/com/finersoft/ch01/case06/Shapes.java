package com.finersoft.ch01.case06;

/**
 * 名称：形状类 说明：
 * 
 * @author Finersoft
 * @date 2018年3月1日
 */
class Shape {

}

/**
 * 名称：圆形类 说明：
 * 
 * @author Finersoft
 * @date 2018年3月1日
 */
class Circle extends Shape {
	/**
	 * 返回圆半径
	 * 
	 * @return
	 */
	public double radius() {
		return 5.7d;
	}
}

/**
 * 名称：三角形 说明：
 * 
 * @author Finersoft
 * @date 2018年3月1日
 */
class Triangle extends Shape {
	/**
	 * 判断是不是直角三角形
	 * 
	 * @return boolean true为直角三角形 false非直角三角形
	 */
	public boolean isRightTriangle() {
		return true;
	}
}
/**
 * 名称：Polynomial 是什么意思？
 * 说明：测试类型转换添加的与Shape继承树毫无关系的类
 * @author Finersoft
 * @date 2018年3月1日
 */
class Polynomial {

}

/**
 * 名称：形状类型测试 说明：用于测试不同的形状类型
 * @author Finersoft
 * @date 2018年3月1日
 */
public class Shapes {

	public static void main(String[] args) {
		Shape shape1 = new Circle();
		Object shape2 = new Triangle();
		Object obj = new Object();
		// Compiler Error:"Cannot cast from Shape to Polynomial"
		// Polynomial poly = (Polynomial ) shape1;
		// Runtime Error:"java.lang.Object cannot be cast to
		// com.finersoft.ch01.case06.Polynomial"
		// Polynomial poly2 = (Polynomial)obj;
		// Runtime Error:"com.finersoft.ch01.case06.Circle cannot be cast to
		// com.finersoft.ch01.case06.Triangle"
		// Triangle tri= (Triangle )shape1;
		Triangle tri2 = (Triangle) shape2;

	}

}
