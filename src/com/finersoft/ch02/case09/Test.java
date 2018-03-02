package com.finersoft.ch02.case09;

/**
 * 名称：测试==和equals方法的不同 说明：将原来四个程序合成了一个，将原来四个程序main方法中的内容放到了四个方法中。
 * 并在main方法中依次调用了这四个方法
 * 
 * @author Finersoft
 * @date 2018年3月1日
 */
public class Test {

	/**
	 * 第一个代码的main方法
	 */
	public static void main1() {
		int a = 10;
		int b = 10;
		System.out.println("a==b is " + (a == b));

		Integer ia = new Integer(10);
		Integer ib = new Integer(10);
		// 下面这句话不符合阿里巴巴编程规范： 所有的包装类对象之间值的比较，全部使用equals方法比较。
		// System.out.println("ia==ib is " + (ia == ib));
		System.out.println("ia.equals(ib) is " + (ia.equals(ib)));
	}

	/**
	 * 第二个代码的main方法
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
		// 下面这句话不符合阿里巴巴编程规范： 所有的包装类对象之间值的比较，全部使用equals方法比较。
		// System.out.println("ia==ib is " + (ia == ib));
		System.out.println("ia.equals(ib) is " + (ia.equals(ib)));
	}

	/**
	 * 第三个代码的main方法
	 */
	public static void main3() {
		Integer ia = new Integer(10);
		Integer ib = new Integer(10);
		System.out.println("ia.equals(ib) is " + (ia.equals(ib)));
		System.out.println("ib.equals(ia) is " + (ib.equals(ia)));
	}

	/**
	 * 第四个代码的main方法
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
	 * 第五个代码的main方法
	 */
	public static void main5() {
		Integer i = 127;
		Integer j = 127;

		Integer m = 65534;
		Integer n = 65534;

		// http://blog.csdn.net/chengzhezhijian/article/details/9628251
		// Java Integer(-128~127)值的==和equals比较产生的思考
		// 		为了节省内存，对于下列包装对象的两个实例，当它们的基本值相同时，他们总是==：
		// 			Boolean
		// 			Byte
		// 			Character, \u0000 - \u007f(7f是十进制的127)
		// 			Integer, -128 — 127
		// 下面这句话不符合阿里巴巴编程规范： 所有的包装类对象之间值的比较，全部使用equals方法比较。
		// System.out.println("i==j is " + (i == j));
		System.out.println(i.equals(j));
		// 下面这句话不符合阿里巴巴编程规范： 所有的包装类对象之间值的比较，全部使用equals方法比较。
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
