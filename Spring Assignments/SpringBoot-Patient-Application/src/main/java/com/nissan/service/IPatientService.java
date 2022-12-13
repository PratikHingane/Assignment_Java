package com.nissan.service;

import java.util.List;
import com.nissan.model.Patient;

public interface IPatientService {

	// List All Patients
	List<Patient> listAllPatient();
	
	//get Patient by ID
	Patient searchById (Integer _patientId);
	
	//Add a patient
	Patient addPatient(Patient patient);

	//Update a patient
	Patient updatePatient(Patient patient);
	
	//Delete a patient
	void deletePatient(Integer _patientId);
}
