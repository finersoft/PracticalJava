package com.finersoft.ch01.case04;

import java.awt.Button;
/**
 * 
 * @author Finersoft
 *
 */
public class ArrayTest {

	public static int ARRAY_SIZE = 3;

	public static void main(String[] args) {
		int[] ia = new int[ARRAY_SIZE];
		System.out.println("ia length is " + ia.length);

		for (int i = 0; i < ia.length; i++) {
			System.out.println("int array initially " + ia[i]);
		}

		for (int i = 0; i < ia.length; i++) {
			ia[i] = i + 1;
		}

		for (int i = 0; i < ia.length; i++) {
			System.out.println("int array now " + ia[i]);
		}

		Button[] oa = new Button[ARRAY_SIZE];

		for (int i = 0; i < oa.length; i++) {
			System.out.println("Button array initially " + oa[i]);
		}

		for (int i = 0; i < oa.length; i++) {
			oa[i] = new Button("button " + (i + 1));
		}

		for (int i = 0; i < oa.length; i++) {
			System.out.println("Button array now " + oa[i]);
		}
	}

}
