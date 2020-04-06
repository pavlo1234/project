package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import project.service.FacultyService;

@Controller
public class FacultyController {

	@Autowired
	private FacultyService facultyServ;

	@GetMapping("/faculties")
	public String getFaculties(Model model) {
		model.addAttribute("faculties", facultyServ.findAll());
		return "faculties";
	}
	
	@GetMapping("/faculty_register")
	public String getFacultyRegister(@RequestParam int id, Model model) {
		model.addAttribute("faculty", facultyServ.findById(id));
		return "faculty_register";
	}
	
}
