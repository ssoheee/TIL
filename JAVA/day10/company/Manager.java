package company;

public class Manager extends Employee {

	private double incentive;

	public Manager() {
	}

	public Manager(String id, String name, double salary, String dept, double incentive) {
//		super(id, name, salary, dept); // Employee의 컨스트럭터 이용하겠다 -> 다 상속받음
		// this.id = id; -> 안됨 protected로 바꾸면 가능
		// setId(id); -> 가능
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.incentive = incentive;
		this.salary = salary;
	}

	@Override // 함수의 재정의
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

// 	재정의 (Override) -> 상위 클래스에 상속돼있는 것들을 재정의하겠다.
//	@Override
//	public String toString() {
//		return "Manager [getId()=" + getId() + ", getName()=" + getName() + ", getSalary()=" + getSalary()
//				+ ", getDept()=" + getDept() + ", incentive=" + incentive + "]";
//	}

}
