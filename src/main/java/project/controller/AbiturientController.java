package project.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import project.domain.Abiturient;
import project.dto.AbiturientDto;
import project.service.AbiturientService;
import project.service.FacultyService;

@Controller
public class AbiturientController {
	
	@Autowired
	private AbiturientService abiturientServ;
	
	@Autowired
	private FacultyService facultyServ;
	
	@GetMapping("/addAbiturient")
	public String addAbiturient(@ModelAttribute("abiturient") Abiturient abiturient) {
		abiturientServ.save(abiturient);
		return "/abiturients";
	}
	
	@GetMapping("/abiturients")
	public String getAbiturients(ModelMap modelMap) {
		List<AbiturientDto> abiturientsDto = new ArrayList<>();
		List<Abiturient> abiturients = abiturientServ.findAll();
		for(Abiturient a : abiturients) {
	        String facultyName = facultyServ.findById(a.getFacultyId()).getName();
			abiturientsDto.add(new AbiturientDto(a.getId(), a.getUsername(), facultyName, a.getSumMarks(), a.getPassingScoreOfFaculty()));
		}
		modelMap.addAttribute("abiturients", abiturientsDto);
		return "abiturients";
	}
	
}
