package com.finersoft.ch01.case06;

import java.util.Vector;



/**
 * 名称：测试Vector中取对象时用instanceof操作 说明：
 * 
 * @author Finersoft
 * @date 2018年3月1日
 */
/**
 * 名称： 说明：
 * 
 * @author Finersoft
 * @date 2018年3月1日
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
