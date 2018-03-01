package com.finersoft.ch01.case07;

/**
 * ���ƣ��˿��� ˵����
 * 
 * @author Finersoft
 * @date 2018��3��1��
 */
public class Customers {

	/**
	 * �û�ID����
	 */
	private long[] custIdArray;

	/**
	 * ��ʼ���û�
	 * 
	 * @param db
	 *            ���ݿ⣿
	 */
	public Customers(String db) {
		int num = queryDB(db);
		custIdArray = new long[num];
		for (int i = 0; i < num; i++) {
			// Some value from a database
			custIdArray[i] = getCustomerId(i);
			// representing a customer ID.

		}
	}

	/**
	 * ��ȡ�˿ͱ��
	 * 
	 * @param i
	 *            ��¼id
	 * @return �˿ͱ��
	 */
	private long getCustomerId(int i) {
		// TODO Auto-generated method stub
		return i + 1;
	}

	/**
	 * ��ȡ���ݼ�¼������
	 * 
	 * @return
	 */
	public int queryDB(String db) {
		return 0xFFFFFF;
	}

	/**
	 * ��custIdArray�ͷ�
	 */
	public void unrefCust() {
		custIdArray = null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
