package com.finersoft.ch01.case06;

import java.util.Vector;



/**
 * ���ƣ�����Vector��ȡ����ʱ��instanceof���� ˵����
 * 
 * @author Finersoft
 * @date 2018��3��1��
 */
/**
 * ���ƣ� ˵����
 * 
 * @author Finersoft
 * @date 2018��3��1��
 */
public class StoreShapes {

	public static void main(String[] args) {

		Vector shapeVector = new Vector(10);
		shapeVector.add(new Triangle());
		shapeVector.add(new Triangle());
		shapeVector.add(new Circle());
		
		for(int i=0;i<shapeVector.size();i++)
		{
			Object o = shapeVector.get(i);
			if(o instanceof Triangle)
			{
				if(((Triangle)o).isRightTriangle())
				{
					System.out.println( o+" is a RightTriangle ");
					
				}
			}
			else if (o instanceof Circle)
			{
				System.out.println(((Circle)o).radius());
			}
		}

	}

}
