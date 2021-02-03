package Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Entity.Patient;
import Service.PatientService;


@RestController
public class PatientController {
	
	@Autowired
	
	PatientService patientservice;
	@GetMapping("/patients")  
	private List<Patient> getAllPatient()   
	{  
	return PatientService.getAllPatient();  
	}  
	
	@GetMapping("/patient/{id}")  
	private Patient getPatient(@PathVariable int id)   
	{  
	return patientservice.getPatientById(id);  
	}  
	
	@DeleteMapping("/patient/{id}")  
	private void deleteBook(@PathVariable int id)   
	{  
	patientservice.deleteById(id);  
	}  
	
	@PostMapping("/patient")  
	private int saveBook(@RequestBody Patient patient)   
	{  
	patientservice.update(patient); 
	return patient.getPatientId();  
	}  

	@PutMapping("/patient")  
	private Patient update(@RequestBody Patient patient)   
	{  
	patientservice.update(patient);  
	return patient;  
	}  
	
	

}