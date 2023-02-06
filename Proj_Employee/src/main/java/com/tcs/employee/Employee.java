package com.tcs.employee;

public class Employee {
    private int id;
    private String empId;
    private String empName;
    private String address;
    
    
    
    public int getId() {
		return id;
	}


	public Employee(int id, String empId, String empName, String address) {
		super();
		this.id = id;
		this.empId = empId;
		this.empName = empName;
		this.address = address;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEmpId() {
		return empId;
	}


	public void setEmpId(String empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", empId=" + empId + ", empName=" + empName + ", address=" + address + "]";
	}
    
	
    
}
