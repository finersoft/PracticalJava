/**
 * 
 */
package com.finersoft.ch02.case14.step3;

/**
 * ���ƣ�
 * ˵����
 * @author Finersoft
 * @date 2018��3��5��
 */
public class Derived extends Base {
	/**
	 * �����һ�����������ԣ�
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
