/**
 * 
 */
package com.finersoft.ch02.case14.step3;

/**
 * ���ƣ� ˵����
 * 
 * @author Finersoft
 * @date 2018��3��5��
 */
public class Base {
	private int attributeOfBase;

	/**
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Base) {
			return true;
		}
		// ...
		return false;
	}
}
