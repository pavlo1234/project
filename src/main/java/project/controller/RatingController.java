package project.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import project.domain.Abiturient;
import project.domain.Rating;
import project.dto.RatingDto;
import project.service.AbiturientService;
import project.service.FacultyService;
import project.service.RatingService;

@Controller
public class RatingController {

	@Autowired
	private RatingService ratingServ;

	@Autowired
	private FacultyService facultyServ;
	
	@Autowired
	private AbiturientService abiturientServ;

	@GetMapping("/addToRating")
	public String addAbiturientToRating(@RequestParam("abiturientId") Integer id, Model model) {
		Abiturient abiturient = abiturientServ.findById(id);
		Rating rating = new Rating(abiturient.getUsername(), abiturient.getFacultyId(), abiturient.getSumMarks(),
				abiturient.getPassingScoreOfFaculty());
		ratingServ.save(rating);
		return "redirect:/rating?faculty_id=" + abiturient.getFacultyId();
	}

	@GetMapping("/rating")
	public String viewFacultyRating(@RequestParam("faculty_id") Integer facultyId, ModelMap modelMap) {
		List<Rating> ratings = ratingServ.getAllConfirmedByFacultyId(facultyId);
		if (ratings.size() > 0) {
			String facultyName = facultyServ.findById(ratings.get(0).getFacultyId()).getName();
			List<RatingDto> ratingsDto = new ArrayList<>();
			for (Rating rating : ratings) {
				ratingsDto.add(new RatingDto(rating.getUsername(), facultyName));
			}
			modelMap.addAttribute("ratings", ratingsDto);
			modelMap.addAttribute("facultyName", facultyName);
		}
		return "rating";
	}

}
