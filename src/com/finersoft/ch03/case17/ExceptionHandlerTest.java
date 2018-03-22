/**
 * 
 */
package com.finersoft.ch03.case17;

/**
 * 名称：异常的常用处理 说明： 1. 捕捉并处理它，防止它进一步传播（propagate ）。 2. 捕捉并再次抛出它，这么一来它会被传播给调用端。 3.
 * 捕捉它，然后抛出一个新异常给调用端。 4. 不捕捉这个异常，听任它传播给调用端。
 * 
 * @author Finersoft
 * @date 2018年3月21日
 */
public class ExceptionHandlerTest {

	/**
	 * 这是个错误的示范，谁都不知道发生过异常
	 */
	public static void m1() {
		int a = 10;
		int b = 0;
		int z = 0;
		try {
			z = a / b;
		} catch (Exception e) {
			// 我啥都不做

		}
	}

	/**
	 * 这是个折衷的方案，不知道怎么处理，那至少记录了发生的异常
	 */
	public static void m1WithLog() {
		int a = 10;
		int b = 0;
		int z = 0;
		try {
			z = a / b;
		} catch (Exception e) {
			// 保存异常信息到日志
			System.out.println("- - - - - - - - - -> m1WithLog 发生了异常：" + e);
			LogException(e);
		}
	}

	/**
	 * 异常记录方法：用于记录异常到日志中，方便以后查询。
	 */
	public static void LogException(Exception e) {
		// 假装这儿有二十行代码来记录异常
	}

	/**
	 * 用系统自带的错误日志输出方法
	 */
	public static void m1printStaticTrace() {
		int a = 10;
		int b = 0;
		int z = 0;
		try {
			z = a / b;
		} catch (Exception e) {
			// 系统输出日志信息
			System.out.println("- - - - - - - - - -> m1WithLog 发生了异常：" + e);
			e.printStackTrace(System.err);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		m1();

		m1WithLog();

		m1printStaticTrace();

	}

}
