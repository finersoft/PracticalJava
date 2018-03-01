package com.finersoft.ch01.case07;

import java.awt.Button;

/**
 * ���ƣ��������� ˵����
 * 
 * @author Finersoft
 * @date 2018��3��1��
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
 * ���ƣ�����һ����������һ���������� ˵����
 * 
 * @author Finersoft
 * @date 2018��3��1��
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
