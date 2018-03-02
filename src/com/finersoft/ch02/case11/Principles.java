/**
 * 
 */
package com.finersoft.ch02.case11;

/**
 * 名称：关于equals方法设计的原则。
 * 说明：
 * @author Finersoft
 * @date 2018年3月2日
 */
public class Principles {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	   System.out.println("当你为某个 class 设计和实现 equals()时，应该考虑几个问题。首先，你必\r\n" + 
	   		"须仔细考量 class 究竟何时需要提供 equals()。\r\n" + 
	   		"当[class object 相等与否]的检验工作超过了[object reference 之间的单纯比\r\n" + 
	   		"较]时，该 class 就应当提供一个 equals()。从另外一个角度说，如果占用不\r\n" + 
	   		"同内存空间的两个对象被视为逻辑上相同，那么这个 class 就应当提供\r\n" + 
	   		"equals()。\r\n" + 
	   		"实践 10 展示了好几种 Golfball class 的 equals()实现方式。这些 equals()实现\r\n" + 
	   		"法尽管对当时的设计和实现而言是恰当的，但并不代表全部做法。\r\n" + 
	   		"在你撰写 equals()之前，必须做几项设计方面的重要决定。你想要让哪些\r\n" + 
	   		"classes 的对象与你的 class 对象进行比较？你只打算让相同 class 的对象之\r\n" + 
	   		"间进行比较吗？或者你允许 derived class 对象和其 base class 对象比较？接\r\n" + 
	   		"下来你必须决定如何实现 equals()，使它得意提供并执行上述语义。\r\n" + 
	   		"你对上述问题的回答，将对 equals()的实现方式和 class 相等性语义产生直\r\n" + 
	   		"接影响。实践 12~实践 15 讨论了各种选择、各种分支后果，以及各种实现\r\n" + 
	   		"方式。");

	}

}
