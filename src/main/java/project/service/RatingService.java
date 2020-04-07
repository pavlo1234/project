package project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.dao.RatingRepository;
import project.domain.Rating;

@Service
public class RatingService {

	@Autowired
	private RatingRepository ratingRepo;
	
	public void save(Rating rating) {
		ratingRepo.save(rating);
	}
	
	public List<Rating> getAllConfirmedByFacultyId(Integer facultyId) {
		return ratingRepo.findAllConfirmedByFacultyId(facultyId);
	}
	
}
