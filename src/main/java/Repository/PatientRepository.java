package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer> {

//	Patient findByName(String name);

	
	
	

}
