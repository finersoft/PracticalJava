/**
 * 
 */
package com.finersoft.ch02.case15;

/**
 * ���ƣ�ʵ��equals������ԭ�� 
 * ˵����
 * @author Finersoft
 * @date 2018��3��8��
 */
public class Principles {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("���ĳ�� class ����������ʹռ�ݲ�ͬ���ڴ�ռ䣬Ҳ�ɱ���Ϊ����\r\n" + 
		"������ȡ��Ļ�����ô���Ϊ��� class �ṩһ�� equals()��\r\n" + 
		"�����Ƿ���� this���μ�ʵ�� 12 ) ��\r\n" + 
		"�Ƚ���� class �е�������ԣ�ֵ��fields �������ж����������Ƿ��� ��\r\n" + 
		"���μ�ʵ�� 12 ����\r\n" + 
		"����� java.lang.Object ������κ� base class ʵ���� equals()�� ��ô��\r\n" + 
		"Ӧ�õ��� super.equals()���μ�ʵ�� 13 ����\r\n" + 
		"�� equals()��������� getClass()�� instanceof ����ȡ��ʱ����Ҫ��ϸ������\r\n" + 
		"�����⣺\r\n" + 
		"���ֻ����ͬһ�� class �������Ķ�����Ϊ��ȣ���ͨ��ʹ��\r\n" + 
		"getClass()���μ�ʵ�� 12 ����\r\n" + 
		"ֻ���ڲ��ò����� derived classes ������ base classes ������бȽϡ���\r\n" + 
		"�����У���ʹ�� instanceof���μ�ʵ�� 14����������Ӧ����������������\r\n" + 
		"�Ŀ�������͸����ԡ�\r\n" + 
		"���ʹ�� instanseof������ derived class �� base class ��ʵ���� equals() ��\r\n" + 
		"��һ��Ҫ֪�������ֱȽϲ���չ�ֳ���ν�ġ��Գ�����ԡ���symmetric\r\n" + 
		"equality ����");
	}

}
