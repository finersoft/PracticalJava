package com.finersoft.ch01.case05;

/**
 * 
 * @author Finersoft
 *
 */
interface Employee2 {
	/**
	 * 计算薪水
	 * @return int 薪水
	 */
	public int salary();

	/**
	 * 计算奖金
	 * 
	 * @return int 奖金
	 */
	public int bonus();
}

class Manager2 implements Employee2 {
	public static final int MANAGER_SALARY = 4000;
	public static final int MANAGER_BONUS = 0;

	/**
	 * 
	 * @return int 薪水
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

class Programmer2 implements Employee2 {
	public static final int PROGRAMMER_SALARY = 5000;
	public static final int PROGRAMMER_BONUS = 10000;

	/**
	 * @return int 薪水
	 */
	@Override
	public int salary() {
		return PROGRAMMER_SALARY;
	}

	/**
	 * 计算奖金
	 * 
	 * @return int 奖金
	 */
	@Override
	public int bonus() {
		return PROGRAMMER_BONUS;
	}

}

/**
 * 
 * @author Finersoft
 *
 */
public class Payroll2 {

	/**
	 * 计算薪水
	 * 
	 * @param employee
	 *            员工实体
	 * @return int 员工的薪水
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
