package com.mongodb.data;

import org.springframework.data.annotation.Id;

public class EmployeeDomainModel {
@Id
private String employeeId;
private String employeeName;
private String employeeDepartment;
private String employeeDesignation;
private String employeeSalary;
public EmployeeDomainModel() {
	super();
}
public EmployeeDomainModel(String employeeId, String employeeName, String employeeDepartment,
		String employeeDesignation, String employeeSalary) {
	super();
	this.employeeId = employeeId;
	this.employeeName = employeeName;
	this.employeeDepartment = employeeDepartment;
	this.employeeDesignation = employeeDesignation;
	this.employeeSalary = employeeSalary;
}
public String getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(String employeeId) {
	this.employeeId = employeeId;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public String getEmployeeDepartment() {
	return employeeDepartment;
}
public void setEmployeeDepartment(String employeeDepartment) {
	this.employeeDepartment = employeeDepartment;
}
public String getEmployeeDesignation() {
	return employeeDesignation;
}
public void setEmployeeDesignation(String employeeDesignation) {
	this.employeeDesignation = employeeDesignation;
}
public String getEmployeeSalary() {
	return employeeSalary;
}
public void setEmployeeSalary(String employeeSalary) {
	this.employeeSalary = employeeSalary;
}
@Override
public String toString() {
	return "EmployeeDomainModel [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeDepartment="
			+ employeeDepartment + ", employeeDesignation=" + employeeDesignation + ", employeeSalary=" + employeeSalary
			+ "]";
}

}
