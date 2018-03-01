package com.finersoft.ch01.case02;

/**
 * 名称：测试
 * 说明：测试final参数作用于整形等基本类型时的作用，即完全不能修改，编译都编译不过去的。
 * @author Finersoft
 * @date 2018年3月1日
 */
public class Test {

	static final int SOME_INT = 10;

	public static void main(String[] args) {
		//if cancel comments,you will get compiler info :"The final field Test.someInt cannot be assigned"
		// someInt = 9 ;
		System.out.println(SOME_INT);
	}

}
