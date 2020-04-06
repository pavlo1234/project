package project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.dao.AbiturientRepository;
import project.domain.Abiturient;

@Service
public class AbiturientService {
	
	@Autowired
	private AbiturientRepository abiturientRepo;
	
	public void save(Abiturient abiturient) {
		abiturientRepo.save(abiturient);
	}
	
	public List<Abiturient> findAll() {
		return abiturientRepo.findAll();
	}
	
}
