package com.finersoft.ch02.case09;

/**
 * ���ƣ�����==��equals�����Ĳ�ͬ ˵������ԭ���ĸ�����ϳ���һ������ԭ���ĸ�����main�����е����ݷŵ����ĸ������С�
 * ����main���������ε��������ĸ�����
 * 
 * @author Finersoft
 * @date 2018��3��1��
 */
public class Test {

	/**
	 * ��һ�������main����
	 */
	public static void main1() {
		int a = 10;
		int b = 10;
		System.out.println("a==b is " + (a == b));

		Integer ia = new Integer(10);
		Integer ib = new Integer(10);
		// ������仰�����ϰ���Ͱͱ�̹淶�� ���еİ�װ�����֮��ֵ�ıȽϣ�ȫ��ʹ��equals�����Ƚϡ�
		// System.out.println("ia==ib is " + (ia == ib));
		System.out.println("ia.equals(ib) is " + (ia.equals(ib)));
	}

	/**
	 * �ڶ��������main����
	 */
	public static void main2() {
		int a = 10;
		int b = 10;
		System.out.println("a is " + a);
		System.out.println("b is " + b);
		System.out.println("a==b is " + (a == b));

		Integer ia = new Integer(10);
		Integer ib = new Integer(10);
		System.out.println("ia is " + ia);
		System.out.println("ib is " + ib);
		// ������仰�����ϰ���Ͱͱ�̹淶�� ���еİ�װ�����֮��ֵ�ıȽϣ�ȫ��ʹ��equals�����Ƚϡ�
		// System.out.println("ia==ib is " + (ia == ib));
		System.out.println("ia.equals(ib) is " + (ia.equals(ib)));
	}

	/**
	 * �����������main����
	 */
	public static void main3() {
		Integer ia = new Integer(10);
		Integer ib = new Integer(10);
		System.out.println("ia.equals(ib) is " + (ia.equals(ib)));
		System.out.println("ib.equals(ia) is " + (ib.equals(ia)));
	}

	/**
	 * ���ĸ������main����
	 */
	public static void main4() {
		int a = 10;
		float b = 10.0f;
		System.out.println("a is " + a);
		System.out.println("b is " + b);
		System.out.println("a==b is " + (a == b));

		Integer ia = new Integer(10);
		Float fa = new Float(10.0f);
		System.out.println("ia is " + ia);
		System.out.println("fa is " + fa);
		System.out.println("ia.equals(fa) is " + (ia.equals(fa)));
		System.out.println("fa.equals(ia) is " + (fa.equals(ia)));

		System.out.println("ia.floatValue() [" + ia.floatValue() + "]==fa.floatValue()[" + fa.floatValue() + "] is "
				+ (ia.floatValue() == fa.floatValue()));

	}

	/**
	 * ����������main����
	 */
	public static void main5() {
		Integer i = 127;
		Integer j = 127;

		Integer m = 65534;
		Integer n = 65534;

		// http://blog.csdn.net/chengzhezhijian/article/details/9628251
		// Java Integer(-128~127)ֵ��==��equals�Ƚϲ�����˼��
		// 		Ϊ�˽�ʡ�ڴ棬�������а�װ���������ʵ���������ǵĻ���ֵ��ͬʱ����������==��
		// 			Boolean
		// 			Byte
		// 			Character, \u0000 - \u007f(7f��ʮ���Ƶ�127)
		// 			Integer, -128 �� 127
		// ������仰�����ϰ���Ͱͱ�̹淶�� ���еİ�װ�����֮��ֵ�ıȽϣ�ȫ��ʹ��equals�����Ƚϡ�
		// System.out.println("i==j is " + (i == j));
		System.out.println(i.equals(j));
		// ������仰�����ϰ���Ͱͱ�̹淶�� ���еİ�װ�����֮��ֵ�ıȽϣ�ȫ��ʹ��equals�����Ƚϡ�
		// System.out.println("m==n is " + (m == n));
		System.out.println("m.equals(n) is " + (m.equals(n)));
		System.out.println(m.equals(n));

	}

	public static void main(String[] args) {

		main1();
		main2();
		main3();
		main4();
		main5();
	}

}
