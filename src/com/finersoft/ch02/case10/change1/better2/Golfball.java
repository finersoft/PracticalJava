/**
 * 
 */
package com.finersoft.ch02.case10.change1.better2;

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
	private StringBuffer brand;
	/**
	 * 型号
	 */
	private StringBuffer make;
	/**
	 * 弹性
	 */
	private int compression;

	/**
	 * @param str
	 *            品牌
	 * @param mk
	 *            型号
	 * @param comp
	 *            弹性
	 */
	public Golfball(StringBuffer str, StringBuffer mk, int comp) {
		brand = str;
		make = mk;
		compression = comp;
	}

	/**
	 * @return 品牌
	 */
	public StringBuffer brand() {
		return brand;
	}

	/**
	 * @return 型号
	 */
	public StringBuffer make() {
		return make;
	}

	/**
	 * @return 弹性
	 */
	public int compression() {
		return compression;
	}

	/**
	 * 重写Object的equals方法。
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 * @param obj
	 *            待比较对象
	 * @return 是否相等
	 */
	@Override
	public boolean equals(Object obj) {
		// 地址（引用）一致，肯定是一个对象了，相等不相等？你是不是你自己
		if (this == obj) {
			return true;
		}
		// 如果对象不为空，且同类型，就继续比较，否则，肯定不相等 （Classes are equal, downcast.）
		if (obj != null && getClass() == obj.getClass()) {
			Golfball gb = (Golfball) obj;
			// 比较每个属性值相等不（ Compare attributes.）
			// 这儿引用类型用equals比较，基本类型用==比较
			if (brand.toString().equals(gb.brand().toString()) && make.toString().equals(gb.make().toString())
					&& compression == gb.compression()) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
