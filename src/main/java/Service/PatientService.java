package Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Entity.Patient;
import Repository.PatientRepository;
@Service
public class PatientService {

	
	
	
	
	@Autowired
	static
	PatientRepository patientrepository;
	
	public static List<Patient> getAllPatient(){
	List<Patient> patient=new ArrayList<Patient>();
		patientrepository.findAll().forEach(patient1->patient.add(patient1));
		return patient;
		
	}
		public Patient getPatientById(int id)
		{
			return patientrepository.findById(id).get();
		}
	public void update(Patient patient)
	{
		patientrepository.save(patient);
	}
	
	public void deleteById(int id) {
	patientrepository.deleteById(id);
	}
	public void modify(Patient patient,int id) {
		patientrepository.save(patient);
	}
	public Patient getPatientByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
