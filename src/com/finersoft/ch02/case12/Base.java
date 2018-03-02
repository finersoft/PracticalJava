/**
 * 
 */
package com.finersoft.ch02.case12;

/**
 * 名称：基类 说明：
 * 
 * @author Finersoft
 * @date 2018年3月2日
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
			// 这儿没有其他属性可以比较了，直接返回true
			return true;
		}
	}
	
	

}
