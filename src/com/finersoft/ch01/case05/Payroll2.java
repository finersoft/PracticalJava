package com.finersoft.ch01.case05;


/**
 * ���ƣ���дһ����Ա��
 * ˵��������ﲻ��ÿ�����Ͷ����õ�ʱ��ȥ�ж�һ����ʲôְλ�ģ�ֱ������нˮ+���𣬼򵥴ֱ�
 * @author Finersoft
 * @date 2018��3��1��
 */
interface Employee2 {
	/**
	 * ����нˮ
	 * @return int нˮ
	 */
	public int salary();

	/**
	 * ���㽱��
	 * 
	 * @return int ����
	 */
	public int bonus();
}

/**
 * ���ƣ�������
 * ˵����û�н��𣬵���Ϊ��ӭ���н����ͬ�£�����һ��Ϊ0Ԫ�Ľ������ԣ����Ǹ���ù����
 * @author Finersoft
 * @date 2018��3��1��
 */
class Manager2 implements Employee2 {
	public static final int MANAGER_SALARY = 4000;
	public static final int MANAGER_BONUS = 0;

	/**
	 * 
	 * @return int нˮ
	 */
	@Override
	public int salary() {
		return MANAGER_SALARY;
	}

	@Override
	public int bonus() {
		return MANAGER_BONUS;
	}

}

/**
 * ���ƣ��������
 * ˵��������ﲻֻ�н��������޸��˹�Ա�Ķ��壬�����еĹ�Ա���Ͷ����ö���нˮ+����
 * Ƥ��һ���㿪���ˣ��Ҿ���������ᱻ��úܲ�
 * @author Finersoft
 * @date 2018��3��1��
 */
class Programmer2 implements Employee2 {
	public static final int PROGRAMMER_SALARY = 5000;
	public static final int PROGRAMMER_BONUS = 10000;

	/**
	 * @return int нˮ
	 */
	@Override
	public int salary() {
		return PROGRAMMER_SALARY;
	}

	/**
	 * ���㽱��
	 * 
	 * @return int ����
	 */
	@Override
	public int bonus() {
		return PROGRAMMER_BONUS;
	}

}


/**
 * ���ƣ������жϹ�Ա���;Ϳ��Լ򵥴ֱ�����н�����
 * ˵���������Ϊ����дһ����룬������Ա��н���嶼�޸��ˣ��������˶��н���������룬��Ȼ�ö���û�н���
 * @author Finersoft
 * @date 2018��3��1��
 */
public class Payroll2 {

	/**
	 * ����нˮ
	 * 
	 * @param employee
	 *            Ա��ʵ��
	 * @return int Ա����нˮ
	 */
	public int calcPayroll(Employee2 employee) {
		// calculate money with salary and bonus .
		// no instance check needed
		return employee.salary() + employee.bonus();
	}

	public static void main(String[] args) {
		Payroll2 pr = new Payroll2();
		Programmer2 prg = new Programmer2();
		Manager2 mgr = new Manager2();

		System.out.println("Payroll for Programmer is " + pr.calcPayroll(prg));
		System.out.println("Payroll for Manager is " + pr.calcPayroll(mgr));
	}

}
