package com.finersoft.ch01.case07;

import java.awt.Button;

/**
 * 名称：大大大大对象 说明：
 * 
 * @author Finersoft
 * @date 2018年3月1日
 */
class BigObject {
	Button[] btns;

	public BigObject() {
		Button[] btns = new Button[10000];
		for (int i = 0; i < btns.length; i++) {
			btns[i] = new Button("button " + i);
		}
	}
}

/**
 * 名称：测试一个方法中有一个大大大大对象 说明：
 * 
 * @author Finersoft
 * @date 2018年3月1日
 */
public class BigObjectInMethodTest {

	public void someMethod(Runtime rt, long mem) {
		mem = rt.freeMemory();
		System.out.println("inner startM:" + mem);

		BigObject bigObj = new BigObject();

		mem = rt.freeMemory();
		System.out.println("inner inited:" + mem);

		bigObj = null;

		mem = rt.freeMemory();
		System.out.println("inner befrGC:" + mem);

		System.gc();

		mem = rt.freeMemory();
		System.out.println("inner aftrGC:" + mem);
	}

	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();

		long mem = rt.freeMemory();
		System.out.println("start Memory:" + mem);

		new BigObjectInMethodTest().someMethod(rt, mem);

		mem = rt.freeMemory();
		System.out.println("end Memory  :" + mem);
		
		//output result:
		//		start Memory:122830048
		//		inner startM:122830048
		//		inner inited:116325528
		//		inner befrGC:116325528
		//		inner aftrGC:123832408
		//		end Memory  :123182248

	}

}
