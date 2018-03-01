package com.finersoft.ch01.case07;

import java.awt.Button;

/**
 * ���ƣ������������� ˵����
 * 
 * @author Finersoft
 * @date 2018��3��1��
 */
public class TestGC {

	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		long mem = rt.freeMemory();
		System.out.println("Free Memory is begin: " + mem);
		// when array length is 1000
		// 		Free Memory is begin: 122830120
		// 		Free Memory is then:  120879312
		// 		Free Memory is now:   123843424
		// when array length is 100000
		// 		Free Memory is begin: 122830120
		// 		Free Memory is then:  82492720
		// 		Free Memory is now:   156341624
		// when array length is 1000000
		// 		Free Memory is begin: 122830120
		// 		Free Memory is then:  316840072 //may jvm allot more memory 
		// 		Free Memory is now:   717854064
		Button[] btns = new Button[1000000];
		for (int i = 0; i < btns.length; i++) {
			btns[i] = new Button("button " + i);
		}
		mem = rt.freeMemory();
		System.out.println("Free Memory is then:  " + mem);
		// ִ��һЩ����:���������null
		for (int i = 0; i < btns.length; i++) {
			btns[i] = null;
		}
		btns = null;
		System.gc();
		// ִ������һЩ����
		mem = rt.freeMemory();
		System.out.println("Free Memory is now:   " + mem);

	}

}
