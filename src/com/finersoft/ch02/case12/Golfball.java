/**
 * 
 */
package com.finersoft.ch02.case12;

/**
 * 名称：高尔夫球类 说明：
 * 
 * @author Finersoft
 * @date 2018年3月2日
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
	 * 完整参数构造函数
	 * @param str
	 * @param mk
	 * @param comp
	 */
	public Golfball(String str, String mk, int comp) {
		brand = str;
		make = mk;
		compression = comp;
	}

	/**
	 * 获取品牌
	 * @return
	 */
	public String brand() {
		return brand;
	}

	/**
	 * 获取型号
	 * @return
	 */
	public String make() {
		return make;
	}

	/**
	 * 获取弹性
	 * @return
	 */
	public int compression() {
		return compression;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (obj != null && getClass() == obj.getClass()) {
			// Classes are equal, downcast.Compare attributes.
			Golfball gb = (Golfball) obj;
			if (brand.equals(gb.brand()) && make.equals(gb.make()) && compression == gb.compression()) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Golfball gb1 = new Golfball("BrandX", "Professional", 100);
		Golfball gb2 = new Golfball("BrandX", "Professional", 100);
		// ...
		if (gb1.equals(gb2)) {
			System.out.println("Ball 1 equals Ball 2");
		} else {
			System.out.println("Ball 1 does not equal Ball 2");
		}

	}

}
