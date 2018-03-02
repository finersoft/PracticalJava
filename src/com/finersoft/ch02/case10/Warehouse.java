/**
 * 
 */
package com.finersoft.ch02.case10;

/**
 * ���ƣ� ˵����
 * 
 * @author Finersoft
 * @date 2018��3��1��
 */
public class Warehouse {
	/**
	 * ��֤�Ƿ���ȣ���������бȽϽ�����ˣ������ע��
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

		// Ĭ�ϵ�equalsʹ�õ��Ƿǳ��򵥵ıȽ�
		// public boolean equals(Object obj)
		// {
		// return (this==obj);//�Ƚϵ��ǵ�ַ������ַ
		// }

	}

	/**
	 * �Ƚ����������ǲ������
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
	 * �Ƚ����������ǲ������,�޸�StringΪStringBuffer �ִ��ˣ���������ΪStringBuffer��equals��������
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
	 * �Ƚ����������ǲ������,�޸�StringΪStringBuffer �޸�equals����
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
	 * �Ƚ����������ǲ������,�޸�StringΪMyStringBuffer �޸�equals����
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
	 * �Ƚ����������ǲ������,�޸�StringΪStringBuffer �޸�equals����<br/>
	 * ��Golfball��������StringBuffer�ıȽϷ����������Ƚ�����StringBuffer�Ƿ����
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
	 *            ����
	 */
	public static void main(String[] args) {
		// ���¼�������˵����ԭ�� ��
		// ��Ҫ�Ƚ϶����Ƿ���ȣ��� class �������ṩһ����ȷ�� equals()��
		// ��[�뵱Ȼ�ĵ��� equals()]֮ǰ��Ӧ�ȼ�鲢ȷ������ʹ�õ� class ��ȷʵ���� equals()��
		// �������ʹ�õ� class ��δʵ�� equals()�����ж� java.lang.Object ��ȱʡ�����Ƿ��ʤ�Ρ�
		// ����޷�ʤ�Σ���Ӧ����ĳ���⸲�ࣨwrapper class���� subclass ��׫ д���Լ��� equals()��
		main1();
		main2();
		main3();
		main4();
		main5();
		main6();
	}

}
