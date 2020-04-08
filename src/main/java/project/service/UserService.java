package project.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import project.dao.UserRepository;
import project.domain.User;
import project.domain.UserRole;

@Service
public class UserService {
	
	private Logger log = LoggerFactory.getLogger(AbiturientService.class);
	
	@Autowired
	private UserRepository userRep;
	
	@Autowired
    private PasswordEncoder bCryptPasswordEncoder;
	
	public void save(User user) {
		log.info("Saving user");
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setRole(UserRole.ROLE_ABITURIENT);
        userRep.save(user);
	}
	
	public User getCurrentUser() {
		log.info("Getting current user");
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		User user = userRep.findByEmail(auth.getName()).get();
	    return user;
	}
	
}
