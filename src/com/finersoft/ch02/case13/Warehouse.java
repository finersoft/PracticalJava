/**
 * 
 */
package com.finersoft.ch02.case13;

/**
 * ���ƣ��ֿ⣬�������Ը߶����� ˵����
 * 
 * @author Finersoft
 * @date 2018��3��2��
 */
public class Warehouse {
	
	static void main1()
	{
		MyGolfball gb1 = new MyGolfball("BrandX", "Professional", 100, MyGolfball.TWOPIECE);
		MyGolfball gb2 = new MyGolfball("BrandX", "Professional", 100, MyGolfball.TWOPIECE);
		// ...
		if (gb1.equals(gb2)) {
			System.out.println("Ball 1 equals Ball 2");
		} else {
			System.out.println("Ball 1 does not equal Ball 2");
		}
	}
	
	static void main2()
	{
		MyGolfball gb1 = new MyGolfball("BrandX", "Professional", 100, MyGolfball.TWOPIECE);
		MyGolfball gb2 = new MyGolfball("BrandX", "Professional", 90, MyGolfball.TWOPIECE);
		// ...
		if (gb1.equals(gb2)) {
			System.out.println("Ball 1 equals Ball 2");
		} else {
			System.out.println("Ball 1 does not equal Ball 2");
		}
	}

	
	static void main3()
	{
		com.finersoft.ch02.case13.better1.MyGolfball gb1 = new com.finersoft.ch02.case13.better1.MyGolfball("BrandX", "Professional", 100, MyGolfball.TWOPIECE);
		com.finersoft.ch02.case13.better1.MyGolfball gb2 = new com.finersoft.ch02.case13.better1.MyGolfball("BrandX", "Professional", 90, MyGolfball.TWOPIECE);
		// ...
		if (gb1.equals(gb2)) {
			System.out.println("Ball 1 equals Ball 2");
		} else {
			System.out.println("Ball 1 does not equal Ball 2");
		}
	}
	
	static void main4()
	{
		com.finersoft.ch02.case13.better2.MyGolfball gb1 = new com.finersoft.ch02.case13.better2.MyGolfball("BrandX", "Professional", 100, MyGolfball.TWOPIECE);
		com.finersoft.ch02.case13.better2.MyGolfball gb2 = new com.finersoft.ch02.case13.better2.MyGolfball("BrandX", "Professional", 90, MyGolfball.TWOPIECE);
		// ...
		if (gb1.equals(gb2)) {
			System.out.println("Ball 1 equals Ball 2");
		} else {
			System.out.println("Ball 1 does not equal Ball 2");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		main1();
		main2();
		main3();
		main4();
	}

}
