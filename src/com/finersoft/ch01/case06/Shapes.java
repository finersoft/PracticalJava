package com.finersoft.ch01.case06;

/**
 * ���ƣ���״�� ˵����
 * 
 * @author Finersoft
 * @date 2018��3��1��
 */
class Shape {

}

/**
 * ���ƣ�Բ���� ˵����
 * 
 * @author Finersoft
 * @date 2018��3��1��
 */
class Circle extends Shape {
	/**
	 * ����Բ�뾶
	 * 
	 * @return
	 */
	public double radius() {
		return 5.7d;
	}
}

/**
 * ���ƣ������� ˵����
 * 
 * @author Finersoft
 * @date 2018��3��1��
 */
class Triangle extends Shape {
	/**
	 * �ж��ǲ���ֱ��������
	 * 
	 * @return boolean trueΪֱ�������� false��ֱ��������
	 */
	public boolean isRightTriangle() {
		return true;
	}
}
/**
 * ���ƣ�Polynomial ��ʲô��˼��
 * ˵������������ת����ӵ���Shape�̳������޹�ϵ����
 * @author Finersoft
 * @date 2018��3��1��
 */
class Polynomial {

}

/**
 * ���ƣ���״���Ͳ��� ˵�������ڲ��Բ�ͬ����״����
 * @author Finersoft
 * @date 2018��3��1��
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
