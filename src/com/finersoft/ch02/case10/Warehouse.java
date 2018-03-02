/**
 * 
 */
package com.finersoft.ch02.case10;

/**
 * 名称： 说明：
 * 
 * @author Finersoft
 * @date 2018年3月1日
 */
public class Warehouse {
	/**
	 * 验证是否相等，这个方法中比较结果错了，详情见注释
	 */
	public static void main1() {
		com.finersoft.ch02.case10.Golfball gb1 = new com.finersoft.ch02.case10.Golfball("BrandX", "Professional", 100);
		com.finersoft.ch02.case10.Golfball gb2 = new com.finersoft.ch02.case10.Golfball("BrandX", "Professional", 100);
		// ...
		if (gb1.equals(gb2)) {
			System.out.println("Ball 1 equals Ball 2");
		} else {
			System.out.println("Ball 1 does not equal Ball 2");
		}

		// output Result :
		// Ball 1 does not equal Ball 2

		// 默认的equals使用的是非常简单的比较
		// public boolean equals(Object obj)
		// {
		// return (this==obj);//比较的是地址啊，地址
		// }

	}

	/**
	 * 比较两个对象是不是相等
	 */
	public static void main2() {
		com.finersoft.ch02.case10.better1.Golfball gb1 = new com.finersoft.ch02.case10.better1.Golfball("BrandX",
				"Professional", 100);
		com.finersoft.ch02.case10.better1.Golfball gb2 = new com.finersoft.ch02.case10.better1.Golfball("BrandX",
				"Professional", 100);
		// ...
		if (gb1.equals(gb2)) {
			System.out.println("Ball 1 equals Ball 2");
		} else {
			System.out.println("Ball 1 does not equal Ball 2");
		}

	}

	/**
	 * 比较两个对象是不是相等,修改String为StringBuffer 又错了，哈哈，因为StringBuffer的equals方法不对
	 */
	public static void main3() {
		com.finersoft.ch02.case10.change1.Golfball gb1 = new com.finersoft.ch02.case10.change1.Golfball(
				new StringBuffer("BrandX"), new StringBuffer("Professional"), 100);
		com.finersoft.ch02.case10.change1.Golfball gb2 = new com.finersoft.ch02.case10.change1.Golfball(
				new StringBuffer("BrandX"), new StringBuffer("Professional"), 100);
		// ...
		if (gb1.equals(gb2)) {
			System.out.println("Ball 1 equals Ball 2");
		} else {
			System.out.println("Ball 1 does not equal Ball 2");
		}

	}

	/**
	 * 比较两个对象是不是相等,修改String为StringBuffer 修改equals方法
	 */
	public static void main4() {
		com.finersoft.ch02.case10.change1.better2.Golfball gb1 = new com.finersoft.ch02.case10.change1.better2.Golfball(
				new StringBuffer("BrandX"), new StringBuffer("Professional"), 100);
		com.finersoft.ch02.case10.change1.better2.Golfball gb2 = new com.finersoft.ch02.case10.change1.better2.Golfball(
				new StringBuffer("BrandX"), new StringBuffer("Professional"), 100);
		// ...
		if (gb1.equals(gb2)) {
			System.out.println("Ball 1 equals Ball 2");
		} else {
			System.out.println("Ball 1 does not equal Ball 2");
		}

	}

	/**
	 * 比较两个对象是不是相等,修改String为MyStringBuffer 修改equals方法
	 */
	public static void main5() {
		com.finersoft.ch02.case10.change1.better3.Golfball gb1 = new com.finersoft.ch02.case10.change1.better3.Golfball(
				new com.finersoft.ch02.case10.change1.better3.MyStringBuffer("BrandX"),
				new com.finersoft.ch02.case10.change1.better3.MyStringBuffer("Professional"), 100);
		com.finersoft.ch02.case10.change1.better3.Golfball gb2 = new com.finersoft.ch02.case10.change1.better3.Golfball(
				new com.finersoft.ch02.case10.change1.better3.MyStringBuffer("BrandX"),
				new com.finersoft.ch02.case10.change1.better3.MyStringBuffer("Professional"), 100);
		// ...
		if (gb1.equals(gb2)) {
			System.out.println("Ball 1 equals Ball 2");
		} else {
			System.out.println("Ball 1 does not equal Ball2");
		}

	}

	/**
	 * 比较两个对象是不是相等,修改String为StringBuffer 修改equals方法<br/>
	 * 在Golfball类中增加StringBuffer的比较方法，用来比较两个StringBuffer是否相等
	 */
	public static void main6() {
		com.finersoft.ch02.case10.change1.better4.Golfball gb1 = new com.finersoft.ch02.case10.change1.better4.Golfball(
				new StringBuffer("BrandX"), new StringBuffer("Professional"), 100);
		com.finersoft.ch02.case10.change1.better4.Golfball gb2 = new com.finersoft.ch02.case10.change1.better4.Golfball(
				new StringBuffer("BrandX"), new StringBuffer("Professional"), 100);
		// ...
		if (gb1.equals(gb2)) {
			System.out.println("Ball 1 equals Ball 2");
		} else {
			System.out.println("Ball 1 does not equal Ball2");
		}

	}

	/**
	 * @param args
	 *            参数
	 */
	public static void main(String[] args) {
		// 以下几个方法说明的原则 ：
		// 若要比较对象是否相等，其 class 有责任提供一个正确的 equals()。
		// 在[想当然的调用 equals()]之前，应先检查并确保你所使用的 class 的确实现了 equals()。
		// 如果你所使用的 class 并未实现 equals()，请判断 java.lang.Object 的缺省函数是否可胜任。
		// 如果无法胜任，就应该在某个外覆类（wrapper class）或 subclass 中撰 写你自己的 equals()。
		main1();
		main2();
		main3();
		main4();
		main5();
		main6();
	}

}
