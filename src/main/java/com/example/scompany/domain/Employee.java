package com.example.scompany.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class Employee {
@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String ename;
    private int mobile;
    private int salary;
    private String address;
	public Employee() {
		
	}
	
	public Employee(Long id, String ename, int mobile, int salary, String adrress) {
		super();
		this.id = id;
		this.ename = ename;
		this.mobile = mobile;
		this.salary = salary;
		//this.address = address;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}