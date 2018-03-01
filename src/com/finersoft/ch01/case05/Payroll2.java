package com.finersoft.ch01.case05;


/**
 * 名称：重写一个雇员类
 * 说明：程序猴不想每次算劳动所得的时候还去判断一下是什么职位的，直接让他薪水+奖金，简单粗暴
 * @author Finersoft
 * @date 2018年3月1日
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

/**
 * 名称：经理类
 * 说明：没有奖金，但是为了迎合有奖金的同事，而有一个为0元的奖金属性，这是个倒霉孩子
 * @author Finersoft
 * @date 2018年3月1日
 */
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

/**
 * 名称：程序猴类
 * 说明：程序猴不只有奖金，他还修改了雇员的定义，让所有的雇员的劳动所得都有薪水+奖金
 * 皮这一下你开心了？我觉得这程序猴会被打得很惨
 * @author Finersoft
 * @date 2018年3月1日
 */
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
 * 名称：不用判断雇员类型就可以简单粗暴计算薪金的类
 * 说明：程序猴为了少写一句代码，把整个员工薪金定义都修改了，让所有人都有奖金这个收入，虽然好多人没有奖金
 * @author Finersoft
 * @date 2018年3月1日
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
