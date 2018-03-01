package com.finersoft.ch01.case05;


/**
 * 名称：雇员类
 * 说明：
 * @author Finersoft
 * @date 2018年3月1日
 */
interface Employee {
	/**
	 * 获得员工薪水
	 * 
	 * @return int 薪水
	 */
	public int salary();
}

/**
 * 名称：经理类
 * 说明：没有奖金的经理不是好经理
 * @author Finersoft
 * @date 2018年3月1日
 */
class Manager implements Employee {
	public static final int MANAGER_SALARY = 4000;

	/**
	 * 
	 * @return int 薪水
	 */
	@Override
	public int salary() {
		return MANAGER_SALARY;
	}

}

/**
 * 名称：程序猴类
 * 说明：有工资有奖金的猴比经理福利好
 * @author Finersoft
 * @date 2018年3月1日
 */
class Programmer implements Employee {
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
	public int bonus() {
		return PROGRAMMER_BONUS;
	}

}


/**
 * 名称：算劳动所得类
 * 说明：薪水+奖金+。。。
 * @author Finersoft
 * @date 2018年3月1日
 */
public class Payroll {

	/**
	 * 计算薪水
	 * 
	 * @param employee
	 *            员工实体
	 * @return int 员工的薪水
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
