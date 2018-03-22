/**
 * 
 */
package com.finersoft.ch03.case17;

/**
 * ���ƣ��쳣�ĳ��ô��� ˵���� 1. ��׽������������ֹ����һ��������propagate ���� 2. ��׽���ٴ��׳�������ôһ�����ᱻ���������öˡ� 3.
 * ��׽����Ȼ���׳�һ�����쳣�����öˡ� 4. ����׽����쳣�����������������öˡ�
 * 
 * @author Finersoft
 * @date 2018��3��21��
 */
public class ExceptionHandlerTest {

	/**
	 * ���Ǹ������ʾ����˭����֪���������쳣
	 */
	public static void m1() {
		int a = 10;
		int b = 0;
		int z = 0;
		try {
			z = a / b;
		} catch (Exception e) {
			// ��ɶ������

		}
	}

	/**
	 * ���Ǹ����Եķ�������֪����ô���������ټ�¼�˷������쳣
	 */
	public static void m1WithLog() {
		int a = 10;
		int b = 0;
		int z = 0;
		try {
			z = a / b;
		} catch (Exception e) {
			// �����쳣��Ϣ����־
			System.out.println("- - - - - - - - - -> m1WithLog �������쳣��" + e);
			LogException(e);
		}
	}

	/**
	 * �쳣��¼���������ڼ�¼�쳣����־�У������Ժ��ѯ��
	 */
	public static void LogException(Exception e) {
		// ��װ����ж�ʮ�д�������¼�쳣
	}

	/**
	 * ��ϵͳ�Դ��Ĵ�����־�������
	 */
	public static void m1printStaticTrace() {
		int a = 10;
		int b = 0;
		int z = 0;
		try {
			z = a / b;
		} catch (Exception e) {
			// ϵͳ�����־��Ϣ
			System.out.println("- - - - - - - - - -> m1WithLog �������쳣��" + e);
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
