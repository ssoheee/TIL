package company;

public class Manager extends Employee {

	private double incentive;

	public Manager() {
	}

	public Manager(String id, String name, double salary, String dept, double incentive) {
//		super(id, name, salary, dept); // Employee�� ����Ʈ���� �̿��ϰڴ� -> �� ��ӹ���
		// this.id = id; -> �ȵ� protected�� �ٲٸ� ����
		// setId(id); -> ����
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.incentive = incentive;
		this.salary = salary;
	}

	@Override // �Լ��� ������
	public double salaryM() {
		double money = 0;
		money = super.salaryM() + this.incentive;
		return money;
	}

//	@Override
//	public double annSalary() {
//		double money = 0;
//		money = super.salaryM();
//		return money;
//	}

	@Override
	public String toString() {
		return "Manager [id=" + id + ", name=" + name + ", salary=" + salary + ", dept=" + dept + ", incentive="
				+ incentive + "]";
	}

// 	������ (Override) -> ���� Ŭ������ ��ӵ��ִ� �͵��� �������ϰڴ�.
//	@Override
//	public String toString() {
//		return "Manager [getId()=" + getId() + ", getName()=" + getName() + ", getSalary()=" + getSalary()
//				+ ", getDept()=" + getDept() + ", incentive=" + incentive + "]";
//	}

}
