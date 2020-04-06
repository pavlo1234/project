package project.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.dao.FacultyRepository;
import project.domain.Faculty;

@Service
public class FacultyService {
	
	@Autowired
	private FacultyRepository facultyRepo;
	
	public List<Faculty> findAll() {
		return facultyRepo.findAll();
	}
	
	public Faculty findById(int id) {
		return facultyRepo.getOne(id);
	}
	
}
