package com.finersoft.ch01.case04;

import java.awt.Button;
import java.util.Vector;

/**
 * 
 * @author Finersoft
 *
 */
public class VectorTest {

	public static void main(String[] args) {
		int i = 1;
		int muchBigthanSize=100;
		int[] ia = new int[10];

		// add an int variable to an int array
		ia[0] = i;

		Button[] ba = new Button[10];
		// add an reference object  to an object array
		ba[0] = new Button("");

		Vector v = new Vector(10);
		v.add(new Button(""));
		//the book said int type is basic type,cannot add to vector ,i think code below runs an in-box operator
		v.add(i);
		v.add(new Integer(1));
		
		//code below shows Vector can add more items than defined length 
		for(int k = 0 ;k<muchBigthanSize;k++)
		{
			v.add(k+1);
		}

		for (int j = 0; j < v.size(); j++) {
			System.out.println((j + 1) + " " + v.get(j));
		}
	}

}
