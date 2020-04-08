package project.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.dao.RatingRepository;
import project.domain.Rating;

@Service
public class RatingService {
	
	private Logger log = LoggerFactory.getLogger(AbiturientService.class);

	@Autowired
	private RatingRepository ratingRepo;
	
	public void save(Rating rating) {
		log.info("Saving rating");
		ratingRepo.save(rating);
	}
	
	public List<Rating> getAllConfirmedByFacultyId(Integer facultyId) {
		log.info("Getting all confirmed abiturients of faculty with id=" + facultyId.toString());
		return ratingRepo.findAllConfirmedByFacultyId(facultyId);
	}
	
}
