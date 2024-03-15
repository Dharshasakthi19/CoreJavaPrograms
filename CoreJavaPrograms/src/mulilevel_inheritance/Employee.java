//Program to define base class Employee
package mulilevel_inheritance;

import java.util.Date;

public class Employee extends Person {
	private String deptName;
	private double baseSalary;
	


	public Employee(String name, long contactNo, Date dateOfBirth, String deptName, double baseSalary) {
		super(name, contactNo, dateOfBirth);//call person class constructor
		this.deptName = deptName;
		this.baseSalary = baseSalary;
	}



	public String getDeptName() {
		return deptName;
	}



	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}



	public double getBaseSalary() {
		return baseSalary;
	}



	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}



	@Override
	public String toString() {
		return "Employee ["+super.toString()+"deptName=" + deptName + ", baseSalary=" + baseSalary + "]";
	}
}
