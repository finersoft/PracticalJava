/**
 * 
 */
package com.finersoft.ch02.case14.step3;

/**
 * 名称：
 * 说明：
 * @author Finersoft
 * @date 2018年3月5日
 */
public class Derived extends Base {
	/**
	 * 子类的一个变量（属性）
	 */
	private int attributeOfDerived;
	  /** (non-Javadoc)
	 * @see com.finersoft.ch02.case14.step3.Base#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj)
	  {
	    if (obj instanceof Derived)
	    {
	    	return true;
	    }
	    return false ;
	    //...
	  }
}
