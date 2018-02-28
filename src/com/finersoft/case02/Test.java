package com.finersoft.case02;
/**
 * 
 * @author Finersoft
 *
 */
public class Test {

	static final int SOME_INT = 10;

	public static void main(String[] args) {
		//if cancel comments,you will get compiler info :"The final field Test.someInt cannot be assigned"
		// someInt = 9 ;
		System.out.println(SOME_INT);
	}

}
