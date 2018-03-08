/**
 * 
 */
package com.finersoft.ch02.case15;

/**
 * 名称：实现equals方法的原则 
 * 说明：
 * @author Finersoft
 * @date 2018年3月8日
 */
public class Principles {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("如果某个 class 的两个对象即使占据不同的内存空间，也可被视为「逻\r\n" + 
		"辑上相等」的话，那么你得为这个 class 提供一个 equals()。\r\n" + 
		"请检查是否等于 this（参见实践 12 ) 。\r\n" + 
		"比较这个 class 中的相关属性（值域，fields ），以判断两个对象是否相 等\r\n" + 
		"（参见实践 12 ）。\r\n" + 
		"如果有 java.lang.Object 以外的任何 base class 实现了 equals()， 那么就\r\n" + 
		"应该调用 super.equals()（参见实践 13 ）。\r\n" + 
		"在 equals()函数中面对 getClass()和 instanceof 进行取舍时，你要仔细斟酌以\r\n" + 
		"下问题：\r\n" + 
		"如果只允许同一个 class 所产生的对象被视为相等，则通常使用\r\n" + 
		"getClass()（参见实践 12 ）。\r\n" + 
		"只有在不得不「对 derived classes 对象与 base classes 对象进行比较」的\r\n" + 
		"场合中，才使用 instanceof（参见实践 14），而且你应该明白这样做带来\r\n" + 
		"的可能问题和复杂性。\r\n" + 
		"如果使用 instanseof，而且 derived class 和 base class 都实现有 equals() ，\r\n" + 
		"则一定要知道，这种比较不会展现出所谓的「对称相等性」（symmetric\r\n" + 
		"equality ）。");
	}

}
