package com.nissan.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tblpatient")
public class Patient {

	/*
	 * Patient’s Registration with
      - PatientId
      - RegistrationNo
      - PatientName
      - Dob
      - Gender
      - Address
      - PhoneNo   */
	
	// Primary Key PatientID
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer patientId;
	private Integer registrationNo;
	
	@Column(nullable=false)
	private String patientName;
	private LocalDate dateOfBirth;
	private String gender;
	
	@Column(nullable=false)
	private String address;
	
	@Column(nullable=false)
	private String phoneNumber;

	//Default constructor
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	//Parameterized Constructor
	public Patient(Integer patientId, Integer registrationNo, String patientName, LocalDate dateOfBirth, String gender,
			String address, String phoneNumber) {
		super();
		this.patientId = patientId;
		this.registrationNo = registrationNo;
		this.patientName = patientName;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	//Getters and Setters
	public Integer getPatientId() {
		return patientId;
	}

	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}

	public Integer getRegistrationNo() {
		return registrationNo;
	}

	public void setRegistrationNo(Integer registrationNo) {
		this.registrationNo = registrationNo;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	// toString() method
	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", registrationNo=" + registrationNo + ", patientName=" + patientName
				+ ", dateOfBirth=" + dateOfBirth + ", gender=" + gender + ", address=" + address + ", phoneNumber="
				+ phoneNumber + "]";
	}
	
	
}
