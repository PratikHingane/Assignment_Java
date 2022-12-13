package com.nissan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.model.Patient;
import com.nissan.service.IPatientService;

@RestController
@RequestMapping("api/")
public class PatientController {

	@Autowired
	IPatientService patientService;
	
	@GetMapping("patients")
	//Get a list of Patients
	public List<Patient> getAllPatient() {
		// TODO Auto-generated method stub
		return patientService.listAllPatient();
	}
	
	//Get a patient by patientID
	@GetMapping("patients/{patientId}")
	public Patient searchById (@PathVariable Integer patientId) {
		return patientService.searchById(patientId);
	}
	
	//add New Patient
	@PostMapping("patients")
	public Patient addNewPatient(@RequestBody Patient _newPatient) {
		return patientService.addPatient(_newPatient);
	}
	
	//Update a Patient
	@PutMapping("patients")
    public Patient updatePatient(@RequestBody Patient patient) {
    		
    		return patientService.updatePatient(patient);
    	}
	
	//Delete a Patient
	@DeleteMapping("patients/{_patientId}")
	public void deletePatient(@PathVariable Integer _patientId) {
		patientService.deletePatient(_patientId);
		
	}
	
}
