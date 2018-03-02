/**
 * 
 */
package com.finersoft.ch02.case10;

/**
 * 名称：高尔夫球 说明：
 * 
 * @author Finersoft
 * @date 2018年3月1日
 */
public class Golfball {
	/**
	 * 品牌
	 */
	private String brand;
	/**
	 * 型号
	 */
	private String make;
	/**
	 * 弹性
	 */
	private int compression;

	/**
	 * @param str 品牌
	 * @param mk 型号
	 * @param comp 弹性
	 */
	public Golfball(String str, String mk, int comp) {
		brand = str;
		make = mk;
		compression = comp;
	}

	/**
	 * @return 品牌
	 */
	public String brand() {
		return brand;
	}

	/**
	 * @return 型号
	 */
	public String make() {
		return make;
	}

	/**
	 * @return 弹性
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
