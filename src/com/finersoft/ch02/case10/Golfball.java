/**
 * 
 */
package com.finersoft.ch02.case10;

/**
 * ���ƣ��߶����� ˵����
 * 
 * @author Finersoft
 * @date 2018��3��1��
 */
public class Golfball {
	/**
	 * Ʒ��
	 */
	private String brand;
	/**
	 * �ͺ�
	 */
	private String make;
	/**
	 * ����
	 */
	private int compression;

	/**
	 * @param str Ʒ��
	 * @param mk �ͺ�
	 * @param comp ����
	 */
	public Golfball(String str, String mk, int comp) {
		brand = str;
		make = mk;
		compression = comp;
	}

	/**
	 * @return Ʒ��
	 */
	public String brand() {
		return brand;
	}

	/**
	 * @return �ͺ�
	 */
	public String make() {
		return make;
	}

	/**
	 * @return ����
	 */
	public int compression() {
		return compression;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
