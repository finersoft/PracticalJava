package com.finersoft.ch01.case07;

/**
 * 名称：顾客类 说明：
 * 
 * @author Finersoft
 * @date 2018年3月1日
 */
public class Customers {

	/**
	 * 用户ID数组
	 */
	private long[] custIdArray;

	/**
	 * 初始化用户
	 * 
	 * @param db
	 *            数据库？
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
	 * 获取顾客编号
	 * 
	 * @param i
	 *            记录id
	 * @return 顾客编号
	 */
	private long getCustomerId(int i) {
		// TODO Auto-generated method stub
		return i + 1;
	}

	/**
	 * 获取数据记录总数？
	 * 
	 * @return
	 */
	public int queryDB(String db) {
		return 0xFFFFFF;
	}

	/**
	 * 将custIdArray释放
	 */
	public void unrefCust() {
		custIdArray = null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
