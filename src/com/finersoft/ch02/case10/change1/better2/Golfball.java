/**
 * 
 */
package com.finersoft.ch02.case10.change1.better2;

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
	private StringBuffer brand;
	/**
	 * �ͺ�
	 */
	private StringBuffer make;
	/**
	 * ����
	 */
	private int compression;

	/**
	 * @param str
	 *            Ʒ��
	 * @param mk
	 *            �ͺ�
	 * @param comp
	 *            ����
	 */
	public Golfball(StringBuffer str, StringBuffer mk, int comp) {
		brand = str;
		make = mk;
		compression = comp;
	}

	/**
	 * @return Ʒ��
	 */
	public StringBuffer brand() {
		return brand;
	}

	/**
	 * @return �ͺ�
	 */
	public StringBuffer make() {
		return make;
	}

	/**
	 * @return ����
	 */
	public int compression() {
		return compression;
	}

	/**
	 * ��дObject��equals������
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 * @param obj
	 *            ���Ƚ϶���
	 * @return �Ƿ����
	 */
	@Override
	public boolean equals(Object obj) {
		// ��ַ�����ã�һ�£��϶���һ�������ˣ���Ȳ���ȣ����ǲ������Լ�
		if (this == obj) {
			return true;
		}
		// �������Ϊ�գ���ͬ���ͣ��ͼ����Ƚϣ����򣬿϶������ ��Classes are equal, downcast.��
		if (obj != null && getClass() == obj.getClass()) {
			Golfball gb = (Golfball) obj;
			// �Ƚ�ÿ������ֵ��Ȳ��� Compare attributes.��
			// �������������equals�Ƚϣ�����������==�Ƚ�
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
