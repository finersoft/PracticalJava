package com.finersoft.ch01.case03;
/**
 * 
 * @author Finersoft
 *
 */
public class Base {
	public void foo()
	{
		
	}
	public final void bar() {
		
	}
	public static void main(String[] args) {

	}
}

class Derived extends Base{
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
