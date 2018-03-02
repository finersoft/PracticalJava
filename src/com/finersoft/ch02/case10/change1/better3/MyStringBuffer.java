/**
 * 
 */
package com.finersoft.ch02.case10.change1.better3;

/**
 * 名称：自定义StringBuffer类，来解决StringBuffer的equals问题 说明：
 * 
 * @author Finersoft
 * @date 2018年3月1日
 */
public class MyStringBuffer {

	/**
	 * has-a StringBuffer Object
	 */
	private StringBuffer stringbuf;

	/**
	 * 构造函数
	 * 
	 * @param str
	 *            StringBuffer内容
	 */
	public MyStringBuffer(String str) {
		stringbuf = new StringBuffer(str);
	}

	/**
	 * @return 内部StringBuffer对象的长度
	 */
	public int length() {
		return stringbuf.length();
	}

	/**
	 * @param index
	 *            待查询字符位置
	 * @return 查询位置的字符
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
