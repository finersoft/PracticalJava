package com.finersoft.ch01.case03;
/**
 * ���ƣ�����
 * ˵����
 * @author Finersoft
 * @date 2018��3��1��
 */
public class Base {
	/**
	 * һ����foo�ķ��������Ա���д
	 */
	public void foo()
	{
		
	}
	/**
	 * һ����bar�ķ�����û��ë�ã������ܱ���д
	 */
	public final void bar() {
		
	}
	public static void main(String[] args) {

	}
}

class Derived extends Base{
	/**
	 * ��дһ����foo�ķ���
	 */
	@Override
	public void foo() {
		//Overriding Base.foo();
	}
	//if cancel comments,you will get compiler info :"Cannot override the final method from Base"
	/*
	@Override
	public void bar() {
		//Attempting to  Override Base.bar();
	}
	*/
}
