package com.finersoft.ch01.case05;

/**
 * 
 * @author Finersoft
 *
 */
interface Employee {
	/**
	 * ���Ա��нˮ
	 * 
	 * @return int нˮ
	 */
	public int salary();
}

class Manager implements Employee {
	public static final int MANAGER_SALARY = 4000;

	/**
	 * 
	 * @return int нˮ
	 */
	@Override
	public int salary() {
		return MANAGER_SALARY;
	}

}

class Programmer implements Employee {
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
	public int bonus() {
		return PROGRAMMER_BONUS;
	}

}

/**
 * 
 * @author Finersoft
 *
 */
public class Payroll {

	/**
	 * ����нˮ
	 * 
	 * @param employee
	 *            Ա��ʵ��
	 * @return int Ա����нˮ
	 */
	public int calcPayroll(Employee employee) {
		int money = employee.salary();
		if (employee instanceof Programmer) {
			// Calculate the bonus
			money += ((Programmer) employee).bonus();
		}
		return money;
	}

	public static void main(String[] args) {
		Payroll pr = new Payroll();
		Programmer prg = new Programmer();
		Manager mgr = new Manager();

		System.out.println("Payroll for Programmer is " + pr.calcPayroll(prg));
		System.out.println("Payroll for Manager is " + pr.calcPayroll(mgr));
	}

}
