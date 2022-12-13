package com.nissan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbldepartment")
public class Department {

	//instance fields
	@Id                                                     //primary key
	@GeneratedValue(strategy=GenerationType.IDENTITY)       //Auto increment
	private Integer deptId;  //dept_id
	private String deptName; //dept_name
	
	
	//default constructor
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	//parameterized constructor
	public Department(Integer deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}
	//getters and setters


	public Integer getDeptId() {
		return deptId;
	}


	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}


	public String getDeptName() {
		return deptName;
	}


	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}


	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + "]";
	}

	

	
	//override toString();
	
}
