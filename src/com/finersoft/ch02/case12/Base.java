/**
 * 
 */
package com.finersoft.ch02.case12;

/**
 * ���ƣ����� ˵����
 * 
 * @author Finersoft
 * @date 2018��3��2��
 */
public class Base extends Object {
	/**
	 *
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (!getClass().equals(obj.getClass())) {
			return false;
		} else {
			// ���û���������Կ��ԱȽ��ˣ�ֱ�ӷ���true
			return true;
		}
	}
	
	

}
