/**
 * 
 */
package com.finersoft.ch02.case10.change1.better4;

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
	 * �Ƚ�����StringBuffer�����Ƿ����
	 * 
	 * @param sb1
	 *            ԴStringBuffer����
	 * @param sb2
	 *            Ŀ��StringBuffer����
	 * @return boolean �Ƿ����
	 */
	static boolean compare(StringBuffer sb1, StringBuffer sb2) {
		if (sb1 == sb2) {
			return true;
		}

		if (sb1 != null && sb2 != null) {
			int len = sb1.length();
			// If lengths are not equal,strings can't be either.
			if (len != sb2.length()) {
				return false;
			}

			int index = 0;
			while (index != len) {
				if (sb1.charAt(index) != sb2.charAt(index)) {
					return false;
				} else {
					index++;
				}
			}
			return true;
		}
		return false;
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
			if (compare(brand, gb.brand()) && compare(make, gb.make()) && compression == gb.compression()) {
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
