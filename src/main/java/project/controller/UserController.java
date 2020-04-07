package project.controller;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import project.domain.PhotoUser;
import project.domain.User;
import project.service.PhotoUserService;
import project.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userServ;
	
	@Autowired
	private PhotoUserService photoUserServ;
	
	@GetMapping("/downloadFile/{fileId}")
	public ResponseEntity<Resource> downlaodFile(@PathVariable String fileId) throws FileNotFoundException {
		PhotoUser photoUser = photoUserServ.getFile(fileId);

		return ResponseEntity.ok().contentType(MediaType.parseMediaType(photoUser.getFileType()))
				.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + photoUser.getFileName() + "\"")
				.body(new ByteArrayResource(photoUser.getData()));
	}
	
	@GetMapping("/register")
	public String register() {
		return "register";
	}

	@PostMapping("/register")
	public String register(@RequestParam("file") MultipartFile file, @ModelAttribute("user") User user) throws IOException {
		PhotoUser photoUser = photoUserServ.storeFile(file);
		user.setPhotoUser(photoUser);
		userServ.save(user);
		return "/login";
	}
	
	@GetMapping("/profile")
	public String profile(ModelMap modelMap) {
		User user = userServ.getCurrentUser();
		modelMap.addAttribute("user", user);
		modelMap.addAttribute("image", photoUserServ.getDownloadUrl(user.getPhotoUser()));
		return "profile";
	}
	
	

}
