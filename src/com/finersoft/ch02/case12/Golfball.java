/**
 * 
 */
package com.finersoft.ch02.case12;

/**
 * ���ƣ��߶������� ˵����
 * 
 * @author Finersoft
 * @date 2018��3��2��
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
	 * �����������캯��
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
	 * ��ȡƷ��
	 * @return
	 */
	public String brand() {
		return brand;
	}

	/**
	 * ��ȡ�ͺ�
	 * @return
	 */
	public String make() {
		return make;
	}

	/**
	 * ��ȡ����
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
