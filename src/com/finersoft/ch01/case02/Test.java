package com.finersoft.ch01.case02;

/**
 * ���ƣ�����
 * ˵��������final�������������εȻ�������ʱ�����ã�����ȫ�����޸ģ����붼���벻��ȥ�ġ�
 * @author Finersoft
 * @date 2018��3��1��
 */
public class Test {

	static final int SOME_INT = 10;

	public static void main(String[] args) {
		//if cancel comments,you will get compiler info :"The final field Test.someInt cannot be assigned"
		// someInt = 9 ;
		System.out.println(SOME_INT);
	}

}
