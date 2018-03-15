package com.finersoft.ch03.case16;

import java.awt.Button;
import java.io.IOException;
import java.util.Vector;

/**
 * ���ƣ��쳣������ ˵����
 * 
 * @author Finersoft
 * @date 2018��3��15��
 */
public class ExceptionTest {

	public static void main(String args[]) {
		System.out.println("Entering main()");
		ExceptionTest et = new ExceptionTest();
		try {
			System.out.println("Calling m1()");
			et.m1();
			 // 1 ��ӡm1�����ɹ�ִ��
			System.out.println("Returning from call to m1()");
		} catch (Exception e) {
			System.out.println("Caught IOException in main()");
		}
		System.out.println("Exiting main()");
	}

	public void m1() throws IOException {
		System.out.println("Entering m1()");
		Button b1 = new Button();
		try {
			System.out.println("Calling m2()");
			m2();
			System.out.println("Returning from call to m2()");
			System.out.println("Calling m3()");
			m3(true);
			 // 2 ��ӡm3�����ɹ�ִ��
			System.out.println("Returning from call to m3()");
		} catch (IOException e) {
			System.out.println("Caught IOException in " + "m1()...rethrowing");
			 // 3 ��m1�����������׳�IO�쳣
			throw e;
		} finally {
			System.out.println("In finally for m1()");
		}
		// 4 ��ӡm1�����˳�
		System.out.println("Exiting m1()"); 
	}

	public void m2() {
		System.out.println("Entering m2()");
		try {
			Vector v = new Vector(5);
		} catch (IllegalArgumentException iae) {
			 // 5 
			System.out.println("Caught " + "IllegalArgumentException in m2()");
		} finally {
			System.out.println("In finally for m2()");
		}
		System.out.println("Exiting m2()");
	}

	public void m3(boolean genExc) throws IOException {
		System.out.println("Entering m3()");
		try {
			Button b3 = new Button();
			if (genExc) {
				throw new IOException();
			}
		} finally {
			System.out.println("In finally for m3()");
		}
		// 6
		System.out.println("Exiting m3()"); 
	}

}
