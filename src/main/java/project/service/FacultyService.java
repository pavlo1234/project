package project.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.dao.FacultyRepository;
import project.domain.Faculty;

@Service
public class FacultyService {
	
	private Logger log = LoggerFactory.getLogger(AbiturientService.class);
	
	@Autowired
	private FacultyRepository facultyRepo;
	
	public List<Faculty> findAll() {
		log.info("Getting all faculties");
		return facultyRepo.findAll();
	}
	
	public Faculty findById(int id) {
		log.info("Getting faculty with id="+String.valueOf(id));
		return facultyRepo.getOne(id);
	}
	
}
