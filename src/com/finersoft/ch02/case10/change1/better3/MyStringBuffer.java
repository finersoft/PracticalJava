/**
 * 
 */
package com.finersoft.ch02.case10.change1.better3;

/**
 * ���ƣ��Զ���StringBuffer�࣬�����StringBuffer��equals���� ˵����
 * 
 * @author Finersoft
 * @date 2018��3��1��
 */
public class MyStringBuffer {

	/**
	 * has-a StringBuffer Object
	 */
	private StringBuffer stringbuf;

	/**
	 * ���캯��
	 * 
	 * @param str
	 *            StringBuffer����
	 */
	public MyStringBuffer(String str) {
		stringbuf = new StringBuffer(str);
	}

	/**
	 * @return �ڲ�StringBuffer����ĳ���
	 */
	public int length() {
		return stringbuf.length();
	}

	/**
	 * @param index
	 *            ����ѯ�ַ�λ��
	 * @return ��ѯλ�õ��ַ�
	 */
	public synchronized char charAt(int index) {
		return (stringbuf.charAt(index));
	}


	/** (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (obj != null && getClass() == obj.getClass()) {
			 // Classes equal, downcast.
			MyStringBuffer sb = (MyStringBuffer) obj;
			int len = length();
			 // If lengths are not equal, strings
			if (len != sb.length())
			{
				// can't be either.
				return false; 
			}

			int index = 0;
			// Compare the strings.
			while (index != len) 
			{
				if (charAt(index) != sb.charAt(index)) {
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
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
