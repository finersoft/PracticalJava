package com.finersoft.ch01.case02;
/**
 * ���ƣ�Բ��
 * ˵����
 * @author Finersoft
 * @date 2018��3��1��
 */
class Circle{
	/**
	 * radius
	 */
	private double rad ;
	public Circle(double rad )
	{
		this.rad= rad ; 
	}
	public double getRad() {
		return rad;
	}
	public void setRad(double rad) {
		this.rad = rad;
	}
	
	
}
/**
 * ���ƣ�Final�ؼ����������������͵Ĳ���
 * ˵���������������͵ĵ�ַ�����Ըı䣬���Ǹõ�ַָ��Ķ����е������ǿ��Ա仯��
 * ��������newһ���������¸�ֵ����final���ö��󣬵��ǿ��Ե��ö��󷽷����޸Ķ��������
 * @author Finersoft
 * @date 2018��3��1��
 */
public class FinalTest {
	
	private static final Circle WHEEL =  new Circle(5.0);

	public static void main(String[] args) {
		System.out.println("Radius of WHEEL is "+WHEEL.getRad());
		WHEEL.setRad(7.4);
		//if cancel comments,you will get compiler info :"The final field FinalTest.WHEEL cannot be assigned"
		//WHEEL= new Circle(7.4);
		System.out.println("Radius of WHEEL is now "+WHEEL.getRad());

	}

}
