package com.nissan.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.nissan.model.Patient;

@Repository
public interface IPatientDAO extends JpaRepositoryImplementation<Patient, Integer> {

	//FindAll()
		//save
		//deleteById()
		//custom methods  --JPQL---HQL
		@Query("from Patient where patientId=?1")
		public Patient searchById(Integer _patientId);
}
