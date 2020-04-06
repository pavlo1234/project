package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import project.domain.User;
import project.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userServ;
	
	@GetMapping("/register")
	public String register(Model model) {
		return "register";
	}

	@PostMapping("/register")
	public String register(@ModelAttribute("user") User user) {
		userServ.save(user);
		return "/login";
	}

}
