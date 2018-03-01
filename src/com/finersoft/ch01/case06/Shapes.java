package com.finersoft.ch01.case06;

/**
 * 名称：形状 说明：所有形状的基类
 * @author Finersoft
 * @date 2018年3月1日
 */
class Shape {

}

/**
 * 名称：圆 说明：
 * @author Finersoft
 * @date 2018年3月1日
 */
class Circle extends Shape {

}

/**
 * 名称：三角形 说明：
 * @author Finersoft
 * @date 2018年3月1日
 */
class Triangle extends Shape {

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
