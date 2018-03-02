/**
 * 
 */
package com.finersoft.ch02.case13.better2;

import com.finersoft.ch02.case13.*;

/**
 * ���ƣ�����˸������Եĸ߶�����
 * 
 * @author Finersoft
 * @date 2018��3��2��
 */
public class MyGolfball extends Golfball {
	public final static byte TWOPIECE = 0;
	public final static byte THREEPIECE = 1;

	/**
	 * ����
	 */
	private byte ballConstruction;

	/**
	 * �����������캯��
	 * 
	 * @param str
	 * @param mk
	 * @param comp
	 * @param construction
	 */
	public MyGolfball(String str, String mk, int comp, byte construction) {
		super(str, mk, comp);
		ballConstruction = construction;
	}

	public byte construction() {
		return ballConstruction;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.finersoft.ch02.case13.Golfball#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (super.equals(obj)) {
			// Class equal, downcast.
			MyGolfball gb = (MyGolfball) obj;
			if (ballConstruction == gb.construction()) {
				return true;
			}
		}
		return false;
	}
}
