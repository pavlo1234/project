package project.service;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.dao.AbiturientRepository;
import project.domain.Abiturient;

@Service
public class AbiturientService {
	
	private Logger log = LoggerFactory.getLogger(AbiturientService.class);
	
	@Autowired
	private AbiturientRepository abiturientRepo;
	
	public void save(Abiturient abiturient) {
		log.info("Saving abiturient");
		abiturientRepo.save(abiturient);
	}
	
	public List<Abiturient> findAll() {
		log.info("Getting all abiturients");
		return abiturientRepo.findAll();
	}

	public Abiturient findById(Integer id) {
		log.info("Getting abiturient with id="+id.toString());
		return abiturientRepo.getOne(id);
	}
	
}
