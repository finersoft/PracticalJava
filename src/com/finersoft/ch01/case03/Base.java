package com.finersoft.ch01.case03;
/**
 * 名称：基类
 * 说明：
 * @author Finersoft
 * @date 2018年3月1日
 */
public class Base {
	/**
	 * 一个叫foo的方法，可以被重写
	 */
	public void foo()
	{
		
	}
	/**
	 * 一个叫bar的方法，没有毛用，还不能被重写
	 */
	public final void bar() {
		
	}
	public static void main(String[] args) {

	}
}

class Derived extends Base{
	/**
	 * 重写一个叫foo的方法
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
