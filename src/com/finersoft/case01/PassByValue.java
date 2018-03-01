package com.finersoft.case01;

import java.awt.Point;
/**
 * 
 * ���ƣ���ֵ���ݲ���
 * ˵��������ּ��˵�������еķ������ö��Ǵ��ݵĲ���ֵ�����ô����Ǵ��ݵĶ����ַ��������ô��Ϊ�ɣ�
 * @author Finersoft
 * @date 2018��3��1��
 */
public class PassByValue {

	/**
	 * �������ݲ��ԣ�����˵������������ֵ����
	 * @param pt �������������
	 * @param j ���Σ���������
	 */
	public static void modifyPoint(Point pt, int j) {
		// 1st Position
		pt.setLocation(5, 5);
		j = 15;
		System.out.println("During modifyPoint pt = " + pt + " and j = " + j);
	}

	public static void main(String[] args) {
		// 2nd Position 
		Point p = new Point(0, 0);
		int i = 10;
		System.out.println("Before modifyPoint p = " + p + " and i = " + i);
		// 3rd Position
		modifyPoint(p, i);
		System.out.println("Before modifyPoint p = " + p + " and i = " + i);
	}

}
