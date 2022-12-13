package com.nissan.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.dao.IPatientDAO;
import com.nissan.model.Patient;

@Service
public class PatientServiceImplementation implements IPatientService {

	@Autowired
	IPatientDAO patientDAO; //creating objects of patientDAO
	
	
	@Override
	public List<Patient> listAllPatient() {
		// TODO Auto-generated method stub
		return patientDAO.findAll();
	}

	@Override
	public Patient searchById(Integer _patientId) {
		// TODO Auto-generated method stub
		
		Patient patient = patientDAO.searchById(_patientId);
		if(_patientId == (patient.getPatientId()))
		{
			return patient;
		}else {
			return null;
		}
		
	}

	@Override
	@Transactional
	public Patient addPatient(Patient patient) {
		// TODO Auto-generated method stub
		return patientDAO.save(patient);
	}

	//Update patient
	@Transactional
    public Patient updatePatient (Patient patient) {
		
    	Patient searchPatient = patientDAO.searchById(patient.getPatientId());
    	if(searchPatient == null) {
    		return null;
    	}else {
    		searchPatient.setRegistrationNo(patient.getRegistrationNo());
    		searchPatient.setPatientName(patient.getPatientName());
    		searchPatient.setDateOfBirth(patient.getDateOfBirth());
    		searchPatient.setGender(patient.getGender());
    		searchPatient.setAddress(patient.getAddress());
    		searchPatient.setPhoneNumber(patient.getPhoneNumber());
    		
    		
    		
    		return patientDAO.save(searchPatient);
    	}
	}

	@Override
	public void deletePatient(Integer _patientId) {
		// TODO Auto-generated method stub
		Patient patientDeleted = patientDAO.getById(_patientId);
		patientDAO.delete(patientDeleted);
		
	}
}
